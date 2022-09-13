package view;

//importação da classe JOptionPane para abrir a janela de diálogo
import javax.swing.JOptionPane;

//importação da classe de controle
import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
				
		//definição da variável entrada (para inserir o valor inicial)
		//definição da variável resultado (para exibir o valor do fatorial da entrada)
		int entrada, resultado;
		
		//janela de diálogo para inserção do valor inicial
		entrada = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro até 12"));
		
		//método construtor
		FatorialController ft = new FatorialController();
		
		//variável que irá receber o cálculo do fatorial da entrada
		resultado = ft.calcFat(entrada);
		
		//exibição do resultado no console
		System.out.println("O fatorial de "+entrada+" é "+resultado+".");

	}
}
