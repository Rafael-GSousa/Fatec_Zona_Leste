package view;
import javax.swing.JOptionPane;

//Importando a classe de controle do Fatorial
import controller.Controller;

public class Main {

	public static void main(String[] args) {
//		Metodo construtor
		Controller fatSoma = new Controller();
//		Definindo um valor para a soma
		int somaNat = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número natural: "));
//		Condição para entrada apenas de valores inteiros positivos
		if(somaNat < 0) {
			System.err.println("Apenas valores inteiros e positivos!");
			System.exit(0);
		}
//		variavel que recebe o resultado
		int somaNaturais = fatSoma.resultado(somaNat);
		System.out.println("Resultado: "+somaNaturais);
	}

}