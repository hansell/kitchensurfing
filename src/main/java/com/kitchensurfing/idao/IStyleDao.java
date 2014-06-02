package com.kitchensurfing.idao;

import java.util.List;

import com.kitchensurfing.po.Style;

public interface IStyleDao {
  Style getStyle(final int id);
  List<Style> getLists(final int menuId);
}
