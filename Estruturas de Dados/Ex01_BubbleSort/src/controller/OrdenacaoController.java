package controller;

public class OrdenacaoController {
	
	public OrdenacaoController() {
		super();
	}
	
	public int[] bubbleSort(int[] vetor) {
		int tamanho = vetor.length;
		
		//Rodadas
		for (int i = 0; i < tamanho; i++) {

			
			//Dinâmica
			for (int j = 0; j < tamanho - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
			
			for (int valor : vetor) {
				System.out.print(valor + " ");
			}
			System.out.println(" ==> Rodada #" + (i + 1));
		}
		
		return vetor;
	}

}
