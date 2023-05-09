package com.assnigment.demo.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryid;
	
	private String electronics;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="c_id", referencedColumnName = "categoryid")
	private List<Product> prd;

	
	public int getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}


	public String getElectronics() {
		return electronics;
	}


	public void setElectronics(String electronics) {
		this.electronics = electronics;
	}


	public List<Product> getPrd() {
		return prd;
	}


	public void setPrd(List<Product> prd) {
		this.prd = prd;
	}


	public Category(int categoryid, String electronics) {
		super();
		this.categoryid = categoryid;
		this.electronics = electronics;
	}


	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
