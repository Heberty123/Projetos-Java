package classes;

import java.util.Date;

public class Gerente extends Employee implements senha {
	
	private static int senha = 1234;

	public Gerente(String name, double salario, Date nascimento, String position) {
		super(name, salario, nascimento, position);
		
	}
	
	@Override
	public double Bonificacao() {
		
		return super.salario * 0.10;
	}

	@Override
	public String senhaConfirmada(int senha) throws Exception {
		
		if(senha != this.senha) {
			
			throw new Exception("Senha inválida");
		}
		
		return "Senha confirmada com sucesso";
	}
	
	

}
