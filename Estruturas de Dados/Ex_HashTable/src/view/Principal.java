package view;

import java.util.ArrayList;
import java.util.Hashtable;

import controller.HashController;

public class Principal {

	public static void main(String[] args) {
		HashController hash = new HashController();
		Hashtable<Integer, ArrayList<Integer>> numeros = new Hashtable<Integer, ArrayList<Integer>>();
		ArrayList<Integer> lista0 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		ArrayList<Integer> lista4 = new ArrayList<Integer>();
		int[] v = { 2, 7, 8, 8, 9, 10, 99, 11, 23, 32, 23, 35, 63, 2, 3, 6, 12};
		int chave;
		
		for (int i = 0; i < v.length; i++) {
			chave = hash.minhaFuncaoHash(v[i]);
			switch(chave) {
				case 0:
					if (lista0.isEmpty()) numeros.put(chave, lista0);
					lista0.add(v[i]);
					break;
				case 2:
					if (lista0.isEmpty()) numeros.put(chave, lista2);
					lista2.add(v[i]);
					break;
				case 4:
					if (lista0.isEmpty()) numeros.put(chave, lista4);
					lista4.add(v[i]);
					break;
			}
		}
		
		System.out.println(numeros.toString());
	}

}