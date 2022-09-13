package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex3OkController implements ActionListener{
	
	private JTextField tfcaminho;
	private JFrame tela;
	
	public Ex3OkController (JTextField tfcaminho, JFrame tela) {
		this.tfcaminho = tfcaminho;
		this.tela = tela;
	}

	public boolean validatexto () {
		boolean valido = true;
		if (tfcaminho.getText().trim().equals("")){
			JOptionPane.showMessageDialog(null, "Digite o caminho ou clique em Procurar para buscar o arquivo desejado","ERRO!!", JOptionPane.ERROR_MESSAGE);
			valido = false;
		}
		return valido;
	}
	
	public void executaProcesso() {
		String processo = tfcaminho.getText();
		try {
			Runtime.getRuntime().exec(processo);
			tela.dispose();
		} catch (IOException e) {
			if (e.getMessage().contains("740")) {
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd /c");
				buffer.append(" ");
				buffer.append(processo);
				try {
					Runtime.getRuntime().exec(buffer.toString());
					tela.dispose();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "N�o foi poss�vel executar o processo!","ERRO!!", JOptionPane.ERROR_MESSAGE);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "N�o foi poss�vel executar o processo! \n Verifique o caminho digitado e tente novamente.","ERRO!!", JOptionPane.ERROR_MESSAGE); 
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean valido = validatexto();
		if (valido) {
			executaProcesso();
			
		}
	}

}