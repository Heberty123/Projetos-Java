package entities;

import Items.Products;
import benefits.CLT;
import benefits.Enum.typeBenefits;
import java.util.ArrayList;
import java.util.List;


public class Employee extends People{


	private Products products;
	private CLT clt;

	

	public Employee(String name, int age, double wage, typeBenefits clt, Products products) {
		super(name, age, wage);
		this.products = products;
	}
	


	public Products getProducts() {
		return products;
	}


	public void setProducts(Products products) {
		this.products = products;
	}


	public CLT getClt() {
		return clt;
	}


	public void setClt(CLT clt) {
		this.clt = clt;
	}

	
	

	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + ": \n");
			
		sb.append(this.getClt()+"\n");
		sb.append(this.getProducts().toString());
			
			return "OI";
	}




}
