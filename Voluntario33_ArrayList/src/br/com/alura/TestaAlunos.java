package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopez");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");
		alunos.add("Pedro");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		boolean adicionou = alunos.add("Pedro");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);
	}
}
