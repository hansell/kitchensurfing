package com.kitchensurfing.serviceimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchensurfing.common.AppConstants;
import com.kitchensurfing.idao.IChefDao;
import com.kitchensurfing.iservice.IChefService;
import com.kitchensurfing.po.Chef;
import com.kitchensurfing.po.User;

/**
 * @category chefservice
 * @time create at 2014-05-31
 * @author Hansel
 * 
 */
@Service("chefHelp")
public class ChefService implements Serializable, IChefService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4428528959359355479L;
	@Autowired
	private IChefDao chefDao;

	public Chef getChef(final int chefId) {
		// TODO Auto-generated method stub
		return chefDao.getChef(chefId);
	}

	public Chef getChef(String email, String name) {
		// TODO Auto-generated method stub
		return chefDao.getChef(email, name);
	}

	public List<Chef> chefs(int cityId) {
		// TODO Auto-generated method stub
		return chefDao.chefList(cityId);
	}

	public Chef updateChefBase(HttpServletRequest req) {

		User user = (User) req.getSession().getAttribute(AppConstants.SESSION_USER_STRING);
		// 构建po对象,然后交给db层处理
		Chef chef = new Chef();
		chef.setTagLine(req.getParameter("tagline"));
		chef.setPersonalkey(req.getParameter("personalkey"));
		chef.setPersonalspecial(req.getParameter("personalspecial"));
		chef.setFavoringredientone(req.getParameter("favoringredientone"));
		chef.setFavoringredienttwo(req.getParameter("favoringredienttwo"));
		chef.setFavoringredientthree(req.getParameter("favoringredientthree"));
		chef.setCookstyle(req.getParameter("cookstyle"));
		chef.setUserid(user.getUserId() + "");
        chef.setWeblocationone(req.getParameter("weblocationone"));
        chef.setWeblocationtwo(req.getParameter("weblocationtwo"));
        chef.setWeblocationthree(req.getParameter("weblocationthree"));
		int rcode = this.chefDao.updateChefBase(chef);
		if (rcode == 1)
			return chef;
		return null;
	}

	public Chef getChefByUserid(int userid) {
		// TODO Auto-generated method stub
		return this.chefDao.getChefByUserid(userid);
	}
	

}
