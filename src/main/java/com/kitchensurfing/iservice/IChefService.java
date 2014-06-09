package com.kitchensurfing.iservice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.kitchensurfing.po.Chef;

public interface IChefService {
    Chef getChef(final int chefId);
    Chef getChefByUserid(int userid);
    Chef getChef(final String email,final String name);
    List<Chef> chefs(int cityId);
    public  Chef updateChefBase(HttpServletRequest req);
}
