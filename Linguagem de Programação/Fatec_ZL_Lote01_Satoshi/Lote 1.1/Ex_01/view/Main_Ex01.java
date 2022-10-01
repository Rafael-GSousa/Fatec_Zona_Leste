package view;

import javax.swing.JOptionPane;

import controller.AreaQuadradoController;

public class Main_Ex01 {

	public static void main(String[] args) {
		//instanciando a classe AreaController
		AreaQuadradoController areaCont = new AreaQuadradoController(); 
		
		//criando a janela de diálogo para entrada do valor
		String input = JOptionPane.showInputDialog(null, "Digite o tamanho do lado do quadrado:\n");
		
		//convertendo a entrada em String para double
		double entrada = Double.parseDouble(input);
		
		//definindo a variável que irá receber o retorno do cálculo do método CalcArea, na classe AreaController
		double showArea = areaCont.calcArea(entrada);
		
		//exibindo o resultado em uma janela de diálogo
		JOptionPane.showMessageDialog(null,"O quadrado possui 4 lados de " + entrada + " m.\nLogo, sua área é de "
				+ showArea + " m².");
	}

}
