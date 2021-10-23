package br.com.bytebank.banco.modelo;

//apenas para testar o tratamento de exceções
public class Conta {

	public void deposita() throws MinhaExcecao {
	    throw new MinhaExcecao("Erro deposita");
	}

}

