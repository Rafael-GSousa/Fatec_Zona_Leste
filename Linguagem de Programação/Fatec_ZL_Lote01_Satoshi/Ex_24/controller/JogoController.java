package controller;

import javax.swing.JOptionPane;

public class JogoController {
	
	public JogoController() {
		super();
	}
	
	public void tempoJogo(int horaI, int minI, int horaF, int minF) {
		int horaJ = 0, minJ = 0;
		
		horaJ = horaF - horaI;
		
		if(horaJ < 0) {
			horaJ = 24 + horaJ;
		}
		
		minJ = minF - minI;
		
		if(horaI == horaF && minI > minF) {
			horaJ = 24;
		}
		
		if(minJ < 0) {
			if(minF < minI) {
				horaJ = --horaJ;
			}
			minJ = 60 + minJ;
		}
		
		JOptionPane.showMessageDialog(null, "Tempo de jogo >>> " + horaJ + " horas e " + minJ + " minutos");
	}

}
