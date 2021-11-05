package entities;

public class Funcionario {

	private String name;
	private double salario;
	private int age;
	
	
	public Funcionario(String name, double salario, int age) {
		super();
		this.name = name;
		this.salario = salario;
		this.age = age;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
