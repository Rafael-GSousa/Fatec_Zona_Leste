package view;

import javax.swing.JOptionPane;

import controller.DiferencaController;

public class Main_Ex10 {

	public static void main(String[] args) {
		DiferencaController difCont = new DiferencaController();
		
		String a, b;
		double n1, n2;
		
		a = JOptionPane.showInputDialog("Digite um n�mero real");
		n1 = Double.parseDouble(a);
		
		b = JOptionPane.showInputDialog("Digite outro n�mero real");
		n2 = Double.parseDouble(b);
		
		JOptionPane.showMessageDialog(null, "A diferen�a entre " + n1 + " e " + n2 + " � "
		+ difCont.calcDif(n1, n2));

	}

}
