package entities;

import java.util.List;
import java.util.ArrayList;
import Items.Products;


public class Client extends People{

	private Products products;

	
	public Client() {
		super();
	}
	

	public Client(String name, int age, double wage, Products products) {
		super(name, age, wage);
		this.products = products;
	}
	

	public Products getProducts() {
		return products;
	}


	public void setProducts(Products products) {
		this.products = products;
	}


	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + ": \n");
			
		sb.append(this.getProducts().toString());
			
			return "OI";
	}

	
	
}
