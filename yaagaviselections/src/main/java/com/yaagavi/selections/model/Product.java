package com.yaagavi.selections.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
    @GeneratedValue
    @SequenceGenerator(name = "product_Sequence", sequenceName = "PRODUCT_SEQ")
	private String id;
	
	@Column
	private String name;
	
	@Column
	private double price;
	
	@Lob
	@Column(name = "image", columnDefinition="LONGBLOB")
    private byte[] image;
	
	@Column
	private String description;
	
	@Column
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="product_type_id", nullable=false)
	private ProductType productType;
	
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public Product(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.setPrice(price);
	}
	
	public Product(String id, String name, double price, byte[] image, String description, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.setPrice(price);
		this.image = image;
		this.description = description;
		this.quantity = quantity;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
