package view;

import javax.swing.JOptionPane;

import controller.VelocidadeMediaController;

public class Main_Ex26 {

	public static void main(String[] args) {
		VelocidadeMediaController vMedia = new VelocidadeMediaController();
		
		String numV, extensao, tempo;
		double ext, t, velocidade;
		int nv;
		
		numV = JOptionPane.showInputDialog("N� de voltas");
		extensao = JOptionPane.showInputDialog("Extens�o do circuito");
		tempo = JOptionPane.showInputDialog("tempo de dura��o em minutos");
		
		nv = Integer.parseInt(numV);
		ext = Double.parseDouble(extensao);
		t = Double.parseDouble(tempo);
		
		velocidade = vMedia.vMedia(nv, ext, t);
		
		System.out.println("N� de voltas >>> " + nv);
		System.out.println("Extens�o do circuito >>> " + ext + " m.");
		System.out.println("Tempo de dura��o >>> " + t + " min.");
		System.out.println("Velocidade m�dia >>> " + velocidade + " Km/h.");
	}

}
