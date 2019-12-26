import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Написати методу која исписује HashMap<String,Integer> тако да је она сортирана по кључу. 
		 * Нпр: Aleksa 23 
		 * 		Bilja 1 	
		 * 		Jovica 35 
		 * 		Katarina 20 
		 * 		Svetlana 19
		 * 
		 */
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		mapa.put("Aleksa", 23);
		mapa.put("Bilja", 1);
		mapa.put("Jovica", 35);
		mapa.put("Katarina", 20);
		mapa.put("Svetlana", 19);

		List<String> lista = new ArrayList<String>(mapa.keySet());
		for (String kljuc : lista) {
			System.out.println(kljuc);
		}

		Collections.sort(lista);
		for (String kljuc : lista) {// Ova for petlja ispisuje elemente hešmape, sortirane abecedno po ključu.
			System.out.println(kljuc + " " + mapa.get(kljuc));
		}

		for (String kljuc : mapa.keySet()) {// samo proba.
			System.out.println(kljuc + " " + mapa.get(kljuc));
		}

		System.out.println(ispisiSortiranoHešMapu(mapa));// Ova metoda ispisuje elemente hešmape, sortirane abecedno po ključu.
	}

	public static String ispisiSortiranoHešMapu(HashMap<String, Integer> hešmapa) {
		StringBuilder sb = new StringBuilder();
		List<String> lista = new ArrayList<String>(hešmapa.keySet());
		Collections.sort(lista);
		for (String ključ : lista) {
			sb.append(ključ + " " + hešmapa.get(ključ) + "\n");
		}
		return sb.toString();
	}
}
