package com.kitchensurfing.control;

import java.io.IOException;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kitchensurfing.common.MD5MessageDigest;
import com.kitchensurfing.config.util.SendMailUtil;
import com.kitchensurfing.iservice.IUserService;
import com.kitchensurfing.po.User;
import com.kitchensurfing.serviceimpl.UserService;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;

@Controller
public class UserControl implements Serializable{

	private static final Logger LOG=Logger.getLogger(UserControl.class);
	private static final long serialVersionUID = 1L;

	@Autowired
	IUserService userService;
	private UserControl(){

	}
	@RequestMapping(value="/login" ,method = RequestMethod.GET)
	public String login(){
		System.out.println("here");
		return "login";
	}
	@RequestMapping(value="/logout" ,method = RequestMethod.GET)
	public String logOut(){
		return "logout";
	}
	@RequestMapping(value="/login" ,method = RequestMethod.POST)
	//@ResponseBody
	public String logined(HttpServletRequest request,
			@RequestParam(value="account" ,required=true) String account,
			@RequestParam(value="password",required=true) String userPassword){
		String isValidUserS="login";
		try {
			boolean isValidUser=userService.logIn(account, MD5MessageDigest.Md5Encode(userPassword));
			if(isValidUser){
				
				isValidUserS="redirect:homepage.jsp";
			}
			else{
				request.setAttribute("msg", "none");
			}
		}catch(NullPointerException e1){
			e1.printStackTrace();
			LOG.info(e1.getMessage());
		}
		catch (NoSuchAlgorithmException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			LOG.info(e2.getMessage());
		}catch(Exception e){
			e.printStackTrace();
			LOG.info(e.getMessage());
		}
		return isValidUserS;
	}
	//@ResponseBody
	@RequestMapping("/tests.do")
	@ResponseBody
	public String printUser()
	{
		return "hello world";	
	}
	@RequestMapping(value="/loginsss",method=RequestMethod.POST)  
	public void loginPost() {

	}
	@RequestMapping("/zh")
	public String zh(){
		return "KitchenSurfing";
	}
	@RequestMapping("/activeuser.do")
	public String activeuser(HttpServletRequest req) {

		User user;
		try {
			user = userService.addUser(req);
			if (null != user)
				req.getSession().setAttribute("user", user);
			// 调到登陆主界面
			return "homepage";
		} catch (Base64DecodingException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.setAttribute("remindmsg", "激活邮件已超期,请重新注册!!!");
		return "ksremind";
	}
	// 注册用户
	@RequestMapping("/registeruser.do")
	public ModelAndView registerUser(HttpServletRequest req) {

		LOG.debug("用户名===>" + req.getParameter("username"));
		LOG.debug("密码===>" + req.getParameter("password"));
		LOG.debug("邮箱===>" + req.getParameter("email"));
		// 获取激活的url
		String link = SendMailUtil.sendRegisterToUser(req);
		ModelAndView model = new ModelAndView("tobeactive");
		model.addObject("username", req.getParameter("username"));
		return model;

	}
}
