package com.yaagavi.selections.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "productType")
public class ProductType {
	
	@Id
    @GeneratedValue
    private String id;
	
	@Column
	private String type;
	
	@Column
	private String name;
	
	@Lob
	@Column(name = "image", columnDefinition="LONGBLOB")
    private byte[] image;
	
	@OneToMany
	private Set<Product> products;
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public ProductType() {
		super();
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public ProductType(String id, String type, byte[] image) {
		super();
		this.id = id;
		this.type = type;
		this.image = image;
	}
	
	public ProductType(String id, String type, String name, byte[] image, Set<Product> products) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.image = image;
		this.products = products;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
