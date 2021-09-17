package entities;

public class Gerente extends Funcionario {

	private int senha;
	
	public Gerente() {
		super();
	}

	public Gerente(String name, int cpf, int salario, int senha) {
		super(name, cpf, salario);
		this.senha = senha;
	}
	
	@Override
	public double getBonificacao() {
		return salario = salario + salario * 0.8;
	}
}
