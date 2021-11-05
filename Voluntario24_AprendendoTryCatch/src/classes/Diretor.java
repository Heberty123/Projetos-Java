package classes;

import java.util.Date;

public class Diretor extends Employee implements senha {
	
	private int senha = 5987;

	public Diretor(String name, double salario, Date nascimento, String position) {
		super(name, salario, nascimento, position);
		
	}
	
	@Override
	public double Bonificacao() {
		
		return super.salario * 0.15;
	}

	@Override
	public String senhaConfirmada(int senha) throws Exception{
		
		if (senha != this.senha) {
			throw new Exception("Senha inválida");
		}
		
		return "senha confirmada com sucesso";
	}

}