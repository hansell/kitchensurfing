package com.kitchensurfing.control;

import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kitchensurfing.iservice.IChefService;
import com.kitchensurfing.iservice.ICourseService;
import com.kitchensurfing.iservice.IReviewService;
import com.kitchensurfing.po.Chef;
import com.kitchensurfing.po.Course;

@Controller
@RequestMapping("/menus")
public class MenuController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private IChefService chefService;
	@Autowired
	private IReviewService reviewService;
	@Autowired
	private ICourseService courseService;
	public MenuController(){
		
	}
	@RequestMapping(value="/menu-{checkString}",method=RequestMethod.GET)
	public String viewChefs(HttpServletRequest request,HttpServletResponse response){
		String path=(String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
		String bestMatchPattern= (String) request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
		AntPathMatcher apm = new AntPathMatcher();
		String finalPath = apm.extractPathWithinPattern(bestMatchPattern, path);
		String checkString="529d5a826325f3a8b7000035";
		String add= (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
		String chefId="2";
		int _chefId=Integer.parseInt(chefId);
		//note this is the chefId or chefName
		//assume the chefId is 2
		if(checkString.equals("529d5a826325f3a8b7000035")){
			Chef chef=chefService.getChef(_chefId);
			List<Course> list=courseService.getList(_chefId);
			int count=reviewService.getCounts(_chefId);
			request.setAttribute("reviewCount", count);
			request.setAttribute("chef", chef);
			request.setAttribute("list", list);
			System.out.println("------"+path+bestMatchPattern+"add"+add);
			return "chefintro";
		}
		else return "noResource";
	}
}
