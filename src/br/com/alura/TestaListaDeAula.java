package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArraysLists", 21);
		Aula a2 = new Aula("Listas de objetos", 1);
		Aula a3 = new Aula("Relacionamento de listas de objetos", 3);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
//		String s1 = "paulo";
//		String s2 = "silveira";
//		
//		System.out.println(s1.compareTo(s2));
		
//		negativo se o s1 vier antes do s2
//		positivo se o s2 vier antes do s1
//		zero se eles estao no mesmo lugar
		
	}
}
