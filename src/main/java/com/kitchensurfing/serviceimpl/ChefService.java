package com.kitchensurfing.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kitchensurfing.idao.IChefDao;
import com.kitchensurfing.iservice.IChefService;
import com.kitchensurfing.po.Chef;
/**
 * @category chefservice
 * @time create at 2014-05-31
 * @author Hansel
 *
 */
@Repository
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

}
