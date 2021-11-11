package Entities;

import DomainException.Excecao;

public abstract class Conta extends Object implements Comparable<Conta> {
	
		private double limit;
		protected double saldo;
	    private int agencia;
	    private int numero;
	    private Cliente titular;
	    private static int total = 0;
	    
	    
		public Conta(double limit, int agencia, int numero, Cliente titular) {
			this.limit = limit;
			this.agencia = agencia;
			this.numero = numero;
			this.titular = titular;
			this.saldo += limit;
		}


		public double getLimit() {
			return limit;
		}

		public void setLimit(double limit) {
			this.limit = limit;
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


		public int getNumero() {
			return numero;
		}


		public void setNumero(int numero) {
			this.numero = numero;
		}


		public Cliente getTitular() {
			return titular;
		}


		public void setTitular(Cliente titular) {
			this.titular = titular;
		}

		public void deposit(double valor) {
			this.saldo += valor;
		}
		
		//Método precisa ser subscrito para classes diferentes pois cada classe exigirá determinado taxa para efetuar saque !
		public void to_withdraw(double valor) throws Excecao {
			if (valor > this.saldo) {
				throw new Excecao("That value is extends to your limits of balance");
			}
			this.saldo -= valor;
			
		}
		
		
		public void transfer(double valor, Conta destiny) throws Excecao {
			if (valor > this.saldo) {
				throw new Excecao("The value cant's to transfer by other account, because that extends to your limits of saldo");
			}
			this.saldo -= valor;
			destiny.deposit(valor);	
		}
		
		@Override
		public boolean equals(Object other) {
			
			Conta other1 = (Conta) other;
			
			if(this.agencia != other1.agencia) {
				
				return false;
			}
			
			return true;
		}
		
		
		public boolean ehIgual(Conta other) {
			if(this.agencia != other.agencia) {
				
				return false;
			}
			
			return true;
		}
		
		
	    @Override
		public String toString() {
			return "Limite: " + this.limit + "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Nome: " + this.titular.getNome();
		}
	    
	    
		
	    public int compareTo(Conta o) {
	    	if (this.limit > o.limit) {
	    		
	    		return 1;
	    	}
	    	if(this.limit < o.limit) {
	    		
	    		return -1;
	    	}
	    	
			return 0;
		}
	    
}
