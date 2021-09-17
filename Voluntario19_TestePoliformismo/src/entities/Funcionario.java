package entities;

public class Funcionario {

	private String name;
	private int cpf;
	protected double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(String name, int cpf, int salario) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return this.salario = this.salario + this.salario * 0.5;
	}
}
