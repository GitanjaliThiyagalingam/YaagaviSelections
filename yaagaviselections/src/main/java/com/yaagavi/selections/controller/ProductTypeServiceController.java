package com.yaagavi.selections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yaagavi.selections.model.ProductType;
import com.yaagavi.selections.service.ProductTypeService;

//@CrossOrigin(origins = "http://ec2-3-104-76-208.ap-southeast-2.compute.amazonaws.com:4200")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/products")
public class ProductTypeServiceController {

	@Autowired
	ProductTypeService productTypeService;

	@RequestMapping(value = "/productTypes")
	public ResponseEntity<Object> getProductType() {
		return new ResponseEntity<>(productTypeService.getProductTypes(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/productType/{id}")
	public ResponseEntity<Object> getAllProductsByProductTypeId(@PathVariable("id")String id) {
		ProductType productType = productTypeService.getProductTypeById(id);
		return new ResponseEntity<>(productType.getProducts(), HttpStatus.OK);
	}
}
