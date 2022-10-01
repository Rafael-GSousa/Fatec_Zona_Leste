package view;

import javax.swing.JOptionPane;

import controller.VelocidadeMediaController;

public class Main_Ex26 {

	public static void main(String[] args) {
		VelocidadeMediaController vMedia = new VelocidadeMediaController();
		
		String numV, extensao, tempo;
		double ext, t, velocidade;
		int nv;
		
		numV = JOptionPane.showInputDialog("Nº de voltas");
		extensao = JOptionPane.showInputDialog("Extensão do circuito");
		tempo = JOptionPane.showInputDialog("tempo de duração em minutos");
		
		nv = Integer.parseInt(numV);
		ext = Double.parseDouble(extensao);
		t = Double.parseDouble(tempo);
		
		velocidade = vMedia.vMedia(nv, ext, t);
		
		System.out.println("Nº de voltas >>> " + nv);
		System.out.println("Extensão do circuito >>> " + ext + " m.");
		System.out.println("Tempo de duração >>> " + t + " min.");
		System.out.println("Velocidade média >>> " + velocidade + " Km/h.");
	}

}
