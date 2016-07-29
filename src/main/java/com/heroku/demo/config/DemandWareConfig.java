package com.heroku.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemandWareConfig {

	@Bean
	public Demandware getConfig(){
		Demandware dw = new Demandware();
		
		dw.setUrl(isNull(System.getenv("DW_URL"), "http://mjacob01-inside-na01-dw.demandware.net"));
		dw.setClientId(isNull(System.getenv("DW_CLIENTID"), "v16_4"));
		dw.setApiVersion(isNull(System.getenv("DW_API_VERSION"), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
		
		return dw;
	}
	
	private String isNull(String val, String d){
		if (val == null)
			return d;
		else
			return val;
	}
	
	
}
