package com.kitchensurfing.iservice;

import java.util.List;

import com.kitchensurfing.po.Chef;

public interface IChefService {
    Chef getChef(final int chefId);
    Chef getChef(final String email,final String name);
    List<Chef> chefs(int cityId);
}
