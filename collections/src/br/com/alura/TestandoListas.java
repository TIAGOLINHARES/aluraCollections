package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "teste aula 1";
		String aula2 = "teste aula 2";
		String aula3 = "teste aula 3";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {

			System.out.println("Aula: " + aula);

		}

		String primairaAula = aulas.get(0);

		System.out.println(primairaAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		System.out.println(aulas.size());

		aulas.forEach(aula -> {
			System.out.println("percorrendo:");
			System.out.println("Aula: " + aula);

			aulas.add("A teste de string");
			System.out.println(aulas);
			Collections.sort(aulas);
			System.out.println(aulas);

		});
	}

}
