package com.yaagavi.selections.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaagavi.selections.model.Product;
import com.yaagavi.selections.repository.ProductRepository;
import com.yaagavi.selections.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
   @Autowired
   private ProductRepository productRepository;

   @Override
   public void createProduct(Product product) {
      //productRepo.put(product.getId(), product);
   }
   @Override
   public void updateProduct(String id, Product product) {
 
   }
   @Override
   public void deleteProduct(String id) {
     
   }
   
   @Override
   public Collection<Product> getAllProducts() {
	   List<Product> products = productRepository.findAll();
       return products;
   }
   @Override
   public Product getProductById(String id) {
	   Product product = productRepository.findById(id).get();
	   return product;
   }
}