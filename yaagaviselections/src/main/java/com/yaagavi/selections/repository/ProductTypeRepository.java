package com.yaagavi.selections.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yaagavi.selections.model.ProductType;

@Repository
public interface ProductTypeRepository  extends JpaRepository<ProductType, String> {
	
}