package com.kitchensurfing.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.InvalidMediaTypeException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kitchensurfing.common.AppConstants;
import com.kitchensurfing.po.User;
import com.kitchensurfing.serviceimpl.UserService;


public class IndexController {
	public static final String PAGE_INDEX = "index.html";
	public static final String PAGE_SHOW = "show";
	private static final Logger LOG=Logger.getLogger(IndexController.class);
	/** 
	 *  http://localhost:8080/KitchenSurfing/shanghai 
	 *  
	 * @return s
	 * @throws IOException 
	 */  
	@RequestMapping(value = "/shanghai", method = RequestMethod.GET)  
	public String getShanghai(HttpServletRequest request) throws IOException {  
		User user=(User) request.getSession().getAttribute(AppConstants.SESSION_USER_STRING);
		if(user==null)
			return "redirect:/pages/"+PAGE_INDEX;
		else
			return "homepage";
	}  
	@RequestMapping("/{id}")  
	public ModelAndView view(@PathVariable("id") int id, HttpServletRequest req) {  
		User user = new User();  
		user.setUserId(id);  
		user.setUsername("zhang");  

		ModelAndView mv = new ModelAndView();  
		mv.addObject("user", user);  
		mv.setViewName("user/view");  
		return mv;  
	}  

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView(PAGE_INDEX, "signupForm", new User());
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(Model model, @Validated User signupForm, BindingResult result) {

		String returnPage = PAGE_INDEX;

		if (!result.hasErrors()) {
			try {
				// model.addAttribute("signupForm", sampleService.toString());
				returnPage = PAGE_SHOW;
			} catch (InvalidMediaTypeException e) {
				model.addAttribute("page_error", e.getMessage());
			}
		}
		return returnPage;
	}

	@RequestMapping(value = "/security-error", method = RequestMethod.GET)
	public String securityError(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("page_error", "You do have have permission to do that!");
		return "redirect:/";
	}
}
