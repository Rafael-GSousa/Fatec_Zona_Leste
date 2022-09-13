package controller;

import javax.swing.JOptionPane;

import model.Fila;



public class FilaController {

	private static int chamadasPrioritarias = 0;
	private StringBuffer senhaChamada = new StringBuffer("CHAMADA! \n");

	public FilaController() {
		super();
	}

	public void insereSenha(Fila fila, int senhaPrioritaria) {
		fila.insert(senhaPrioritaria);
		JOptionPane.showMessageDialog(null, "Senha " + senhaPrioritaria + " gerada.");
	}

	public void chamarParaConsultas(Fila fila, Fila filaPrioritarios) throws Exception {
		
		try {
			if (((chamadasPrioritarias > 0 && chamadasPrioritarias % 3 == 0) || filaPrioritarios.isEmpty()) && !fila.isEmpty()) {
				chamar(fila);
			} else if (!filaPrioritarios.isEmpty()) {
				chamarPrioritarios(filaPrioritarios);
			}
		} catch (Exception e) {
			if (fila.isEmpty() && fila.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não há senhas para serem chamadas");
			} else if (!fila.isEmpty()) {
				chamadasPrioritarias = 0;
				chamar(fila);
			} else {
				chamarPrioritarios(filaPrioritarios);
			}
		}

	}
	
	
	public void chamarPrioritarios(Fila filaPrioritarios) throws Exception {
		int senhaPrioritaria = filaPrioritarios.remove();
		senhaChamada.append("Senha Prioritária " + senhaPrioritaria + "\n");
		JOptionPane.showMessageDialog(null, senhaChamada);
		
		chamadasPrioritarias++;
	}
	
	public void chamar(Fila fila) throws Exception {
		chamadasPrioritarias = 0;
		
		int senha = fila.remove();
		senhaChamada.append("Senha " + senha + "\n");

		JOptionPane.showMessageDialog(null, senhaChamada);
	}

}