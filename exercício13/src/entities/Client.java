package entities;

import java.util.List;
import java.util.ArrayList;
import Items.Products;


public class Client extends People{

	private List<Products> list = new ArrayList<Products>();

	
	public Client() {
		super();
	}
	

	public Client(String name, int age, double wage) {
		super(name, age, wage);
	}


	public List<Products> getList() {
		return list;
	}


	@Override
	public boolean Buy(String name, double price, int quantity) {
		if (price * quantity > super.getWage()) {
			
			return false;
		} else {
			
			list.add(new Products(name, price, quantity));
			super.wage -= price*quantity;
			
			return true;
		}
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + ": \n");
			for(Products itens : list) {
			
				sb.append(itens.toString());
			}
			
			return "OI";
	}

	
	
}
