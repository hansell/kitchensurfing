package com.kitchensurfing.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kitchensurfing.po.User;

@Controller("usercontrol")
@RequestMapping("/usercontrol")
public class UserControl {
   
	@RequestMapping("/test.do")
	@ResponseBody
	public User addUser(User user)
	{
		User userdata=new User("1","2");
	    return userdata;	
	}
	
	
}
