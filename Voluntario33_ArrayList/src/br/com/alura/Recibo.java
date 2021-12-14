package br.com.alura;

import java.util.Comparator;

public class Recibo {

	private String name;
	private double valor;
	private int idade;
	
	
	public Recibo(String name, double valor, int idade) {
		super();
		this.name = name;
		this.valor = valor;
		this.idade = idade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	

	/*
	 	@Override
	public int compare(Recibo c1, Recibo c2) {
		double valor1 = (double) c1.getValor();
		double valor2 = (double) c2.getValor();
		
			return valor1.compareTo(valor2);
	}
	*/
	


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + this.name + ", salary: " + this.valor + " idade: " +  this.idade + "]";
	}
}
