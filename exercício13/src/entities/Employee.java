package entities;

import Items.Products;
import benefits.CLT;
import benefits.Enum.typeBenefits;
import java.util.ArrayList;
import java.util.List;


public class Employee extends People implements CLT{

	
	private List<Products> list = new ArrayList<Products>();
	List <typeBenefits> rigth = new ArrayList<>();
	
	
	public Employee() {
		super();
	}
	

	public Employee(String name, int age, double wage) {
		super(name, age, wage);
	}


	public List<Products> getList() {
		return list;
	}
	
	@Override
	public boolean Buy(String name, double price, int quantity) {
		// Para employee(funcionários) a empresa oferece descontos para o preço por 12%.
		price = price * 0.88;
		if (price * quantity > super.getWage()) {
			
			return false;
		} else {
			
			list.add(new Products(name, price, quantity));
			super.wage -= price*quantity;
			
			return true;
		}

	}
	
	@Override
	public void beneficios(String type) {
		
		rigth.add(typeBenefits.valueOf(type));	
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + ": \n");
			for(Products itens : list) {
			
				sb.append(itens.toString());
			}
		sb.append("\n Seus Benefícios: \n");
			for(typeBenefits type : rigth) {
				
				sb.append(type.toString());
			}
			
			return "OI";
	}

}
