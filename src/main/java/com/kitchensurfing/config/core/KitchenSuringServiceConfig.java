package com.kitchensurfing.config.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

//引入xml文件 @ImportResource()
@Import(value = { KitchenSuringDaoConfig.class })
//扫描组件
@ComponentScan(basePackages={"com.kitchensurfing.idaoimpl","com.kitchensurfing.iservice"
		,"com.kitchensurfing.serviceimpl"})

public class KitchenSuringServiceConfig {
	
}
