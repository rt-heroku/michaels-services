package com.heroku.demo.exceptions;

public class ProductLocationNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 262039464718205868L;

	public ProductLocationNotFoundException(Integer id) {
		super("ProductLocation not found with id: " + id.toString());
	}

	public ProductLocationNotFoundException(String ProductLocation) {
		super("ProductLocation " + ProductLocation + " not found!");
	}
}
