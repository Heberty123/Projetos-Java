package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {

    	Conta cc = new Conta();
        try {
            cc.deposita();
        } catch(MinhaExcecao ex) {
            System.out.println("tratamento ....");
        }

    }
}