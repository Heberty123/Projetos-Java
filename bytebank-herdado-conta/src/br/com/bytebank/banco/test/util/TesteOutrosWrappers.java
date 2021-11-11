package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(3.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Float.valueOf(29.0f);
		
		List<Number> lista = new ArrayList<>();
		
		lista.add(refNumero);
		lista.add(12);
		lista.add(Double.valueOf("54"));
		lista.add(Integer.parseInt("32"));

	}

}
