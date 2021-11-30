package br.com.alura;

import java.util.Objects;

public class Aluno {

		private String nome;
		private int numeroMatricula;
		
		public Aluno(String nome, int i) {
			if(nome == null) {
				throw new NullPointerException("nome não pode ser null");
			}
			this.nome = nome;
			this.numeroMatricula = i;
		}

		
		public String getNome() {
			return nome;
		}

		public int getNumeroMatricula() {
			return numeroMatricula;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			return Objects.equals(nome, other.nome) && numeroMatricula == other.numeroMatricula;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(nome, numeroMatricula);
		}

		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
		}
	}

