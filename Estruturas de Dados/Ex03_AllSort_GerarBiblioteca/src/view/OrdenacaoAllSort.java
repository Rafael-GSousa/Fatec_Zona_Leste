package view;

import br.edu.fateczl.rafaelgaldino.OrdenacaoController;

public class OrdenacaoAllSort {

	public static void main(String[] args) {
		int[] vetor = {100,75,83,500,97,2,0,-7};
		
		OrdenacaoController oCont = new OrdenacaoController();
		
		System.out.println("BubbleSort");
		System.out.println("=======================================");
		vetor = oCont.bubbleSort(vetor);
		System.out.println("=======================================");
		
		System.out.println("");
		System.out.println("MergeSort");
		System.out.println("=======================================");
		vetor = oCont.mergeSort(vetor, 0, vetor.length - 1);
		System.out.println("=======================================");
		
		System.out.println("");
		System.out.println("QuickSort");
		System.out.println("=======================================");
		vetor = oCont.quickSort(vetor, 0, vetor.length - 1);
		System.out.println("=======================================");
		
		System.out.println("");
		
		System.out.println("Vetor Ordenado");
		System.out.println("=======================================");
		for (int valor : vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("=======================================");

	}

}