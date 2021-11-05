package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.contas.*;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        Conta cc3 = new ContaCorrente(22, 22);
        
        
      
        System.out.println(lista.contains(cc3));
        

        for(Object oRef : lista) {
            System.out.println(oRef);
        }

    }
}