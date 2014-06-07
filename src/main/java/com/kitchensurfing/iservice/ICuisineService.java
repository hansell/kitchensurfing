package com.kitchensurfing.iservice;

import java.util.List;

import com.kitchensurfing.po.Cuisine;

public interface ICuisineService {
  List<Cuisine> getCuisine(final int chefId);
}
