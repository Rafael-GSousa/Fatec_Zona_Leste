package view;

import javax.swing.JOptionPane;

import controller.OrdController;

public class Main_Ex22 {

	public static void main(String[] args) {
		OrdController oCont = new OrdController();
		
		String a, b, c, d;
		double v1, v2, v3, v4;
		
		a = JOptionPane.showInputDialog("1� valor");
		b = JOptionPane.showInputDialog("2� valor");
		c = JOptionPane.showInputDialog("3� valor");
		d = JOptionPane.showInputDialog("4� valor");
		
		v1 = Double.parseDouble(a);
		v2 = Double.parseDouble(b);
		v3 = Double.parseDouble(c);
		v4 = Double.parseDouble(d);

		oCont.ordem(v1, v2, v3, v4);
	}

}
