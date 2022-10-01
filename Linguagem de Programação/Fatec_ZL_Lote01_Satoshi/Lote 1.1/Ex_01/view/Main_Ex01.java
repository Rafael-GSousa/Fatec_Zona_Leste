package view;

import javax.swing.JOptionPane;

import controller.AreaQuadradoController;

public class Main_Ex01 {

	public static void main(String[] args) {
		//instanciando a classe AreaController
		AreaQuadradoController areaCont = new AreaQuadradoController(); 
		
		//criando a janela de di�logo para entrada do valor
		String input = JOptionPane.showInputDialog(null, "Digite o tamanho do lado do quadrado:\n");
		
		//convertendo a entrada em String para double
		double entrada = Double.parseDouble(input);
		
		//definindo a vari�vel que ir� receber o retorno do c�lculo do m�todo CalcArea, na classe AreaController
		double showArea = areaCont.calcArea(entrada);
		
		//exibindo o resultado em uma janela de di�logo
		JOptionPane.showMessageDialog(null,"O quadrado possui 4 lados de " + entrada + " m.\nLogo, sua �rea � de "
				+ showArea + " m�.");
	}

}
