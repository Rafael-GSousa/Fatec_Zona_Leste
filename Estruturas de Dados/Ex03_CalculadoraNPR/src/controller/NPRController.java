package controller;

import br.edu.fateczl.rafaelgaldino.Pilha;

public class NPRController {

	public NPRController() {
		super();
	}
	
	int valor1;
	int valor2;
	
	Pilha p = new Pilha();
	
	public void insereValor(Pilha p, int valor) {
				p.push(valor);

	}
	
	public int npr(Pilha p, String op) throws Exception {
		int res = 0;
		
		if(p.size() > 1) {
			valor1 = p.pop();
			valor2 = p.pop();
		
		if(op.equals("+")) {
                res = valor1 + valor2;
        }
		if(op.equals("*")) {
            res = valor1 * valor2;
		}
		if(op.equals("-")) {
            res = valor1 - valor2;
		}
		if(op.equals("/")) {
            res = valor1 / valor2;
		}
		if(op.equals("^")) {
		     res = (int) Math.pow(valor1, valor2);
        }
        p.push(res);
        return res;
	}else {
		throw new Exception("Valores insuficientes!");
	}
}
}