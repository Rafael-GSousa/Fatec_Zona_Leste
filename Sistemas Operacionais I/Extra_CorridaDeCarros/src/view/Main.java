package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.Action;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Vencedor;
	private JTextField Perdedor;
	private JButton btnCorrer;
	private JLabel lblCarro1;
	private JLabel lblCarro2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle("Drag Race");

		lblCarro1 = new JLabel("Carro1");
		lblCarro1.setForeground(Color.BLUE);
		lblCarro1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCarro1.setBounds(31, 85, 56, 16);
		contentPane.add(lblCarro1);

		lblCarro2 = new JLabel("Carro2");
		lblCarro2.setForeground(Color.RED);
		lblCarro2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCarro2.setBounds(31, 148, 56, 16);
		contentPane.add(lblCarro2);

		JLabel lblVencedor = new JLabel("Vencedor");
		lblVencedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVencedor.setBounds(275, 203, 77, 16);
		contentPane.add(lblVencedor);

		JLabel lblPerdedor = new JLabel("Perdedor");
		lblPerdedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPerdedor.setBounds(275, 250, 77, 16);
		contentPane.add(lblPerdedor);

		Vencedor = new JTextField();
		Vencedor.setForeground(Color.BLACK);
		Vencedor.setBounds(351, 200, 116, 22);
		contentPane.add(Vencedor);
		Vencedor.setColumns(10);
		Vencedor.setEditable(false);

		Perdedor = new JTextField();
		Perdedor.setBounds(351, 247, 116, 22);
		contentPane.add(Perdedor);
		Perdedor.setColumns(10);
		Perdedor.setEditable(false);

		btnCorrer = new JButton("Correr");
		btnCorrer.setFont(new Font("Tahoma", Font.BOLD, 13));
		Action Ex4Action = new Action(btnCorrer, lblCarro1, lblCarro2, Vencedor, Perdedor);
		btnCorrer.setBounds(31, 276, 97, 25);
		contentPane.add(btnCorrer);
		btnCorrer.addActionListener(Ex4Action);

		JLabel label = new JLabel(
				"________________________________________________________________________________________________________\r\n");
		label.setBounds(31, 112, 739, 16);
		contentPane.add(label);
	}
}