package view;

import javax.swing.JOptionPane;

import controller.KillController;

public class Main {

	public static void main(String[] args) {
		
		KillController kCont = new KillController();
					
		String processo = JOptionPane.showInputDialog("Qual ação gostaria de realizar?\n"
				+ "1 - Matar por PID \n2 - Matar por Nome");
		int option = Integer.parseInt(processo);
		
		String abreProcesso = " ";
		kCont.listaProcessos(abreProcesso);
		
		if(option == 1){			
			String chamaPid = JOptionPane.showInputDialog("Digite o PID");
			int pid = 0;
			pid = Integer.parseInt(chamaPid);
			kCont.mataPid(pid);
		}
		else {
			String nome = JOptionPane.showInputDialog("Digite o Nome");
			kCont.mataNome(nome);
		}
		

		
	}

}
