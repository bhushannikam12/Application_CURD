package com.assnigment.demo.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int productid;
	
private String product;

private int quantity;

private int price;

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="category_id")
private Category category;


public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}

public Product(String product, int quantity, int price, Category category) {
	super();
	this.product = product;
	this.quantity = quantity;
	this.price = price;
	this.category = category;
}

public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", product=" + product + ", quantity=" + quantity + ", price=" + price
			+ "]";
}

}
