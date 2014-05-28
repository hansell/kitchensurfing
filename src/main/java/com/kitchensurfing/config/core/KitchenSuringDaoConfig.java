package com.kitchensurfing.config.core;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
//import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("classpath:/jdbc.properties")
public class KitchenSuringDaoConfig {

	@Autowired
	private Environment env;

	@Bean(name="ds")
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		dataSource.setInitialSize(env.getProperty("jdbc.initialSize",Integer.class));
		dataSource.setMaxActive(env.getProperty("jdbc.maxActive",int.class));
		dataSource.setMaxIdle(env.getProperty("jdbc.maxIdle",int.class));
		dataSource.setMinIdle(env.getProperty("jdbc.minIdle",int.class));
		dataSource.setLogAbandoned(env.getProperty("jdbc.logAbandoned",Boolean.class));
		dataSource.setRemoveAbandoned(env.getProperty("jdbc.removeAbandoned",Boolean.class));
		dataSource.setRemoveAbandonedTimeout(env.getProperty("jdbc.removeAbandonedTimeout",int.class));
		dataSource.setMaxWait(env.getProperty("jdbc.maxWait",int.class));
		dataSource.setDefaultAutoCommit(env.getProperty("jdbc.defaultAutoCommit",Boolean.class));
		dataSource.setTimeBetweenEvictionRunsMillis(env.getProperty("jdbc.timeBetweenEvictionRunsMillis",Long.class));
		
		return dataSource;
	}
	
}
