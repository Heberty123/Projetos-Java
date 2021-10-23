package br.com.bytebank.banco.contas;

public class SaldoInsuficienteException extends Exception{ //checked
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
