package entities;

import java.util.List;

public class Client extends People {
	
	private int age;
	private List<Products> products;
	
	public Client() {
		super();
	}

	public Client(String name, double salario, int age, List<Products> products) {
		super(name, salario);
		this.age = age;
		this.products = products;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		buffer.append("\n\n_____________________________________________________________________________");
		buffer.append("\n"+ super.getName() + "/   Salário R$ "+ super.getSalario()+ "   /   Idade: "+ this.age);		
		buffer.append("\nProducts:");
		for (Products p: products) {
			buffer.append("\nname: "+ p.getName()+ ", Preço: "+ p.getPrice()+ ", Quantity: "+ p.getQuantity());
			buffer.append("\n\n_____________________________________________________________________________");
		}
		
		return "" + buffer;
	}

	@Override
	public void adicionar(String name, double price, int quantity) {
		
		products.add(new Products(name, price, quantity));
	}
	
	@Override
	public boolean buy(double price, int quantity, double salario) {
		
		if(price*quantity > salario) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
}
