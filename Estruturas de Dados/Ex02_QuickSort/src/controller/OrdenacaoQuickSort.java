package controller;

public class OrdenacaoQuickSort {
	
	public OrdenacaoQuickSort() {
		super();
	}
	
	public int[] quickSort(int[] vetor, int inicio, int fim) {
		//Se o vetor tem mais de 1 posição
		if (fim > inicio) {
			int posicaoPivoFixo = dividirParaEncontrarPivo(vetor, inicio, fim);
			System.out.println("Posição pivô fixo: "+posicaoPivoFixo);
			//Esquerda
			quickSort(vetor, inicio, posicaoPivoFixo - 1);
			//Direita
			quickSort(vetor, posicaoPivoFixo + 1, fim);
		}
		return vetor;
	}
	
	private int dividirParaEncontrarPivo(int[] vetor, int inicio, int fim) {
		int pivoInicial = vetor[inicio];
		int ponteiroEsq = inicio + 1;
		int ponteiroDir = fim;
		
		while (ponteiroEsq <= ponteiroDir) {
			while (ponteiroEsq <= ponteiroDir && vetor[ponteiroEsq] <= pivoInicial) {
				ponteiroEsq++;
			}
			while (ponteiroDir >= ponteiroEsq && vetor[ponteiroDir] > pivoInicial) {
				ponteiroDir--;
			}
			if (ponteiroEsq < ponteiroDir) {
				trocar(vetor, ponteiroEsq, ponteiroDir);
				ponteiroEsq++;
				ponteiroDir--;
			}
		}
		trocar(vetor, inicio, ponteiroDir);
		int posicaoPivoFixo = ponteiroDir;
		return posicaoPivoFixo;
	}
	
	private void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

}
