package com.kitchensurfing.idaoimpl;

import java.io.Serializable;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kitchensurfing.exception.SQLErrorCodesTranslator;

public abstract class BaseDaoImpl implements Serializable {

	protected  final Logger logger=Logger.getLogger(getClass());
	private static final long serialVersionUID = 1L;
	protected JdbcTemplate jdbcTemplate;
	@Autowired
	public void init(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		 // create a custom translator and set the DataSource for the default translation lookup
		SQLErrorCodesTranslator tr = new SQLErrorCodesTranslator();
		    tr.setDataSource(dataSource);
		    this.jdbcTemplate.setExceptionTranslator(tr);
	}
}
