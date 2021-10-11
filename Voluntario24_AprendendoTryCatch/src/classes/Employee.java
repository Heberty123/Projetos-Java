package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Products.Buy;

public class Employee {

	
	private String name;
	protected double salario;
	private Date nascimento;
	private List<Buy>list;
	
	public Employee(String name, double salario, Date nascimento) {
		super();
		this.name = name;
		this.salario = salario;
		this.salario += Bonificacao();
		this.nascimento = nascimento;
		this.list = new ArrayList<Buy>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
	public double Bonificacao() {
		
		return this.salario + this.salario * 0.01;
	}
	
	
	public void Buy(String name, double price, int quantity) throws Exception {
		if (price * quantity > this.salario) {
			
			throw new Exception("Salário Insuficiente");
		}
		else {
		list.add(new Buy(name, price, quantity));
		}
	}
	
	public String listProducts() {
		
		StringBuilder sb = new StringBuilder("Products:\n");
				for(Buy buy: list) {
				sb.append(buy.toString() + "\n");
				
				}
		return "" + sb;
	}
}
