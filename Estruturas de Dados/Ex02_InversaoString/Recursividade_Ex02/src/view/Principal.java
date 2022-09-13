package view;

//importação da classe JOptionPane para abrir a janela de diálogo
import javax.swing.JOptionPane;

//importação da classe de controle
import controller.InverteString;

public class Principal {

	public static void main(String[] args) {
				
		//declaração das variáveis de entrada e saída
		String entrada, saida;
		
		//variável que irá receber a cadeia de caracteres
		entrada = JOptionPane.showInputDialog("Entre com uma cadeia de caracteres");
		
		//método construtor
		InverteString inverte = new InverteString();
		
		//variável que irá receber a inversão dos caracteres
		saida = inverte.inverteString(entrada);
		
		//exibição do resultado no console
		System.out.println("Normal --> "+entrada+".");
		System.out.println("Inverso --> "+saida+".");

	}
}