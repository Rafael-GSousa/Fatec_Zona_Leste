package view;

import controller.VetorController;

public class Principal {

    public static void main(String[] args) {
		VetorController op = new VetorController();
		
    	int[] vet1000 = op.geraVetor(1000);
    	int[] vet10000 = op.geraVetor(10000);
    	int[] vet100000 = op.geraVetor(100000);
    	
    	op.percorreVetor(vet1000);
    	op.percorreVetor(vet10000);
    	op.percorreVetor(vet100000);
    	

	}
    
}

 /*
 <F11> - Run in debug mode
 <ctrl + /> - comenta a linha toda
 <ctrl + F11> - Run
 <ctrl + s> - salva a classe ativa
 <ctrl + shift + s> - salva todas as classes abertas
*/