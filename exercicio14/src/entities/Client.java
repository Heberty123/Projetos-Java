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
		
		buffer.append("\n\nName: "+ super.getName() + " Salário: "+ super.getSalario()+ " Idade: "+ this.age);
		buffer.append("\n Products: \n");
		for (Products p: products) {
			buffer.append("\nname: "+ p.getName()+ ", Preço: "+ p.getPrice()+ ", Quantity: "+ p.getQuantity());
		}
		
		return "" + buffer;
	}

	@Override
	public void adicionar(String name, double price, int quantity) {
		
		products.add(new Products(name, price, quantity));
	}
	
	
}
