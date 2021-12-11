package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class TestandoAula {

	
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("revisando Array List", 21);
		Aula a2 = new Aula("listas de objetos", 20);
		Aula a3 = new Aula("Relacionamentos de Listas e Objetos", 15);
		
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
	}
	
	
}
