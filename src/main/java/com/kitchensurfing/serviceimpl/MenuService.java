package com.kitchensurfing.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kitchensurfing.idao.IMenuDao;
import com.kitchensurfing.iservice.IMenuService;
import com.kitchensurfing.po.Menu;

@Repository
@Service("menuHelper")
public class MenuService implements Serializable, IMenuService {

	@Autowired
	private IMenuDao menuDao;
	private static final long serialVersionUID = 1L;

	public List<Menu> gets(final int chefId) {
		// TODO Auto-generated method stub
		return menuDao.getMenuList(chefId);
	}

	public Menu getMenu(final int menuId) {
		// TODO Auto-generated method stub
		return menuDao.getMenu(menuId);
	}

}
