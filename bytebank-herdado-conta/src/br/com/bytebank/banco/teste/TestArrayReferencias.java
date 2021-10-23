package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.contas.Conta;
import br.com.bytebank.banco.contas.ContaCorrente;
import br.com.bytebank.banco.contas.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencia = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencia[0] = cc1;
				
				
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencia[1] = cc2;
		
		
		System.out.println(((Conta) referencia[1]).getNumero());
		ContaCorrente ref = (ContaCorrente) referencia[0]; //type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		System.out.println(((Conta) referencia[0]).getNumero());
		
		
	}

}
