package entities;

public abstract class Conta {

	
	private String name;
	private double saldo;
	private int agencia;
	
	
	public Conta(String name, double saldo, int agencia) {
		super();
		this.name = name;
		this.saldo = saldo;
		this.agencia = agencia;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSaldo() {
		return saldo;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
	public double get_bonificacao() {
		
		
		return agencia;
		
	}
	
	
	
	
	
	
}
