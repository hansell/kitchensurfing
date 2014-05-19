package com.kitchensurfing.config.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

//引入配置的xml文件 @ImportResource()
@Import(value = { KitchenSuringDaoConfig.class })
//扫描的包名
@ComponentScan(basePackages={"com.kitchensurfing.idaoimpl"})
public class KitchenSuringServiceConfig {
	
	
	
	

}
