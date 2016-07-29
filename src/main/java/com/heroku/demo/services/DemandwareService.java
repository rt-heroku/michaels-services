/**
 * 
 */
package com.heroku.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.heroku.demo.config.Demandware;
import com.heroku.demo.dto.productsearch.ProductSearch;

/**
 * @author rtorres
 *
 */
@Service
public class DemandwareService 
{
	private static Logger logger = LoggerFactory.getLogger(DemandwareService.class);
	
	/*
	 * READ methods
	 */
	public ProductSearch search(String product){
		Demandware dw = new Demandware();
		if (logger.isDebugEnabled())
			logger.debug("Retrieving products from demandware that match " + product);
		
        RestTemplate restTemplate = new RestTemplate();
//        String service = "http://mjacob01-inside-na01-dw.demandware.net/s/SiteGenesis/dw/shop/v16_4/product_search?q=shoes&client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&expand=prices,images";
        String service = dw.getUrl() + "/s/SiteGenesis/dw/shop/" + dw.getApiVersion() + "/product_search?q=shoes&client_id=" + dw.getClientId() + "&expand=prices,images";
        
        System.out.println("Calling demandware service" + service);
        
        ProductSearch ps = restTemplate.getForObject(service, ProductSearch.class);

		return ps;		
	}

}

