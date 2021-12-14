package br.com.alura;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TesteRecibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Recibo> c = new TreeSet<>(new Comparator<Recibo>() {
			public int compare(Recibo c1, Recibo c2) {
				
				 double valor1 = (double) c1.getValor();
				double valor2 = (double) c2.getValor();
				if(valor1 > valor2) {
					return 1;
				}
				else if(valor2 > valor1) {
					return -1;
				}
				else {
					return 0;
				}
			
				/*
				 compare por idades (int)
				 
				 return c1.getIdade() - c2.getIdade();
				 
				 */
			}});
		
		Recibo rec1 = new Recibo("H", 2000, 56);

		Recibo rec2 = new Recibo("Z",7000, 87);

		Recibo rec3 = new Recibo("A", 1500, 12);
		
		c.add(rec1);
		c.add(rec2);
		c.add(rec3);
		
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
