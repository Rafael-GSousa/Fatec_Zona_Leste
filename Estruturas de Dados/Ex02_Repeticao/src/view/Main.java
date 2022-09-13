package view;

import javax.swing.JOptionPane;

import controller.RepeticaoController;

public class Main {

	public static void main(String[] args) {
		
		RepeticaoController rep = new RepeticaoController();

//		definindo a 1ª entrada na caixa de diálogo
		String n1 = JOptionPane.showInputDialog("Digite o primeiro valor inteiro de 10 a 999999");
//		convertendo para inteiro
		int num1 = Integer.parseInt(n1);
/*		se a 1ª entrada não atender ao que foi estipulado
		será exibida uma mensagem e a aplicação será encerrada */
		if(num1 < 10 || num1 > 999999) {
			System.err.println("Entrada inválida!");
			System.exit(0);
		}
//		definindo a 2ª entrada na caixa de diálogo		
		String n2 = JOptionPane.showInputDialog("Digite o segundo valor inteiro de 0 a 9");
//		convertendo para inteiro
		int num2 = Integer.parseInt(n2);
/*		se a 2ª entrada não atender ao que foi estipulado
		será exibida uma mensagem e a aplicação será encerrada */		
		if(num2 < 0 || num2 > 9) {
			System.err.println("Entrada inválida!");
			System.exit(0);
		}
		
		int repetir = rep.repeticao(num1, num2);
		
		System.out.println("O número " + num2 + " aparece " + repetir + " vez(es) no número " + num1 + ".");
			
		}
		
}


