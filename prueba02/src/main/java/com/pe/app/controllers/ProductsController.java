package com.pe.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pe.app.entity.Product;

@RestController
@RequestMapping("/Products")
public class ProductsController {

	private static final Logger LOGGER = Logger
			.getLogger(ProductsController.class);

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Product>> findAll() {
		List<Product> lista;
		lista = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			lista.add(new Product(i + "", "Producto " + i, 2.50D));
		}
		if (lista.isEmpty()) {
			return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Product>>(lista, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Product> findById(@PathVariable("id") String id) {
		Product p;
		p = new Product(id, "Producto " + id, 2.50D);
		if (p == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Product>(p, HttpStatus.OK);
	}

}
