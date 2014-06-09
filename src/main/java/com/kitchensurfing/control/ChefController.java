package com.kitchensurfing.control;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kitchensurfing.common.AppConstants;
import com.kitchensurfing.iservice.IChefService;
import com.kitchensurfing.po.Chef;
import com.kitchensurfing.po.User;
import com.kitchensurfing.util.ParamUtils;

@Controller
@RequestMapping("/chef")
public class ChefController implements Serializable {
    
	private static final Logger log=Logger.getLogger(UserControl.class);
	private ChefController(){
		
	}
	@Autowired
	private IChefService chefser;
	private static final long serialVersionUID = 5326057655718052711L;
	@RequestMapping(value="/chefs", method=RequestMethod.GET)
    public String chefs(){
		log.info("");
    	return "chefs";
    }
	@RequestMapping(value="/joinUs",method=RequestMethod.POST)
	@ResponseBody
	public String chefsLogin(HttpServletRequest request,HttpServletResponse response,
			String email,String name){
		boolean isValidChef=false;
		Chef chef=chefser.getChef(email, name);
		if(chef==null){
			isValidChef=true;
		}
		return ""+email+name;
	}
	
	//返回厨师的基础页面
	@RequestMapping("/chefBase.view")
	public ModelAndView chefBase(HttpServletRequest req)
	{
		ModelAndView  mv=new ModelAndView("/chefview/chefbase");
		ParamUtils.getRequestParamMap(req);
	  	User user=(User)req.getSession().getAttribute(AppConstants.SESSION_USER_STRING);
	  	Chef chef=this.chefser.getChefByUserid(user.getUserId());
	  	mv.addObject("chef", chef);
	    return mv;
		
	}
	//返回厨师的基础页面
	@RequestMapping("/chefExprerience.view")
	public String chefExprerience()
	{
		
		return "/chefview/chefexprerience";
		
	}
	//作息页面设置
	@RequestMapping("/chefLogistics.view")
	public String chefLogistics()
	{
		
		return "/chefview/cheflogistics";
		
	}
	//图片上传页面设置
	@RequestMapping("/chefImage.view")
	public String chefImage()
	{
		
		return "/chefview/chefimage";
		
	}
	//添加菜单
	@RequestMapping("/chefMenus.view")
	public String chefMenus()
	{
		
		return "/chefview/chefmenus";
		
	}
	
	//添加用户个人基本信息
	@RequestMapping("/chefBaseAdd.model")
	public ModelAndView chefBaseAdd(HttpServletRequest req)
	{
		ModelAndView  mv=new ModelAndView("/chefview/chefbase");
		Chef chef=this.chefser.updateChefBase(req);
	    System.out.println(chef.getUserid());
		mv.addObject("chef", chef);
		mv.addObject("msg","success");
		return mv;
	}

	
}
