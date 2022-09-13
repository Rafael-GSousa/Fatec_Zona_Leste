package view;

import controller.OrdenacaoController;

public class Main {

	public static void main(String[] args) {
		int[] vetor = {15,18,29,1,0,4,13,18,25,15,43,0};
		
		OrdenacaoController oMergeSort = new OrdenacaoController();
		
		vetor = oMergeSort.mergeSort(vetor , 0 , vetor.length - 1);
		
		System.out.println("");
		System.out.println("===============================");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		System.out.println("");
		System.out.println("===============================");

	}

}