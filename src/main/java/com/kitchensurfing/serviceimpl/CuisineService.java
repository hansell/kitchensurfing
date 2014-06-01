package com.kitchensurfing.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kitchensurfing.idao.ICuisineDao;
import com.kitchensurfing.iservice.ICuisineService;
import com.kitchensurfing.po.Cuisine;

@Repository
@Service("cuisineService")
public class CuisineService implements Serializable, ICuisineService {

	@Autowired
	private ICuisineDao cuisineDao;
	private static final long serialVersionUID = 1L;

	public List<Cuisine> getCuisine(int chefId) {
		// TODO Auto-generated method stub
		return cuisineDao.getCuisineByChefId(chefId);
	}

}
