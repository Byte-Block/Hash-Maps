import java.util.ArrayList;
import java.util.HashMap;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Деда Мраз има две листе (једну са свом децом,а другу са децом која су
		 * учинила неко добро дело) Помозите му да направи HashMap<String,Integer> који
		 * би чувао име сваког детета, и то колико је добрих дела учинило Тестирати
		 * програм: Направити две листе (једна садржана у другој) и након тога,користећи
		 * вашу методу формирати HashMap, и онда исписати имена деце која су учинила
		 * више од 1 доброг дела.
		 * 
		 * Напомена: ваша метода прима две листе и враћа HashMap
		 */
		ArrayList<String> svaDeca = new ArrayList<String>();
		svaDeca.add("Raja");
		svaDeca.add("Gaja");
		svaDeca.add("Vlaja");
		svaDeca.add("Micha");
		svaDeca.add("Ticha");

		ArrayList<String> nekoDoroDeloDeca = new ArrayList<String>();
		nekoDoroDeloDeca.add("Vlaja");
		nekoDoroDeloDeca.add("Micha");
		nekoDoroDeloDeca.add("Vlaja");
		nekoDoroDeloDeca.add("Gaja");
		nekoDoroDeloDeca.add("Gaja");
		nekoDoroDeloDeca.add("Gaja");
		nekoDoroDeloDeca.add("Gaja");
		nekoDoroDeloDeca.add("Gaja");
		nekoDoroDeloDeca.add("Ticha");

		HashMap<String, Integer> rezultat = viseOdJednogDobrogDela(svaDeca, nekoDoroDeloDeca);
		System.out.println("Deca koja imaju vise od 1 dobrog dela: ");
		for (String s : rezultat.keySet()) {
			if (rezultat.get(s) > 1) {
				System.out.println(s + ", broj dobrih dela: " + rezultat.get(s));
			}
		}
	}

	public static HashMap<String, Integer> viseOdJednogDobrogDela(ArrayList<String> svaDeca,
			ArrayList<String> nekoDoroDeloDeca) {
		HashMap<String, Integer> decaDobraDelaMapa = new HashMap<String, Integer>();
		for (String s : svaDeca) {
			decaDobraDelaMapa.put(s, 0);
		}
		for (String s : nekoDoroDeloDeca) {
			if (decaDobraDelaMapa.containsKey(s)) {
				decaDobraDelaMapa.put(s, decaDobraDelaMapa.get(s) + 1);
			}
		}
		return decaDobraDelaMapa;
	}

}
