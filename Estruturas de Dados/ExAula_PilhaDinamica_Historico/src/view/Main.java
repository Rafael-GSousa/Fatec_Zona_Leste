package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.rafaelgaldino.Pilha;
import controller.HistoricoController;

public class Main {

	public static void main(String[] args) {
		Pilha historico = new Pilha();
		HistoricoController hCont = new HistoricoController();
		
		int opc = 0;
		
		while(opc != 9) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("Digite uma opção:\n");
			buffer.append("1 - Inserir site no histórico \n");
			buffer.append("2 - Excluir site do histórico \n");
			buffer.append("3 - Consultar último site visitado \n");
			buffer.append("9 - Sair \n");
			String opcStr = JOptionPane.showInputDialog(null, buffer.toString());
			opc = Integer.parseInt(opcStr);
			switch(opc) {
			case 1:
				String site = JOptionPane.showInputDialog(null, "Digite um site");
				hCont.insereEndereco(historico, site);
				break;
			case 2:
				try {
				hCont.removeEndereco(historico);
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
				hCont.consultaUltimo(historico);
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			default:
				break;
			}
		}
	}

}
