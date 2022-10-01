package view;

import javax.swing.JOptionPane;

import controller.VolumeController;

public class Main_Ex07 {

	public static void main(String[] args) {
		
		VolumeController vCont = new VolumeController();
		
		String c = null, l = null, a = null;
		double comp = 0, larg = 0, alt = 0, vol = 0;
		
		c = JOptionPane.showInputDialog("Comprimento:");
		comp = Double.parseDouble(c);
		
		l = JOptionPane.showInputDialog("Largura:");
		larg = Double.parseDouble(l);
		
		a = JOptionPane.showInputDialog("Altura:");
		alt = Double.parseDouble(a);
		
		vol = vCont.calcVolume(comp, larg, alt);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("===========================");
		buffer.append("\n");
		buffer.append("|| Volume de um Paralelepípedo ||");
		buffer.append("\n");
		buffer.append("===========================");
		buffer.append("\n\n");
		buffer.append("Comprimento = ");
		buffer.append(comp);
		buffer.append("m²");
		buffer.append("\n");
		buffer.append("Largura = ");
		buffer.append(larg);
		buffer.append("m²");
		buffer.append("\n");
		buffer.append("Altura = ");
		buffer.append(alt);
		buffer.append("m²");
		buffer.append("\n");
		buffer.append("Volume = ");
		buffer.append(vol);
		buffer.append("m³");
		
		JOptionPane.showMessageDialog(null, buffer);
		

	}

}
