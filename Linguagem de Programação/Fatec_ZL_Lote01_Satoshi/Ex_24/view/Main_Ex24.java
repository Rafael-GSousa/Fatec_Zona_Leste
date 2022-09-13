package view;

import javax.swing.JOptionPane;

import controller.JogoController;

public class Main_Ex24 {

	public static void main(String[] args) {
		JogoController jCont = new JogoController();
		
		String horaI, minI, horaF, minF;
		int hi, mi, hf, mf;
		
		horaI = JOptionPane.showInputDialog("Hora incial");
		minI =  JOptionPane.showInputDialog("Minuto incial");
		horaF = JOptionPane.showInputDialog("Hora final");
		minF =  JOptionPane.showInputDialog("Minuto final");
		
		hi = Integer.parseInt(horaI);
		mi = Integer.parseInt(minI);
		hf = Integer.parseInt(horaF);
		mf =Integer.parseInt(minF);
		
		jCont.tempoJogo(hi, mi, hf, mf);

	}

}
