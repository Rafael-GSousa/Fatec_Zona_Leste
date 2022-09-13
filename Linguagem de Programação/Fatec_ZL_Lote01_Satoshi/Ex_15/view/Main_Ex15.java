package view;

import javax.swing.JOptionPane;

import controller.HipotenusaController;

public class Main_Ex15 {

	public static void main(String[] args) {
		HipotenusaController hipCont = new HipotenusaController();
		
		String c1, c2;
		double cat1, cat2;
		
		c1 = JOptionPane.showInputDialog("Cateto oposto");
		cat1 = Double.parseDouble(c1);
		
		c2 = JOptionPane.showInputDialog("Cateto adjacente");
		cat2 = Double.parseDouble(c2);
		
		System.out.println("Cateto oposto = " + cat1 + "\nCateto adjacente = " + cat2 + 
				"\nHipotenusa = " + hipCont.calcHipo(cat1, cat2));

	}

}
