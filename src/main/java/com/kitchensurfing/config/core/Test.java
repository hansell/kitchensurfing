package com.kitchensurfing.config.core;


import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kitchensurfing.idaoimpl.UserDaoImpl;
import com.kitchensurfing.po.User;

public class Test {

	public static void main(String[] args) {

		try {
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
					KitchenSuringServiceConfig.class);
			UserDaoImpl ds = ctx.getBean(UserDaoImpl.class);

			User user = new User("user", "dsfsdf");

			ds.addUser(user);
			// Connection conn=ds.getConnection();

		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
