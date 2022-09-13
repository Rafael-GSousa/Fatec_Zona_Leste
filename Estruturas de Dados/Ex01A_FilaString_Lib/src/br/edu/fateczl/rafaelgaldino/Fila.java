package br.edu.fateczl.rafaelgaldino;

public class Fila {

	No inicio;
	No fim;
	
	public Fila() {
		inicio = null;
		fim = null;
	}
	
	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void insert(String valor) {
		No elemento = new No();
		elemento.dado = valor;
		
		//Verificar se � o primeiro elemento
		if (inicio == null) {
			inicio = elemento;
			fim = elemento;
			elemento.proximo = null;
		} else {
			//Verificar se � o segundo elemento
			if (inicio == fim && inicio != null) {
				fim = elemento;
				inicio.proximo = fim;
				fim.proximo = null;
			} else {
				fim.proximo = elemento;
				elemento.proximo = null;
				fim = elemento;
			}
		}
	}
	
	public String remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila vazia");
		}
		No auxiliar = inicio;
		if (inicio == fim && inicio != null) { //Se s� tem 1 elemento
			inicio = null;
			fim = null;
		} else {
			inicio = inicio.proximo;
		}
		System.out.println("Removido: "+auxiliar.toString());
		System.out.println("Novo valor inicial:"+inicio.dado);
		return auxiliar.dado;
	}
	
	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		No auxiliar = inicio;
		System.out.println("========================================");
		while (auxiliar != null) {
			System.out.print(auxiliar.toString() + " ==> ");
			auxiliar = auxiliar.proximo;
		}
		System.out.print("NULL");
		System.out.println("");
		System.out.println("========================================");
	}
	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = inicio;
			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
	public String get(int posicao) throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		if (posicao < 0) {
			throw new Exception("Posi��o inv�lida");
		}
		int tamanho = size();
		if (posicao > tamanho - 1) {
			throw new Exception("Posi��o inexistente");
		}
		int cont = 0;
		No auxiliar = inicio;
		while (cont < posicao) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar.dado;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		int tamanho = size();
		try {
			for (int i = 0 ; i < tamanho ; i++) {
				buffer.append("[");
				buffer.append(get(i));
				buffer.append("]");
				buffer.append("[]->");
				if (i == tamanho - 1) {
					buffer.append("NULL");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}
	
}