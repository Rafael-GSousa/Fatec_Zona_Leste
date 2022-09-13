package view;

import javax.swing.JOptionPane;

import controler.NovoPrecoController;

public class Main_Ex27 {

	public static void main(String[] args) {
		
		NovoPrecoController npCont = new NovoPrecoController();
		
		String pAtual, mMensal;
		double pA, mM;
		
		pAtual = JOptionPane.showInputDialog("Preço atual:");
		mMensal = JOptionPane.showInputDialog("Média mensal:");

		pA = Double.parseDouble(pAtual);
		mM = Double.parseDouble(mMensal);
		
		npCont.newPrice(pA, mM);
	}

}
