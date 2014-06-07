package com.kitchensurfing.serviceimpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kitchensurfing.idao.ILocationDao;
import com.kitchensurfing.iservice.ILocationService;
import com.kitchensurfing.po.Location;
@Repository
@Service("cityService")
public class LocationService implements Serializable, ILocationService {

	 @Autowired
	 private ILocationDao locationDao;
	private static final long serialVersionUID = 2067477838294430843L;

	public Location fetchLocation(String cityName) {
		// TODO Auto-generated method stub
		return locationDao.getLocation(cityName);
	}

}
