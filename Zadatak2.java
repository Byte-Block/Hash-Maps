import java.util.HashMap;
import java.util.Map.Entry;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Написати методу која тражи који се елемент у низу понавља непаран број
		 * пута (Користити HashMap, ако не успете, урадите задатак било како (носи мање
		 * поена))
		 * 
		 * [2,3,5,4,5,2,4,3,5,2,4,4,2] -> 5 јер се петица појављује 3 пута
		 * 
		 */
		int[] niz = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		System.out.println(elementUNizuPonavljaNeparanBrojPuta(niz));
		//elementUNizuPonavljaParanBrojPuta(niz);
	}

	public static void elementUNizuPonavljaParanBrojPuta(int[] niz) {
		HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();

		for (int broj : niz) {
			if (mapa.containsKey(broj)) {
				mapa.put(broj, mapa.get(broj) ^ 1);
			} else {
				mapa.put(broj, 1);
			}
		}

		for (Entry<Integer, Integer> entry : mapa.entrySet()) {
			if (entry.getValue() == 0) {
				System.out.println(entry.getKey());
			}
		}
	}

	public static int elementUNizuPonavljaNeparanBrojPuta(int[] niz) {
		int i;
		HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
		for (i = 0; i < niz.length; i++) {
			int element = niz[i];
			if (mapa.get(element) == null) {
				mapa.put(element, 1);
			} else {
				mapa.put(element, mapa.get(element) + 1);
			}
		}
		for (Entry<Integer, Integer> entry : mapa.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}
}
