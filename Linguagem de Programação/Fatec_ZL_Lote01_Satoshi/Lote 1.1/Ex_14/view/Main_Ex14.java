package view;

import javax.swing.JOptionPane;

import controller.AnguloController;

public class Main_Ex14 {

	public static void main(String[] args) {
		
		AnguloController angCont = new AnguloController();
		
		String a1, a2;
		double ang1, ang2;
		
		a1 = JOptionPane.showInputDialog("�ngulo 1");
		ang1 = Double.parseDouble(a1);
		
		a2 = JOptionPane.showInputDialog("�ngulo 2");
		ang2 = Double.parseDouble(a2);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("1� �ngulo = ");
		buffer.append(ang1);
		buffer.append("\n");
		buffer.append("2� �ngulo = ");
		buffer.append(ang2);
		buffer.append("\n");
		buffer.append("3� �ngulo = ");
		buffer.append(angCont.anguloT(ang1, ang2));
		
		System.out.println(buffer);

	}

}
