package com.kitchensurfing.control;

import java.io.Serializable;
import java.util.List;
import java.util.regex.PatternSyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kitchensurfing.iservice.IChefService;
import com.kitchensurfing.iservice.ICourseService;
import com.kitchensurfing.iservice.ICuisineService;
import com.kitchensurfing.iservice.IMenuService;
import com.kitchensurfing.iservice.IReviewService;
import com.kitchensurfing.iservice.IStyleService;
import com.kitchensurfing.po.Chef;
import com.kitchensurfing.po.Course;
import com.kitchensurfing.po.Cuisine;
import com.kitchensurfing.po.Menu;

@Controller
@RequestMapping("/menus")
public class MenuController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private IChefService chefService;
	@Autowired
	private IReviewService reviewService;
	@Autowired
	private IMenuService menuHelper;
	@Autowired
	private ICuisineService cuisineService;
	@Autowired
	private IStyleService styleHelper;
	public MenuController(){

	}
	@RequestMapping(value="/{queryString}",method=RequestMethod.GET)
	public String viewChefs(HttpServletRequest request,HttpServletResponse response,
			@PathVariable("queryString") String params){
		try{
			String[] datas=params.split("-");
			String checkString="529d5a826325f3a8b7000035";
			String chefId="2";
			int _chefId=Integer.parseInt(chefId);
			//note this is the chefId or chefName
			//assume the chefId is 2
			if(checkString.equals("529d5a826325f3a8b7000035")){
				Chef chef=chefService.getChef(_chefId);
				List<Menu> list=menuHelper.gets(_chefId);
				int count=reviewService.getCounts(_chefId);
				List<Cuisine> cuisines=cuisineService.getCuisine(_chefId);
				request.setAttribute("reviewCount", count);
				request.setAttribute("chef", chef);
				request.setAttribute("list", list);
				
				System.out.println("------"+params);
				return "chefintro";
			}
			else return "noResource";
		}catch(PatternSyntaxException e){
			
		}
		return null;
	}
}
