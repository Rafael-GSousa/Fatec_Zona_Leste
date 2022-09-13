package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Action implements ActionListener {

	private JLabel Carro1, Carro2;
	private JButton btnCorrer;
	private JTextField Vencedor, Perdedor;

	public Action(JButton btnCorrer, JLabel Carro1, JLabel Carro2, JTextField Vencedor, JTextField Perdedor) {
		this.btnCorrer = btnCorrer;
		this.Carro1 = Carro1;
		this.Carro2 = Carro2;
		this.Vencedor = Vencedor;
		this.Perdedor = Perdedor;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		CarThread t1 = new CarThread(btnCorrer, Carro1, Vencedor, Perdedor);
		CarThread t2 = new CarThread(btnCorrer, Carro2, Vencedor, Perdedor);
		t1.start();
		t2.start();
	}

}