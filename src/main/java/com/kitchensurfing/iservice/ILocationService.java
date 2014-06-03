package com.kitchensurfing.iservice;

import com.kitchensurfing.po.Location;

public interface ILocationService {
   Location fetchLocation(final String cityName);
}
