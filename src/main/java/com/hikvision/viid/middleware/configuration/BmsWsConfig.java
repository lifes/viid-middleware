package com.hikvision.viid.middleware.configuration;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.hikvision.kapu.external.service.ICrossingService;

@Configuration
public class BmsWsConfig {
	
	@Value("${bms.addr}")
	private String bmsAddr;
	
	@Bean( name = "bmsCrossingService")
	public ICrossingService crossingService(){
		JaxWsProxyFactoryBean client = new JaxWsProxyFactoryBean();
		client.setAddress("http://"+bmsAddr+"/bms/service/ws/ICrossingService?wsdl");
		client.setServiceClass(ICrossingService.class);
		return client.create(ICrossingService.class);
	}

}
