package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.rafaelgaldino.Pilha;

public class MainTeste {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		String sim = "A pilha está vazia!";
		String nao = "A pilha não está vazia!";
		String topo = null;

		System.out.println("===============================================");
		System.out.println("==> Verificando pilha antes de empilhar <==");
		System.out.println("===============================================");
		boolean pVazia = p.isEmpty();
		if(pVazia == true) {
			System.out.println(sim);
		} else {
			System.out.println(nao);
		}
		System.out.println("===============================================\n\n");

		
		int tNos = 0;
		
		//definindo a quantidade de nós manualmente
		tNos = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de nós"));
		if(tNos < 0) {
			System.err.println("Apenas valores inteiros maiores do que zero!");
			System.exit(0);
		}
		
		System.out.println("===============================================");
		System.out.println("==> Empilhando e verificando o topo <==");
		System.out.println("===============================================");
		for(int i = 0; i < tNos; i++) { //Empilhando valores
			String vPush = JOptionPane.showInputDialog("Insira os elementos a serem empilhados:"); 
			p.push(vPush);
			try {
				 topo = p.top();
				System.out.println("Topo: " + topo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("===============================================\n\n");
		
		System.out.println("===============================================");
		System.out.println("==> Verificando pilha depois de empilhar <==");
		System.out.println("===============================================");
		pVazia = p.isEmpty();
		if(pVazia == true) {
			System.out.println(sim);
		} else {
			System.out.println(nao);
		}
		System.out.println("===============================================\n\n");
		
		
		System.out.println("===============================================");
		System.out.println("==> Verificando o tamanho da pilha <==");
		System.out.println("===============================================");
		int tamanho = p.size();
		System.out.println("Tamanho da pilha ==> " + tamanho);
		System.out.println("===============================================\n\n");
		
		System.out.println("===============================================");
		System.out.println("==> Desempilhando e verificando o topo<==");
		System.out.println("===============================================");
		System.out.println("Topo: " + topo);
		for(int i = 0; i < tNos; i++) { //Desempilhando valores
			try {
				String valor = p.pop();
				System.out.println("Pop: " + valor);
				try {
					topo = p.top();
					System.out.println("Topo: " + topo);
					
				} catch (Exception e) {
					System.out.println("===============================================\n\n");
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		System.out.println("===============================================");
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
