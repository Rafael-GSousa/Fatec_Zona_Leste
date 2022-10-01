package view;

import javax.swing.JOptionPane;

import controller.ValorCorrigidoController;

public class Main_Ex28 {

	public static void main(String[] args) {
		
		ValorCorrigidoController vcCont = new ValorCorrigidoController();
		
		String option, investimento;
		int opc;
		double val;
		
		option = JOptionPane.showInputDialog("Digite a opção desejada:" + "\n" + "1 - Poupança" + "\n"
		+ "2 - Renda fixa");
		opc = Integer.parseInt(option);
		
		investimento = JOptionPane.showInputDialog("Digite o valor investido:");
		val = Double.parseDouble(investimento);
		
		vcCont.valor(opc, val);

	}

}
