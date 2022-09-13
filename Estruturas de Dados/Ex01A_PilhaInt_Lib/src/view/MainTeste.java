package view;

import br.edu.fateczl.rafaelgaldino.Pilha;

public class MainTeste {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		String sim = "A pilha está vazia!";
		String nao = "A pilha não está vazia!";
		int top;
		
		System.out.println("==> Verificando pilha antes de empilhar <==");
		System.out.println("===========================================");
		boolean pVazia = p.isEmpty();
		if(pVazia == true) {
			System.out.println(sim);
		} else {
			System.out.println(nao);
		}
		System.out.println("===========================================\n");
		
		int qtdNos = ((int)(Math.random()*10)+1);	//definindo a quantidade de nós aleatoriamente

		System.out.println("==> Empilhando e verificando o topo <==");
		System.out.println("===========================================");
		for(int i = 0; i < qtdNos; i++) {	//Empilhando valores
			int vPush = (int)((Math.random() * 1000) + 1); //definindo os valores da pilha aleatoriamente
			p.push(vPush);
			
			try {
				top = p.top();
				System.out.println("Topo: " + top);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("===========================================\n");
		
		System.out.println("==> Verificando pilha depois de empilhar <==");
		System.out.println("===========================================");
		pVazia = p.isEmpty();
		if(pVazia == true) {
			System.out.println(sim);
		} else {
			System.out.println(nao);
		}
		System.out.println("===========================================\n");
		
		System.out.println("==> Verificando o tamanho da pilha <==");
		System.out.println("===========================================");
		int tamanho = p.size();
		System.out.println("Tamanho da pilha ==> " + tamanho);
		System.out.println("===========================================\n");
		
		System.out.println("==> Desempilhando e verificando o topo<==");
		System.out.println("===========================================");
		for(int i = 0; i < qtdNos; i++) { //Desempilhando valores
			try {
				int valor = p.pop();
				System.out.println("Pop: " + valor);
				try {
					top = p.top();
					System.out.println("Topo: " + top);
					
				} catch (Exception e) {
					System.out.println("===========================================\n");
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		

		System.out.println("==> Verificando pilha depois de desempilhar <==");
		System.out.println("===============================================");
		pVazia = p.isEmpty();
		if(pVazia == true) {
			System.out.println(sim);
		} else {
			System.out.println(nao);
		}
		System.out.println("===============================================");
	}

}
