package br.com.alura;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Miannnn {

	public static void main(String[] args) {
		
		List<TesteMediaApi> cursos = new ArrayList<TesteMediaApi>();
		cursos.add(new TesteMediaApi("Python", 45));
		cursos.add(new TesteMediaApi("JavaScript", 150));
		cursos.add(new TesteMediaApi("Java 8", 113));
		cursos.add(new TesteMediaApi("C", 55));

		
		
		cursos.stream()
			.map(c -> c.getNome())
			.sorted()
			.forEach(System.out::println);
			
			
		
		
	}
	

}
