package entities;

public class Gerente extends Funcionario{

	private int senha;

	public Gerente(String name, double salario, int age, int senha) {
		super(name, salario, age);
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	
}
