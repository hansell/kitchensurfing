package com.kitchensurfing.control;

import java.io.IOException;
import java.io.Serializable;







import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kitchensurfing.po.User;


@Controller
@RequestMapping("/user")
public class UserControl implements Serializable{
   
	private static final Logger LOG=Logger.getLogger(UserControl.class);
	private static final long serialVersionUID = 1L;
   
	private UserControl(){
		
	}
	 /** 
     * 进入登陆页面 http://localhost:8080/user/login 模拟 
     *  
     * @return 
     * @throws IOException 
     */  
    @RequestMapping(value = "/login.do", method = RequestMethod.GET)  
    public String initLogin(HttpServletResponse response) throws IOException {  
  
        response.setContentType("text/html;charset=utf-8");  
        response.getWriter().println("进入登陆页面");  
        response.flushBuffer();  
        return null;  
  
    }  
	@RequestMapping(value="/welcome" ,method = RequestMethod.GET)
	public ModelAndView helloWorld(){
		 
		ModelAndView model = new ModelAndView("index");
		model.addObject("msg", "hello world");
 
		return model;
	}
	@RequestMapping("/test.do")
	@ResponseBody
	public User addUser(User user)
	{
		User userdata=new User("1","2");
	    return userdata;	
	}
	
	
}
