package view;

import javax.swing.JOptionPane;

import controller.PoupancaController;

public class Main_Ex08 {

	public static void main(String[] args) {
		PoupancaController pCont = new PoupancaController();
		
		String dp = JOptionPane.showInputDialog("Deposite um valor na poupança (Rendimento de 1,3% a.m.)");
		float deposito = Float.parseFloat(dp);
		
		System.out.println("Valor do depósito = R$ " + deposito + "\n" + "Valor após rendimento de 1.3% = R$ " + pCont.calcPoup(deposito));

	}

}
