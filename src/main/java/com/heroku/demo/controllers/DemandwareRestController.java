package com.heroku.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
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
	
	private static Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private DemandwareService dwService;
		
	/*
	 * READ METHODS
	 */

	@RequestMapping(value="/product/search", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage search(@RequestParam(required = false, defaultValue = "") String q) {

		if (logger.isDebugEnabled())
			logger.debug("DemandwareController -> search(" + q + "");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(dwService.search(q));
		} catch (Exception e) {
			logger.error("DemandwareController -> search", e);
			responseMessage.setError(-1, "Unable to get search items for query: " + e.getMessage());
		}
		return responseMessage;
	}
}
