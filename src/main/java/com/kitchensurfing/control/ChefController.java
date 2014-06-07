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

import com.kitchensurfing.iservice.IChefService;
import com.kitchensurfing.po.Chef;

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
	public String chefBase()
	{
		
	   return "chefbase";
		
	}
	//返回厨师的基础页面
	@RequestMapping("/chefExprerience.view")
	public String chefExprerience()
	{
		
		return "chefexprerience";
		
	}
	//作息页面设置
	@RequestMapping("/chefLogistics.view")
	public String chefLogistics()
	{
		
		return "cheflogistics";
		
	}
	//图片上传页面设置
	@RequestMapping("/chefImage.view")
	public String chefImage()
	{
		
		return "chefimage";
		
	}
	//添加菜单
	@RequestMapping("/chefMenus.view")
	public String chefMenus()
	{
		
		return "chefmenus";
		
	}
	
}
