package entities;

public class Diretor extends Funcionario{

	private int senha;

	public Diretor(String name, double salario, int age, int senha) {
		super(name, salario, age);
		this.senha = senha;
		// TODO Auto-generated constructor stub
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	

}
