package br.edu.fateczl.rafaelgaldino;

public class Pilha {
	
	No topo;
	int tamanho;

	public Pilha() {
		topo = null;		
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(String e) {
		No elemento = new No();
		elemento.dado = e;
		
		if (isEmpty() == true) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
		System.out.println("Push: " + e);
		
	}
	
	public String pop() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Não há elementos para desempilhar");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
		
	}
	
	public String top() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Não há elementos na pilha");
		}
		String valor = topo.dado;
		return valor;
		
	}
	
	public int size() {
		int cont = 0;
		if(isEmpty() == false) {
//		if(isEmpty() != true) { >>>mesma coisa que (isEmpty() == false)
//		if(!isEmpty()) {	>>>mesma coisa que (isEmpty() == false) e (isEmpty() != true)
			No auxiliar = topo;
			cont = 1;
			while(auxiliar.proximo != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		
		return cont;
	}

}
