package entities;

public abstract class People {

	private String name;
	protected double salario;
	private double ultSalarios;

	
	public People() {
	}

	public People(String name, double salario, double ultSalarios) {
		super();
		this.name = name;
		this.salario = salario;
		this.ultSalarios = salario;
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
	
	
	public double getUltSalarios() {
		return ultSalarios;
	}

	public void setUltSalarios(double ultSalarios) {
		this.ultSalarios = ultSalarios;
	}

	public abstract String toString();
	
	
	public abstract void adicionar(String name, double price, int quantity);
	
	
	public abstract boolean buy(double price, int quantity, double salario);

	
}
