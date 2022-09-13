package view;

import controller.OrdenacaoController;

public class Main {

	public static void main(String[] args) {
		int[] vetor = {100,99,98,97,96,95};
		
		OrdenacaoController oBubbleSort = new OrdenacaoController();
		
		vetor = oBubbleSort.bubbleSort(vetor);
		
		System.out.println("");
		System.out.println("===============================");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		System.out.println("");
		System.out.println("===============================");

	}

}