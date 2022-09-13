package controller;

public class VetorController {
	
	public VetorController() {
		super();
	}
	
	@SuppressWarnings("unused")
	public void percorreVetor(int[] vetorInt) {
		int tamanho = vetorInt.length;
		
		double tempoInicial = System.nanoTime();
		for (int i : vetorInt) {
			
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println(tamanho+" posições: "+tempoTotal+" s.");
	}


	public int[] geraVetor(int posicoes) {
		int[] vet = new int[posicoes];
		for (int i = 0 ; i < posicoes ; i++) {
			vet[i] = 0;
		}
		return vet;
	}
}
