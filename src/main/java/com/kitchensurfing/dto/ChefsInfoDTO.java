package com.kitchensurfing.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.kitchensurfing.po.Chef;
import com.kitchensurfing.po.Cuisine;
import com.kitchensurfing.po.Menu;
import com.kitchensurfing.po.Style;

public class ChefsInfoDTO implements Serializable {

	protected final Logger logger=Logger.getLogger(getClass());
	private static final long serialVersionUID = 1L;
    private Chef _selfChef;
    private int _count;
    private List<Menu> menuList;
    private Cuisine _mainCuisine;
    private Style _styles;
    //1-one star --5 stars
    private int chefRank;
}
