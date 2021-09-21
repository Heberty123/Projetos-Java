package entities;

public abstract class People {

	private String name;
	private double salario;
	
	
	public People() {
	}

	public People(String name, double salario) {
		super();
		this.name = name;
		this.salario = salario;
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
	
	public abstract String toString();
	
	
	public abstract void adicionar(String name, double price, int quantity);
	
	
	public abstract boolean buy(double price, int quantity, double salario);

	
}
