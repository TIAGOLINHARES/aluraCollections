package br.com.alura;

public class Aluno {

	
	String nome;
	int numeroMatrucula;
	
	
	public Aluno(String nome, int numeroMatrucula) {
		this.nome = nome;
		this.numeroMatrucula = numeroMatrucula;
	}


	public String getNome() {
		return nome;
	}


	public int getNumeroMatrucula() {
		return numeroMatrucula;
	}
	
		@Override
		public String toString() {
			return "Aluno: " + this.nome + "Matricula: " + this.numeroMatrucula ;
		}
	
	
	
}
