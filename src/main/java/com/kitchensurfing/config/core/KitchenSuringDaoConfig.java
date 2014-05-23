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
		//#<!-- 初始化连接 -->
		dataSource.setInitialSize(env.getProperty("jdbc.password",Integer.class));
		//#最大连接数量
		dataSource.setMaxActive(env.getProperty("jdbc.password",Integer.class));
	   // 最大空闲连接 -->
		dataSource.setMaxIdle(env.getProperty("jdbc.password",int.class));
		//<!-- 最小空闲连接 -->
		dataSource.setMinIdle(env.getProperty("jdbc.password",int.class));
		//#是否在自动回收超时连接的时候打印连接的超时错误
		dataSource.setLogAbandoned(env.getProperty("jdbc.logAbandoned",Boolean.class));
		//#是否自动回收超时连接
		dataSource.setRemoveAbandoned(env.getProperty("jdbc.removeAbandoned",Boolean.class));
		/**超时时间(以秒数为单位)
		设置超时时间有一个要注意的地方，超时时间=现在的时间-程序中创建Connection的时间，
		如果 maxActive比较大，比如超过100，那么removeAbandonedTimeout可以设置长一点比如180，也就是三分钟无响应的连接进行回收，当然应用的不同设置长度也不同。
		dataSource.removeAbandonedTimeout=180
         */
		dataSource.setRemoveAbandonedTimeout(env.getProperty("jdbc.removeAbandonedTimeout",int.class));
		/**
		<!-- 超时等待时间以毫秒为单位 -->
		maxWait代表当Connection用尽了，多久之后进行回收丢失连接
		dataSource.maxWait=1000
		*/
		dataSource.setMaxWait(env.getProperty("jdbc.maxWait",int.class));
		dataSource.setDefaultAutoCommit(env.getProperty("jdbc.defaultAutoCommit",Boolean.class));
		dataSource.setTimeBetweenEvictionRunsMillis(env.getProperty("jdbc.timeBetweenEvictionRunsMillis",Long.class));
		
		return dataSource;
	}
	
}
