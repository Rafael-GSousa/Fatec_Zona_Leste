package view;

import javax.swing.JOptionPane;

import controller.DivisivelController;

public class Main_Ex23 {

	public static void main(String[] args) {
		
		DivisivelController divCont = new DivisivelController();
		
		String number;
		int num = 0;
		
		number = JOptionPane.showInputDialog("Digite um número inteiro");
		num = Integer.parseInt(number);
		
		if(divCont.divisivelDois(num) && divCont.divisivelTres(num)) {
			JOptionPane.showMessageDialog(null, num + " é divisível por 2 e por 3!");
		}
		else if (divCont.divisivelDois(num) && !divCont.divisivelTres(num)) {
			JOptionPane.showMessageDialog(null, num + " é divisível apenas por 2!");
		}
		else if (!divCont.divisivelDois(num) && divCont.divisivelTres(num)) {
			JOptionPane.showMessageDialog(null, num + " é divisível apenas por 3!");
		}
		else {
			JOptionPane.showMessageDialog(null, num + " é divisível apenas por ele mesmo!");
		}
		
	}

}
