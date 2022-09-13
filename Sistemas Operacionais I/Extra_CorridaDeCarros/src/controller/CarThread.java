package controller;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Rectangle;

public class CarThread extends Thread {

	private JLabel Carro;
	private JButton btnCorrer;
	private JTextField Vencedor, Perdedor;
	private int distanciaMax = 700, distanciaPercorrida = 0;

	public CarThread(JButton btnCorrer, JLabel Carro, JTextField Vencedor, JTextField Perdedor) {
		this.btnCorrer = btnCorrer;
		this.Carro = Carro;
		this.Vencedor = Vencedor;
		this.Perdedor = Perdedor;
	}

	@Override
	public void run() {
		Corrida();
	}

	private void Corrida() {
		btnCorrer.setVisible(false);
		Vencedor.setText("");
		Perdedor.setText("");

		while (distanciaPercorrida < distanciaMax) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Rectangle posicaoCarro = Carro.getBounds();
			distanciaPercorrida += Math.random() * 10;
			if (distanciaPercorrida >= distanciaMax) {
				posicaoCarro.x = distanciaMax;
			} else {
				posicaoCarro.x = distanciaPercorrida;
			}
			if (Vencedor.getText().isEmpty()) {
				Carro.setBounds(posicaoCarro);
				System.out.println("O " + Carro.getText() + " andou " + distanciaPercorrida + " metros");
			} else {
				break;
			}
		}
		if (Vencedor.getText().isEmpty()) {
			Vencedor.setText(Carro.getText());
			if (Carro.getText() == "Carro1") {
				Perdedor.setText("Carro2");
			} else {
				Perdedor.setText("Carro1");
			}
		}
		btnCorrer.setVisible(true);
	}

}