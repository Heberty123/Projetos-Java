package classes;

import java.util.Date;

public class Gerente extends Employee implements senha {
	
	private static int senha = 1234;

	public Gerente(String name, double salario, Date nascimento) {
		super(name, salario, nascimento);
		
	}
	
	@Override
	public double Bonificacao() {
		
		return super.salario * 0.10;
	}

	@Override
	public String senhaConfirmada(int senha) throws Exception {
		
		if(senha != this.senha) {
			
			throw new Exception("Senha inv�lida");
		}
		
		return "Senha confirmada com sucesso";
	}

}
