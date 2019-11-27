package com.regis.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Inicio {

	public static void main(String[] args) {

		Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
		mapaNomes.put(1, "João Delfino");
		mapaNomes.put(2, "Maria do Carmo");
		mapaNomes.put(3, "Claudinei Silva");
		mapaNomes.put(4, "Amélia Mourão");
		
//		System.out.println(mapaNomes);
//		System.out.println(mapaNomes.get(2));
//		System.out.println("\n----------\n");
		
		
		
		// ----------
		
		
		
//		List<Integer> chaves = new ArrayList<>();
//		List<String> valores = new ArrayList<>();
		
		
		
		// ----------
		
		
		// Percorrer um Map, pela chave
//		for (Integer chave : mapaNomes.keySet()) {
//			System.out.println(chave);
//			System.out.println(mapaNomes.get(chave));
//			chaves.add(chave);
//			valores.add(mapaNomes.get(chave));
//		}
//		
//		System.out.println(chaves);
//		System.out.println(valores);
//		valores.clear();
		
		
		// ----------
		
		
		
		// Percorrer um Map, pelo valor
//		for (String valor : mapaNomes.values()) {
//			System.out.println(valor);
//			valores.add(valor);
//		}
//		
//		System.out.println(valores);
//		System.out.println("\n----------\n");
		
		
		
		// ----------
		
		
		
		// Ordenar mapa pelo valor
		ComparadorInts comparadorInts = new ComparadorInts(mapaNomes);
		Map<Integer, String> mapaOrdenado = new TreeMap<Integer, String>(comparadorInts);
		mapaOrdenado.putAll(mapaNomes);
		
		for (Integer chave2 : mapaOrdenado.keySet()) {
			System.out.println(chave2 + " " + mapaNomes.get(chave2));
		}


	}

}