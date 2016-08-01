package com.heroku.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.heroku.demo.model.ResponseMessage;
import com.heroku.demo.services.DemandwareService;

/*
 * REST Services
 */
@Controller
@RequestMapping(value="/api/v1/dw")
public class DemandwareRestController {
	
	private static final String PRODUCT_SEARCH = "/products/search";
	private static final String CATEGORY_URL = "/category/{category}";
	private static final String ROOT = "root";

	private static Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private DemandwareService dwService;
		
	/*
	 * READ METHODS
	 */

	@RequestMapping(value=PRODUCT_SEARCH, method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage search(@RequestParam(required = false, defaultValue = "") String q, HttpServletRequest request) {

		String u = prepareUrl(request.getRequestURL().toString(), PRODUCT_SEARCH);
		
		System.out.println("request uri = " + request.getRequestURI());
		System.out.println("request URL = " + request.getRequestURL().toString());
		System.out.println("prepared URL = " + u);
				
		if (logger.isDebugEnabled())
			logger.debug("DemandwareController -> search(" + q + "");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(dwService.search(q, u));
		} catch (Exception e) {
			logger.error("DemandwareController -> search", e);
			responseMessage.setError(-1, "Unable to get search items for query: " + e.getMessage());
		}
		return responseMessage;
	}
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage productDetail(@PathVariable String id, @RequestParam(required = false, defaultValue = "") String q, HttpServletRequest request) {

		if (logger.isDebugEnabled())
			logger.debug("DemandwareController -> search(" + q + "");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(dwService.getProduct(id, q));
		} catch (Exception e) {
			logger.error("DemandwareController -> search", e);
			responseMessage.setError(-1, "Unable to get search items for query: " + e.getMessage());
		}
		return responseMessage;
	}
	
	
	/**
	 * CATEGORIES
	 */
	
	
	@RequestMapping(value=CATEGORY_URL, method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage allCategories(@PathVariable String category, HttpServletRequest request) {

		if (logger.isDebugEnabled())
			logger.debug("DemandwareController -> search(" + category + "");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(dwService.allCategories(category));
		} catch (Exception e) {
			logger.error("DemandwareController -> search", e);
			responseMessage.setError(-1, "Unable to get search items for squery: " + e.getMessage());
		}
		return responseMessage;
	}
	@RequestMapping(value="/categories", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage cateogry(HttpServletRequest request) {

		if (logger.isDebugEnabled())
			logger.debug("DemandwareController -> categories");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(dwService.allCategories(ROOT));
		} catch (Exception e) {
			logger.error("DemandwareController -> category", e);
			responseMessage.setError(-1, "Unable to get search items for query: " + e.getMessage());
		}
		return responseMessage;
	}
	
	private String prepareUrl(String url, String requestUrl){
		return url.replace(requestUrl, "");
	}
	
}
