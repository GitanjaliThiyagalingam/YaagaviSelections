package com.yaagavi.selections.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaagavi.selections.model.Product;
import com.yaagavi.selections.model.ProductType;
import com.yaagavi.selections.repository.ProductTypeRepository;
import com.yaagavi.selections.service.ProductTypeService;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
	
	@Autowired
    private ProductTypeRepository productTypeRepository;
	
	@Override
	public void createProductType(ProductType productType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProductType(String id, ProductType productType) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ProductType getProductTypeById(String id) {
		return productTypeRepository.findById(id).get();
		
	}

	@Override
	public void deleteProductType(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<ProductType> getProductTypes() {
		List<ProductType> productTypes = productTypeRepository.findAll();
		
	    return productTypes;
	}

	@Override
	public Set<Product> getAllProductsByProductTypeId(String id) {
		ProductType productType = productTypeRepository.findById(id).get();
		return productType.getProducts();
	}

}
