package controller;

import javax.swing.JOptionPane;

public class ValorCorrigidoController {
	
	public ValorCorrigidoController() {
		super();
	}
	
	public void valor(int opc, double valInvest) {
		double valC = 0;
		
		switch(opc) {
		case 1:
			valC = valInvest * 1.03;
			JOptionPane.showMessageDialog(null, "Valor investido com taxa de rendimento	de 3% a.m.: R$ "
			+ valInvest + "\n" + "Valor ap�s rendimento: R$ " + valC);
			break;
		
		case 2:
			valC = valInvest * 1.05;
			JOptionPane.showMessageDialog(null, "Valor investido com taxa de rendimento	de 5% a.m.: R$ "
			+ valInvest + "\n" + "Valor ap�s rendimento: R$ " + valC);
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Op��o de investimento inv�lida!");
			break;
		}
	}

}
