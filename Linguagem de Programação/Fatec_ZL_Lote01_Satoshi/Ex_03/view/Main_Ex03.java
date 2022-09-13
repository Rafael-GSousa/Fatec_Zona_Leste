package view;

import javax.swing.JOptionPane;

import controller.AreaTrianguloController;

public class Main_Ex03 {

	public static void main(String[] args) {
		AreaTrianguloController areaCont = new AreaTrianguloController();
		
		String inputBase = JOptionPane.showInputDialog(null, "Digite o valor da base:");
		double entradaBase = Double.parseDouble(inputBase); 
		
		String inputAltura = JOptionPane.showInputDialog(null, "Digite o valor da altura");
		double entradaAltura = Double.parseDouble(inputAltura);
		
		double areaT = areaCont.calcTriangulo(entradaBase, entradaAltura);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Área de um Triângulo");
		buffer.append("\n");
		buffer.append("Base = ");
		buffer.append(entradaBase);
		buffer.append("\n");
		buffer.append("Altura = ");
		buffer.append(entradaAltura);
		buffer.append("\n");
		buffer.append("Área = ");
		buffer.append(areaT);
		
		JOptionPane.showMessageDialog(null, buffer);

	}

}
