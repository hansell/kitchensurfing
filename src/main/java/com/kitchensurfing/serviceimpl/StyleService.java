package com.kitchensurfing.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kitchensurfing.idao.IStyleDao;
import com.kitchensurfing.iservice.IStyleService;
import com.kitchensurfing.po.Style;

@Repository
@Service("StyleHelper")
public class StyleService implements Serializable, IStyleService {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
    private IStyleDao styleDao;
	public Style getStyle(final int id) {
		// TODO Auto-generated method stub
		return styleDao.getStyle(id);
	}

	public List<Style> getList(final int menuId) {
		// TODO Auto-generated method stub
		return styleDao.getLists(menuId);
	}

}
