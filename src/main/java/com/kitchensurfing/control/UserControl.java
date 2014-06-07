package com.kitchensurfing.control;

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

import com.kitchensurfing.common.AppConstants;
import com.kitchensurfing.common.MD5MessageDigest;
import com.kitchensurfing.config.util.SendMailUtil;
import com.kitchensurfing.iservice.IUserService;
import com.kitchensurfing.po.User;
import com.kitchensurfing.serviceimpl.UserService;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;

@Controller
@RequestMapping("/usercontrol")
public class UserControl implements Serializable{

	private static final Logger logger=Logger.getLogger(UserControl.class);
	private static final long serialVersionUID = 1L;

	@Autowired
	private IUserService userService;
	private UserControl(){

	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String logIn(){
		return "login";
	}
	@RequestMapping(value="/logout" ,method = RequestMethod.GET)
	public String logOut(HttpServletRequest req,HttpServletResponse res){
		User user=(User) req.getSession().getAttribute(AppConstants.SESSION_USER_STRING);
		logger.info(user.getAccount()+"hava log out of our kitchensurfing. ");
		req.getSession().removeAttribute(AppConstants.SESSION_USER_STRING);
		return "redirect:/shanghai";
	}
	@RequestMapping(value="/login" ,method = RequestMethod.POST)
	public String logined(HttpServletRequest request,
			@RequestParam(value="account" ,required=true) String account,
			@RequestParam(value="password",required=true) String password){
		String path="";
		try {
			boolean isValidUser=userService.logIn(account, MD5MessageDigest.Md5Encode(password));
			if(isValidUser){
				User user=userService.getUser(account);
				request.getSession().setAttribute(AppConstants.SESSION_USER_STRING, user);
				logger.info(user.getAccount()+"hava signed in successfully,Congraturations! we are you best kitchen helper ");
				request.getSession().setAttribute("flag", "K+zCqTwUgEv0PZIDLJHrhstaCW/RIDyy2h2co6maUSY=");
				path="redirect:/shanghai";
			}
			else{
				path="login";
				request.setAttribute("msg", "none");
			}
		}catch(NullPointerException e1){
			e1.printStackTrace();
			logger.error(e1.getMessage());
		}
		catch (NoSuchAlgorithmException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			logger.error(e2.getMessage());
		}catch(Exception e){
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return path;
	}
	
	@RequestMapping(value="/account",method=RequestMethod.GET)  
	public String Setting(HttpServletRequest req,HttpServletResponse res) {
		User user=(User) req.getSession().getAttribute(AppConstants.SESSION_USER_STRING);
		if(user==null){
			logger.warn("Sorry,you operation has encountered a big problem");
			return "redirect:/shanghai";
		}
		else
			return "settings";
	}
	@RequestMapping(value="/settings",method=RequestMethod.GET)  
	public String Account(HttpServletRequest req,HttpServletResponse res) {
		User user=(User) req.getSession().getAttribute(AppConstants.SESSION_USER_STRING);
		if(user==null){
			logger.warn("Sorry,you operation has encountered a big problem");
			return "redirect:/shanghai";
		}
		else
			return "account";
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

		logger.debug("用户名===>" + req.getParameter("username"));
		logger.debug("密码===>" + req.getParameter("password"));
		logger.debug("邮箱===>" + req.getParameter("email"));
		// 获取激活的url
		String link = SendMailUtil.sendRegisterToUser(req);
		ModelAndView model = new ModelAndView("tobeactive");
		model.addObject("username", req.getParameter("username"));
		return model;

	}
}
