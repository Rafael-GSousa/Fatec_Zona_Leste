package view;

import javax.swing.JOptionPane;

import controller.OrdemController;

public class Main_Ex21 {

	public static void main(String[] args) {
		
		OrdemController oCont = new OrdemController();
		
		String a, b;
		int n1, n2;
		
		a = JOptionPane.showInputDialog("1� valor inteiro");
		n1 = Integer.parseInt(a);
		
		b = JOptionPane.showInputDialog("2� valor inteiro");
		n2 = Integer.parseInt(b);
		
		oCont.ordem(n1, n2);

	}

}
