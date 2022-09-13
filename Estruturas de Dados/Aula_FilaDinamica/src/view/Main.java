package view;

import model.Fila;

public class Main {

	public static void main(String[] args) {
		
		Fila f = new Fila();
		
		boolean vazia = f.isEmpty();
		System.out.println("Vazia: " + vazia);
		
//		f.insert(1);
//		f.insert(2);
//		f.insert(3);
//		f.insert(4);
		for(int i = 0 ; i < 10 ; i++) {
			int rnd = (int)((Math.random() * 100) + 1);
			f.insert(rnd);
		}
		System.out.println(f.toString());
		
		try {
			int valor = f.get(3);
			System.out.println("Dado da posição 3: " + valor);
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		
		vazia = f.isEmpty();
		System.out.println("Vazia: " + vazia);
		
		int tamanho = f.size();
		System.out.println("Tamanho da fila: " + tamanho);
		
		try {
			f.list();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			int removido = f.remove();
			removido = f.remove();
			f.list();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
