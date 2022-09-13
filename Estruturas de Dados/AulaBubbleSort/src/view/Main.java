package view;

import controller.OrdenacaoBubbleSort;

public class Main {

	public static void main(String[] args) {
		int[] vetor = {2,0,1,3,7,8,5,4,9,6};
		
		OrdenacaoBubbleSort oBubbleSort = new OrdenacaoBubbleSort();
		
		vetor = oBubbleSort.bubbleSort(vetor);
		
		System.out.println("");
		System.out.println("======================================");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		System.out.println("");
		System.out.println("======================================");

	}

}
