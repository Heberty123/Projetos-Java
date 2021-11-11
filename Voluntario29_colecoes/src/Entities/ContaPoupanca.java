package Entities;

import DomainException.Excecao;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(double limit, int agencia, int numero, Cliente titular) {
		super(limit, agencia, numero, titular);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void to_withdraw(double valor) throws Excecao {
		if (valor > this.saldo) {
			throw new Excecao("That value is extends to your limits of balance");
		}
		super.saldo -= valor*1.03;
		
	}
}
