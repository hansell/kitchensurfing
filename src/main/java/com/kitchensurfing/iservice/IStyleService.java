package com.kitchensurfing.iservice;

import java.util.List;

import com.kitchensurfing.po.Style;

public interface IStyleService {
  Style getStyle(int id);
  List<Style> getList(final int menuId);
}
