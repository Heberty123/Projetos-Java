package entities;

import java.util.List;

public class Client extends People {
	
	private int age;
	private List<Products> products;
	
	
	public Client() {
		super();
	}

	public Client(String name, double salario, double ultSalarios, int age, List<Products> products) {
		super(name, salario, ultSalarios);
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
		buffer.append("\n"+ super.getName() + "   Salário R$ "+ super.getUltSalarios()+ "      Idade: "+ this.age);
		buffer.append("\n\nProducts:");
		for (Products p: products) {
			buffer.append("\n>> name: "+ p.getName()+ ", Preço: "+ p.getPrice()+ ", Quantity: "+ p.getQuantity() + "  -- Total: " + p.getPrice() * p.getQuantity());
			
		}
		buffer.append("\n\nTotal dos produtos que descontou seu salário: " + total());
		buffer.append("\nSeu salário atual: " + getSalario());
		buffer.append("\n_____________________________________________________________________________");
		
		return "" + buffer;
	}

	@Override
	public void adicionar(String name, double price, int quantity) {
		
		products.add(new Products(name, price, quantity));
		super.salario = super.salario - (price*quantity);
	}
	
	@Override
	public boolean buy(double price, int quantity, double salario) {
		
		if(price*quantity > super.salario) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public double total() {
		
		double valor = 0;
		for (Products p: products) {
			valor += p.getPrice() * p.getQuantity();
		}
	
		return valor;
	}
	
}
