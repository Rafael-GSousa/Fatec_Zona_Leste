package view;

//importa��o da classe JOptionPane para abrir a janela de di�logo
import javax.swing.JOptionPane;

//importa��o da classe de controle
import controller.InverteString;

public class Principal {

	public static void main(String[] args) {
				
		//declara��o das vari�veis de entrada e sa�da
		String entrada, saida;
		
		//vari�vel que ir� receber a cadeia de caracteres
		entrada = JOptionPane.showInputDialog("Entre com uma cadeia de caracteres");
		
		//m�todo construtor
		InverteString inverte = new InverteString();
		
		//vari�vel que ir� receber a invers�o dos caracteres
		saida = inverte.inverteString(entrada);
		
		//exibi��o do resultado no console
		System.out.println("Normal --> "+entrada+".");
		System.out.println("Inverso --> "+saida+".");

	}
}