package Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Entities.*;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Conta> lista = new ArrayList<Conta>();
		
		ContaCorrente cc1 = new ContaCorrente(1000, 12, 234, new Cliente("Heberty", "362.037.388-40", "Manager"));
		ContaCorrente cc2 = new ContaCorrente(3000, 72, 967, new Cliente("Amélia", "542.683.674-34", "Boss"));
		ContaPoupanca cp3 = new ContaPoupanca(2345, 12, 167, new Cliente("Zete", "432.655.347-12", "Tired"));
		ContaPoupanca cp4 = new ContaPoupanca(3456, 23, 857, new Cliente("Rafael", "562.865.567-35", "Astronomy"));
		ContaCorrente cc5 = new ContaCorrente(3000, 12, 234, new Cliente("Alice", "734.756.890-34", "President_Military"));
		ContaCorrente cc6 = new ContaCorrente(1000, 12, 234, new Cliente("Alice", "734.756.890-34", "President_Military"));
		ContaCorrente cc7 = new ContaCorrente(1111, 11, 234, new Cliente("Alice", "734.756.890-34", "President_Military"));

		

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cp3);
		lista.add(cp4);
		lista.add(cc5);
		lista.add(cc6);
		lista.add(cc7);
		
		lista.sort(null);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}

}

class OrdernarAgenciaConta implements Comparator<Conta>{

	@Override
	public int compare(Conta conta1, Conta conta2) {
		if(conta1.getAgencia() > conta2.getAgencia()) {
			return 1;
		}
		if(conta1.getAgencia() < conta2.getAgencia()) {
			return -1;
		}
		return 0;
	}
	
	
}

class OrdernarTitulo implements Comparator<Conta>{

	@Override
	public int compare(Conta o1, Conta o2) {
		String nome1 = o1.getTitular().getNome();
		String nome2 = o2.getTitular().getNome();
		
		return nome1.compareTo(nome2);
	}
	
	
}
