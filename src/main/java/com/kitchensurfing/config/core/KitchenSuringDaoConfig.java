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
		//#<!-- ��ʼ������ -->
		dataSource.setInitialSize(env.getProperty("jdbc.password",Integer.class));
		//#�����������
		dataSource.setMaxActive(env.getProperty("jdbc.password",Integer.class));
	   // ���������� -->
		dataSource.setMaxIdle(env.getProperty("jdbc.password",int.class));
		//<!-- ��С�������� -->
		dataSource.setMinIdle(env.getProperty("jdbc.password",int.class));
		//#�Ƿ����Զ����ճ�ʱ���ӵ�ʱ���ӡ���ӵĳ�ʱ����
		dataSource.setLogAbandoned(env.getProperty("jdbc.logAbandoned",Boolean.class));
		//#�Ƿ��Զ����ճ�ʱ����
		dataSource.setRemoveAbandoned(env.getProperty("jdbc.removeAbandoned",Boolean.class));
		/**��ʱʱ��(������Ϊ��λ)
		���ó�ʱʱ����һ��Ҫע��ĵط�����ʱʱ��=���ڵ�ʱ��-�����д���Connection��ʱ�䣬
		��� maxActive�Ƚϴ󣬱��糬��100����ôremoveAbandonedTimeout�������ó�һ�����180��Ҳ��������������Ӧ�����ӽ��л��գ���ȻӦ�õĲ�ͬ���ó���Ҳ��ͬ��
		dataSource.removeAbandonedTimeout=180
         */
		dataSource.setRemoveAbandonedTimeout(env.getProperty("jdbc.removeAbandonedTimeout",int.class));
		/**
		<!-- ��ʱ�ȴ�ʱ���Ժ���Ϊ��λ -->
		maxWait����Connection�þ��ˣ����֮����л��ն�ʧ����
		dataSource.maxWait=1000
		*/
		dataSource.setMaxWait(env.getProperty("jdbc.maxWait",int.class));
		dataSource.setDefaultAutoCommit(env.getProperty("jdbc.defaultAutoCommit",Boolean.class));
		dataSource.setTimeBetweenEvictionRunsMillis(env.getProperty("jdbc.timeBetweenEvictionRunsMillis",Long.class));
		
		return dataSource;
	}
	
}
