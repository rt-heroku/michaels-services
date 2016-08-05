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
	public ProductSearch search(String product, String url, String category, int start, int count){
		Demandware dw = new Demandware();
		if (logger.isDebugEnabled())
			logger.debug("Retrieving products from demandware that match " + product);
		
        RestTemplate restTemplate = new RestTemplate();
        String service = dw.getUrl() + "/dw/shop/" + dw.getApiVersion() + "/product_search?start=" + start + "&count=" + count + "&q=" + product + "&client_id=" + dw.getClientId() + "&expand=prices,images";
        
        System.out.println("search -> Calling demandware service -> " + service);
        System.out.println("category = [" + category + "]");
        
        if (!category.equals("")){
        	service += "&refine_1=cgid=" + category;
        }
        
        ProductSearch ps = restTemplate.getForObject(service, ProductSearch.class);

        for (int i = 0; i < ps.getHits().size(); i++) {
        	String u = ps.getHits().get(i).getLink();
        	String newU = u.replace(dw.getUrl() + "/dw/shop/" + dw.getApiVersion(), url);
        	
        	newU = removeParams(newU, "client_id");
        	
        	ps.getHits().get(i).setLink(newU);
		}
        
		return ps;		
	}

	//http://mjacob01-inside-na01-dw.demandware.net/dw/shop/v16_4/products/TG720?q=shoes&client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	public Product getProduct(String product, String category){
		Demandware dw = new Demandware();
		if (logger.isDebugEnabled())
			logger.debug("Retrieving product detail from demandware for product [" + product + "]");
		
        RestTemplate restTemplate = new RestTemplate();
        String service = dw.getUrl() + "/dw/shop/" + dw.getApiVersion() + "/products/" + product + "?client_id=" + dw.getClientId();

        System.out.println("category = [" + category + "]");
        
        if (!category.equals("")){
        	service += "&refine_1=cgid=" + category;
        }
        System.out.println("getProduct - Calling demandware service -> " + service);
        
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
		String service = dw.getUrl() + "/dw/shop/" + dw.getApiVersion() + "/categories/" + category + "?levels=1&client_id=" + dw.getClientId() + "";
		
		System.out.println("allLevel1Categories - Calling demandware service -> " + service);
		
		Categories c = restTemplate.getForObject(service, Categories.class);
		
		return c;		
	}
	
	public com.heroku.demo.dto.categories.Categories getRootCategories(){
		Demandware dw = new Demandware();
		if (logger.isDebugEnabled())
			logger.debug("Retrieving categories from demandware ");
		
		RestTemplate restTemplate = new RestTemplate();
		String service = dw.getUrl() + "/dw/shop/" + dw.getApiVersion() + "/categories/" + dw.getRootCategory() + "?levels=2&client_id=" + dw.getClientId() + "";
		
		System.out.println("getRootCategories -> Calling demandware service -> " + service);
		
		com.heroku.demo.dto.categories.Categories cs = restTemplate.getForObject(service, com.heroku.demo.dto.categories.Categories.class);
		
		return cs;		
	}

	public com.heroku.demo.dto.categories.Categories getCategories(String category){
		Demandware dw = new Demandware();
		if (logger.isDebugEnabled())
			logger.debug("Retrieving categories from demandware ");
		
		RestTemplate restTemplate = new RestTemplate();
		String service = dw.getUrl() + "/dw/shop/" + dw.getApiVersion() + "/categories/" + category + "?levels=2&client_id=" + dw.getClientId() + "";
		
		System.out.println("getCategories -> Calling demandware service -> " + service);
		
		com.heroku.demo.dto.categories.Categories cs = restTemplate.getForObject(service, com.heroku.demo.dto.categories.Categories.class);
		
		return cs;		
	}
	
}

