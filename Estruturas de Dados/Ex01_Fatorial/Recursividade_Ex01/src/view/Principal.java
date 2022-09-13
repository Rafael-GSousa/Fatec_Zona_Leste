package view;

//importa��o da classe JOptionPane para abrir a janela de di�logo
import javax.swing.JOptionPane;

//importa��o da classe de controle
import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
				
		//defini��o da vari�vel entrada (para inserir o valor inicial)
		//defini��o da vari�vel resultado (para exibir o valor do fatorial da entrada)
		int entrada, resultado;
		
		//janela de di�logo para inser��o do valor inicial
		entrada = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro at� 12"));
		
		//m�todo construtor
		FatorialController ft = new FatorialController();
		
		//vari�vel que ir� receber o c�lculo do fatorial da entrada
		resultado = ft.calcFat(entrada);
		
		//exibi��o do resultado no console
		System.out.println("O fatorial de "+entrada+" � "+resultado+".");

	}
}
