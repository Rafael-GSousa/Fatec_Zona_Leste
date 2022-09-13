package view;

import controller.OrdenacaoQuickSort;

public class Main {

	public static void main(String[] args) {
		int[] vetor = {100,99,98,97,96,95};
		
		OrdenacaoQuickSort oCont = new OrdenacaoQuickSort();
		vetor = oCont.quickSort(vetor, 0, vetor.length - 1);
		
		System.out.println("");
		System.out.println("=======================================");
		for (int valor : vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("=======================================");

	}

}