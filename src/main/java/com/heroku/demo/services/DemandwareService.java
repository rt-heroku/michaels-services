/**
 * 
 */
package com.heroku.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.heroku.demo.config.Demandware;
import com.heroku.demo.dto.Categories;
import com.heroku.demo.dto.product.Product;
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
	public ProductSearch search(String product, String url){
		Demandware dw = new Demandware();
		if (logger.isDebugEnabled())
			logger.debug("Retrieving products from demandware that match " + product);
		
        RestTemplate restTemplate = new RestTemplate();
        String service = dw.getUrl() + "/s/SiteGenesis/dw/shop/" + dw.getApiVersion() + "/product_search?q=shoes&client_id=" + dw.getClientId() + "&expand=prices,images";
        
        System.out.println("Calling demandware service" + service);
        
        ProductSearch ps = restTemplate.getForObject(service, ProductSearch.class);

        for (int i = 0; i < ps.getHits().size(); i++) {
        	String u = ps.getHits().get(i).getLink();
        	String newU = u.replace(dw.getUrl() + "/s/SiteGenesis/dw/shop/" + dw.getApiVersion(), url);
        	
        	newU = removeParams(newU, "client_id");
        	
        	ps.getHits().get(i).setLink(newU);
		}
        
		return ps;		
	}

	//http://mjacob01-inside-na01-dw.demandware.net/s/SiteGenesis/dw/shop/v16_4/products/TG720?q=shoes&client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	public Product getProduct(String product, String category, String q){
		Demandware dw = new Demandware();
		if (logger.isDebugEnabled())
			logger.debug("Retrieving product detail from demandware for product [" + product + "]");
		
        RestTemplate restTemplate = new RestTemplate();
        String service = dw.getUrl() + "/s/SiteGenesis/dw/shop/" + dw.getApiVersion() + "/products/" + product + "?q=" + q  + "&client_id=" + dw.getClientId();
        
        if (category != null && !category.equals(""))
        	service += "&catid=" + category;
        
        System.out.println("Calling demandware service" + service);
        
        Product p = restTemplate.getForObject(service, Product.class);
       
		return p;		
	}

	
	public static String removeParams(String queryString, String... params) {
	    for (String param : params) {
	        String keyValue = param + "=[^&]*?";
	        queryString = queryString.replaceAll("(&" + keyValue + "(?=(&|$))|^" + keyValue + "(&|$))", "");
	    }
	    return queryString;
	}
	
	public Categories allLevel1Categories(String category){
		Demandware dw = new Demandware();
		if (logger.isDebugEnabled())
			logger.debug("Retrieving categories from demandware ");
		
		RestTemplate restTemplate = new RestTemplate();
		String service = dw.getUrl() + "/s/SiteGenesis/dw/shop/" + dw.getApiVersion() + "/categories/" + category + "?levels=1&client_id=" + dw.getClientId() + "";
		
		System.out.println("Calling demandware service" + service);
		
		Categories c = restTemplate.getForObject(service, Categories.class);
		
		return c;		
	}
	
	//http://mjacob01-inside-na01-dw.demandware.net/s/SiteGenesis/dw/shop/v16_4/categories/root?levels=2&client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	public com.heroku.demo.dto.categories.Categories allCategories(String category){
		Demandware dw = new Demandware();
		if (logger.isDebugEnabled())
			logger.debug("Retrieving categories from demandware ");
		
		RestTemplate restTemplate = new RestTemplate();
		String service = dw.getUrl() + "/s/SiteGenesis/dw/shop/" + dw.getApiVersion() + "/categories/" + category + "?levels=2&client_id=" + dw.getClientId() + "";
		
		System.out.println("Calling demandware service" + service);
		
		com.heroku.demo.dto.categories.Categories cs = restTemplate.getForObject(service, com.heroku.demo.dto.categories.Categories.class);
		
		
//		for (Category c : cs.getCategories()){
//			c.get
//		}
		
		return cs;		
	}


}

