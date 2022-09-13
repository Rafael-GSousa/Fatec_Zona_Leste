package view;

import javax.swing.JOptionPane;

import controller.RepeticaoController;

public class Main {

	public static void main(String[] args) {
		
		RepeticaoController rep = new RepeticaoController();

//		definindo a 1� entrada na caixa de di�logo
		String n1 = JOptionPane.showInputDialog("Digite o primeiro valor inteiro de 10 a 999999");
//		convertendo para inteiro
		int num1 = Integer.parseInt(n1);
/*		se a 1� entrada n�o atender ao que foi estipulado
		ser� exibida uma mensagem e a aplica��o ser� encerrada */
		if(num1 < 10 || num1 > 999999) {
			System.err.println("Entrada inv�lida!");
			System.exit(0);
		}
//		definindo a 2� entrada na caixa de di�logo		
		String n2 = JOptionPane.showInputDialog("Digite o segundo valor inteiro de 0 a 9");
//		convertendo para inteiro
		int num2 = Integer.parseInt(n2);
/*		se a 2� entrada n�o atender ao que foi estipulado
		ser� exibida uma mensagem e a aplica��o ser� encerrada */		
		if(num2 < 0 || num2 > 9) {
			System.err.println("Entrada inv�lida!");
			System.exit(0);
		}
		
		int repetir = rep.repeticao(num1, num2);
		
		System.out.println("O n�mero " + num2 + " aparece " + repetir + " vez(es) no n�mero " + num1 + ".");
			
		}
		
}


