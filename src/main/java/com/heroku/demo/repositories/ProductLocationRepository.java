package com.heroku.demo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.heroku.demo.entities.ProductLocation;

/**
 * Repository : ProductLocation.
 */
public interface ProductLocationRepository extends PagingAndSortingRepository<ProductLocation, Integer> {
	ProductLocation findBySku(String sku);
}
