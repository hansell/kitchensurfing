package com.kitchensurfing.idao;

import java.util.List;

import com.kitchensurfing.po.Chef;

public interface IChefDao {
   Chef getChef(final int chefId);
   Chef getChefByUserid(int userid);
   Chef getChef(final String email,final String name);
   List<Chef> chefList(int cityId);
   public int updateChefBase(Chef chefbase);
   
}
