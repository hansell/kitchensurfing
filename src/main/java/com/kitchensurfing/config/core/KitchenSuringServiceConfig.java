package com.kitchensurfing.config.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

//�������õ�xml�ļ� @ImportResource()
@Import(value = { KitchenSuringDaoConfig.class })
//ɨ��İ���
@ComponentScan(basePackages={"com.kitchensurfing.idaoimpl"})
public class KitchenSuringServiceConfig {
	
	
	
	

}
