package com.kitchensurfing.idao;

import java.util.List;

import com.kitchensurfing.po.Cuisine;

/**
 * @time 2014-5-23
 * @author Hansel
 *
 */
public interface ICuisineDao {
  Cuisine getCuisine(int id);
  Cuisine fetchCuisine(String name);
  int getRowCount();
  List<Cuisine> queryAllCuisine();
  List<Cuisine> getCuisineByChefId(final int chefId);
}
