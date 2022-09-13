package view;

import javax.swing.JOptionPane;

import controller.MediaController;

public class Main_Ex20 {

	public static void main(String[] args) {
		
		MediaController mdCont = new MediaController();
		
		String nota1, nota2, nota3, nota4;
		double n1, n2, n3, n4;
		
		nota1 = JOptionPane.showInputDialog("Nota do 1º Bimestre");
		n1 = Double.parseDouble(nota1);
		
		nota2 = JOptionPane.showInputDialog("Nota do 2º Bimestre");
		n2 = Double.parseDouble(nota2);
		
		nota3 = JOptionPane.showInputDialog("Nota do 3º Bimestre");
		n3 = Double.parseDouble(nota3);
		
		nota4 = JOptionPane.showInputDialog("Nota do 4º Bimestre");
		n4 = Double.parseDouble(nota4);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Situação do Aluno");
		buffer.append("\n");
		buffer.append("Nota do 1º Bimestre >>> ");
		buffer.append(n1);
		buffer.append("\n");
		buffer.append("Nota do 2º Bimestre >>> ");
		buffer.append(n2);
		buffer.append("\n");
		buffer.append("Nota do 3º Bimestre >>> ");
		buffer.append(n3);
		buffer.append("\n");
		buffer.append("Nota do 4º Bimestre >>> ");
		buffer.append(n4);
		buffer.append("\n");
		buffer.append("Média final >>>");
		buffer.append(mdCont.calcNota(n1, n2, n3, n4));
		buffer.append("\n");
		buffer.append("Situação >>> ");
		buffer.append(mdCont.retornoMencao(n1, n2, n3, n4));
		
		JOptionPane.showMessageDialog(null, buffer);

	}

}
