package com.yaagavi.selections.service;

import java.util.Collection;

import com.yaagavi.selections.model.Product;

public interface ProductService {
	   public abstract void createProduct(Product product);
	   public abstract void updateProduct(String id, Product product);
	   public abstract void deleteProduct(String id);
	   public abstract Collection<Product> getAllProducts();
	   public abstract Product getProductById(String id);
	}
