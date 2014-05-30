package com.kitchensurfing.control;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/menus")
public class MenuController implements Serializable {

	private static final long serialVersionUID = 1L;
	@RequestMapping(value="/menu-{chefId}",method=RequestMethod.GET)
    public ModelAndView getStarted(){
    	
    	return null;
    }
}
