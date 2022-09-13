package view;

import javax.swing.JOptionPane;

import controller.MultiploController;

public class Main_Ex25 {

	public static void main(String[] args) {
		
		MultiploController mCont = new MultiploController();
		
		String val1 = null, val2 = null;
		int v1 = 0, v2 = 0;
		
		val1 = JOptionPane.showInputDialog("1º valor");
		val2 = JOptionPane.showInputDialog("2º valor");
		
		v1 = Integer.parseInt(val1);
		v2 = Integer.parseInt(val2);
		
		mCont.mostraMultiplo(v1, v2);

	}

}
