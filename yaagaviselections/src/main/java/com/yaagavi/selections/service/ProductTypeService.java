package com.yaagavi.selections.service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.yaagavi.selections.model.Product;
import com.yaagavi.selections.model.ProductType;

@Service
public interface ProductTypeService {
	   public abstract void createProductType(ProductType productType);
	   public abstract void updateProductType(String id, ProductType productType);
	   public abstract void deleteProductType(String id);
	   public abstract Collection<ProductType> getProductTypes();
	   public abstract ProductType getProductTypeById(String id);
	   public abstract Set<Product> getAllProductsByProductTypeId(String id);
	}
