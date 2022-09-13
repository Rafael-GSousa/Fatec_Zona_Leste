package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Ex3CancelaController;
import controller.Ex3OkController;
import controller.Ex3ProcuraController;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainEx3 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel tela;
	private JTextField tfcaminho;
	private JButton btnProcurar;
	private JButton btnOk;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainEx3 frame = new MainEx3();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainEx3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\Run-Dialog.png").getScaledInstance(10, 10, Image.SCALE_SMOOTH));
		setTitle("Executar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 211);
		tela = new JPanel();
		tela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(tela);
		tela.setLayout(null);
		
		tfcaminho = new JTextField();
		tfcaminho.setBounds(70, 84, 306, 22);
		tela.add(tfcaminho);
		tfcaminho.setColumns(10);
		
		btnProcurar = new JButton("Procurar...");
		btnProcurar.setBounds(279, 120, 97, 25);
		tela.add(btnProcurar);
		Ex3ProcuraController procura = new Ex3ProcuraController(tfcaminho);
		btnProcurar.addActionListener(procura);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOk.setBounds(61, 120, 97, 25);
		tela.add(btnOk);
		Ex3OkController executa = new Ex3OkController(tfcaminho, this);
		btnOk.addActionListener(executa);
		tfcaminho.addActionListener(executa);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(170, 120, 97, 25);
		tela.add(btnCancelar);
		Ex3CancelaController cancela = new Ex3CancelaController(this);
		btnCancelar.addActionListener(cancela);
		
		JLabel lblAbrir = new JLabel("Abrir:");
		lblAbrir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAbrir.setBounds(22, 87, 56, 16);
		tela.add(lblAbrir);
		
		JLabel lblNewLabel = new JLabel("<html>Digite o nome de um programa, pasta, documento ou <br/> recurso da Internet e o Windows o abrir\u00E1 para voc\u00EA.");
		lblNewLabel.setIcon(new ImageIcon(".\\Run-Dialog3.png"));
		lblNewLabel.setBounds(12, 2, 364, 72);
		tela.add(lblNewLabel);
		
		
		
		
	}
	
}