package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso javaColecoes = new Curso("Dominando as Coleções do Java", "paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com Array List", 21));
		javaColecoes.adiciona(new Aula("Criando Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções ", 24));

		System.out.println(javaColecoes.getAulas());

	}

}
