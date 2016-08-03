package com.heroku.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.heroku.demo.entities.ProductLocation;
import com.heroku.demo.model.ResponseMessage;
import com.heroku.demo.services.ProductLocationService;

/*
 * REST Services
 */
@Controller
@RequestMapping(value="/api/v1/productlocation")
public class ProductLocationRestController {
	
	private static Logger logger = LoggerFactory.getLogger(ProductLocationRestController.class);
	
	@Autowired
	private ProductLocationService productlocationService;
		
	/*
	 * READ METHODS
	 */

//	@RequestMapping(value="", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getAll() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("productlocationService -> getPage");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(productlocationService.findAll());
//		} catch (Exception e) {
//			logger.error("productlocationController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get page for productlocation: " + e.getMessage());
//		}
//		return responseMessage;
//	}

	@RequestMapping(value="/page", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getPage(@RequestParam int page, @RequestParam int records) {

		if (logger.isDebugEnabled())
			logger.debug("productlocationService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(productlocationService.findAll(page, records));
		} catch (Exception e) {
			logger.error("productlocationController -> getPage", e);
			responseMessage.setError(-1, "Unable to get page for productlocation: " + e.getMessage());
		}
		return responseMessage;
		
	}


//	@RequestMapping(value="/count", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getCount() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("productlocationService -> getAll");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(productlocationService.count());
//		} catch (Exception e) {
//			logger.error("productlocationController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all productlocation: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

//	@RequestMapping(value="/page", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getPage(@RequestParam int page,@RequestParam int size) {
//
//		if (logger.isDebugEnabled())
//			logger.debug("productlocationService -> getPage(" + page + "," + size + ")");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(productlocationService.getPage(page, size));
//		} catch (Exception e) {
//			logger.error("productlocationController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all productlocation: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}
	
//	@RequestMapping(value="/elements", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getDropDownElements() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("productlocationService -> getDropDownElements");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(productlocationService.getDropDownValues());
//		} catch (Exception e) {
//			logger.error("productlocationController -> getDropDownElements", e);
//			responseMessage.setError(-1, "Unable to getDropDownElements for productlocation: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

	@RequestMapping(value="/{sku}", method=RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public ResponseMessage getOne(@PathVariable String sku) {
		if (logger.isDebugEnabled())
			logger.debug("productlocationService -> getOne(" + sku + ")");
		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(productlocationService.findBySku(sku));
		} catch (Exception e) {
			logger.error("productlocationController -> create", e);
			responseMessage.setError(-1,
					"Unable to create productlocation: " + sku + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

/*	@RequestMapping(value="{productlocation}/device/{device}", method=RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public ResponseMessage getByDeviceId(@PathVariable String productlocation, @PathVariable String device) {
		if (logger.isDebugEnabled())
			logger.debug("productlocationService -> findByDevice(" + device + ")");
		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(productlocationService.findByDevice(device));
		} catch (Exception e) {
			logger.error("productlocationController -> create", e);
			responseMessage.setError(-1,
					"Unable to get productlocations for device: " + device + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}
*/

	
	/*
	 * DML Methods
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage create(@RequestBody ProductLocation element) {

		if (logger.isDebugEnabled())
			logger.debug("productlocationService -> create:" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(productlocationService.create(element));
		} catch (Exception e) {
			logger.error("productlocationController -> create", e);
			responseMessage.setError(-1,
					"Unable to create productlocation: " + element + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage edit(@PathVariable Integer id, @RequestBody ProductLocation element) {
		if (logger.isDebugEnabled())
			logger.debug("productlocationService -> edit(" + id + "):" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			element.setId(id);
			responseMessage.setData(productlocationService.create(element));
		} catch (Exception e) {
			logger.error("productlocationController -> edit", e);
			responseMessage.setError(-1,
					"Unable to edit productlocation: " + element + ",Error:" + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage delete(@PathVariable Integer id) {

		if (logger.isDebugEnabled())
			logger.debug("productlocationService -> delete(" + id + ")");

		ResponseMessage responseMessage = new ResponseMessage();
		try {
			productlocationService.delete(id);
		} catch (Exception e) {
			logger.error("productlocationController -> delete", e);
			responseMessage.setError(-1, "Unable to delete productlocation: " + id + ",Error:"  + e.getMessage());
		}
		return responseMessage;
	}
	
}
