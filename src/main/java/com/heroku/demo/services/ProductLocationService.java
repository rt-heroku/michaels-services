/**
 * 
 */
package com.heroku.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heroku.demo.entities.ProductLocation;
import com.heroku.demo.exceptions.ProductLocationNotFoundException;
import com.heroku.demo.repositories.ProductLocationRepository;

/**
 * @author rtorres
 *
 */
@Service
@Transactional(rollbackFor=ProductLocationNotFoundException.class)
public class ProductLocationService 
{
	private static Logger logger = LoggerFactory.getLogger(ProductLocationService.class);
	
	@Autowired
	private ProductLocationRepository productLocationRepository;
	
//	@Autowired
//	private MainService mainService;
	
	/*
	 * READ methods
	 */
	public Page<ProductLocation> findAll(int page, int count) {
		
		if (logger.isDebugEnabled())
			logger.debug("ProductLocationService -> findAll ProductLocations");
		
		return productLocationRepository.findAll(new PageRequest(page, count));
	}

	public Iterable<ProductLocation> findAll() {
		
		if (logger.isDebugEnabled())
			logger.debug("ProductLocationService -> findAll ProductLocations");
		
		return productLocationRepository.findAll();
	}

	public ProductLocation findBySku(String sku){
		if (logger.isDebugEnabled())
			logger.debug("Retrieving ProductLocation with sku:" + sku);
		
		return productLocationRepository.findBySku(sku);
		
	}

//	public List<ProductLocation> findByProductLocation(String ProductLocation) {
//		if (logger.isDebugEnabled())
//			logger.debug("ProductLocationService -> findByLink:" + ProductLocation);
//
//		return ProductLocationRepository.findByProductLocation(ProductLocation);
//	}
	public ProductLocation get(int id) {
		if (logger.isDebugEnabled())
			logger.debug("Retrieving ProductLocation with id:" + id);
		
		ProductLocation elementToGet = productLocationRepository.findOne(id);
		
		if (elementToGet == null)
			throw new ProductLocationNotFoundException(id);
		
		return elementToGet;
	}

	/*
	 * 
	 */
	public ProductLocation create(ProductLocation ProductLocation) {

		if (logger.isDebugEnabled())
			logger.debug("ProductLocationService -> create:" + ProductLocation);
			
		return productLocationRepository.save(ProductLocation);
	}

	public ProductLocation update(ProductLocation productLocation) {
		
		if (logger.isDebugEnabled())
			logger.debug("ProductLocationService -> create:" + productLocation);

		ProductLocation elementToUpdate = productLocationRepository.findOne(productLocation.getId());
		
		if (elementToUpdate == null)
			throw new ProductLocationNotFoundException(productLocation.getSku());
		
		elementToUpdate.update(productLocation);
		productLocationRepository.save(elementToUpdate);
		
		return elementToUpdate;
	}

	public ProductLocation delete(int id) {
		if (logger.isDebugEnabled())
			logger.debug("ProductLocationService -> delete:" + id);

		ProductLocation elementToDelete = get(id);
		
		if (elementToDelete == null)
			throw new ProductLocationNotFoundException(id);
		
		productLocationRepository.delete(elementToDelete);

		return elementToDelete;
	}

	/*
	 * HELPERS
	 */

}

