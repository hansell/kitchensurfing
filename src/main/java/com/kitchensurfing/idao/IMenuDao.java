package com.kitchensurfing.idao;

import java.util.List;

import com.kitchensurfing.po.Menu;

public interface IMenuDao {
   Menu getMenu(int id);
   List<Menu> getMenuList(int chefId);
}
