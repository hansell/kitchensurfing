package com.kitchensurfing.iservice;

import java.util.List;

import com.kitchensurfing.po.Menu;

public interface IMenuService {
  List<Menu> gets(final int chefId);
  Menu getMenu(final int menuId);
}
