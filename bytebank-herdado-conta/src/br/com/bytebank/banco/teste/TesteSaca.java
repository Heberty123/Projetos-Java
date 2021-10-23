package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.contas.Conta;
import br.com.bytebank.banco.contas.ContaCorrente;
import br.com.bytebank.banco.contas.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
	}
}
