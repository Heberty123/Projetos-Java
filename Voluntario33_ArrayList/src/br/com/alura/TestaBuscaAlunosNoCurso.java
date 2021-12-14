package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Quem é o aluno com matricula 5617");
        Aluno aluno = javaColecoes.buscaMatriculado(5618);
        System.out.println("aluno: " + aluno);
	}

}
