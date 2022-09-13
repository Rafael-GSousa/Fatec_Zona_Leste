package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.concurrent.Semaphore;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import controller.SapoController;
import javax.swing.JScrollPane;
import java.awt.Color;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

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
        setResizable(false);

        Semaphore farol = new Semaphore(1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 699);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbFrog1 = new JLabel("");
        lbFrog1.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\img\\frogIcon.gif"));
        lbFrog1.setBounds(10, 11, 100, 93);
        contentPane.add(lbFrog1);

        JLabel lbFrog2 = new JLabel("");
        lbFrog2.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\img\\frogIcon.gif"));
        lbFrog2.setBounds(10, 118, 100, 93);
        contentPane.add(lbFrog2);

        JLabel lbFrog3 = new JLabel("");
        lbFrog3.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\img\\frogIcon.gif"));
        lbFrog3.setBounds(10, 223, 100, 93);
        contentPane.add(lbFrog3);

        JLabel lbFrog4 = new JLabel("");
        lbFrog4.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\img\\frogIcon.gif"));
        lbFrog4.setBounds(10, 327, 100, 93);
        contentPane.add(lbFrog4);

        JLabel lbFrog5 = new JLabel("");
        lbFrog5.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\img\\frogIcon.gif"));
        lbFrog5.setBounds(10, 431, 100, 93);
        contentPane.add(lbFrog5);

        JLabel lbFinish = new JLabel("");
        lbFinish.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\img\\Webp.net-resizeimage (5).png"));
        lbFinish.setBounds(738, 11, 10, 526);
        contentPane.add(lbFinish);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 539, 638, 121);
        contentPane.add(scrollPane);

        JTextArea textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        textArea.setEditable(false);


        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnIniciar.setBounds(659, 548, 115, 101);
        contentPane.add(btnIniciar);
        String BLA = "====__Pódio__====\n";
        textArea.setText(BLA);

        JTextArea textAreaFrog1 = new JTextArea();
        textAreaFrog1.setFont(new Font("Fira Code", Font.BOLD, 13));
        textAreaFrog1.setForeground(Color.WHITE);
        textAreaFrog1.setBackground(new Color(152, 251, 152));
        textAreaFrog1.setLineWrap(true);
        textAreaFrog1.setWrapStyleWord(true);
        textAreaFrog1.setEditable(false);
        textAreaFrog1.setBounds(10, 11, 730, 93);
        contentPane.add(textAreaFrog1);

        JTextArea textAreaFrog2 = new JTextArea();
        textAreaFrog2.setBackground(new Color(244, 164, 96));
        textAreaFrog2.setFont(new Font("Fira Code", Font.BOLD, 13));
        textAreaFrog2.setForeground(Color.WHITE);
        textAreaFrog2.setWrapStyleWord(true);
        textAreaFrog2.setLineWrap(true);
        textAreaFrog2.setEditable(false);
        textAreaFrog2.setBounds(10, 115, 730, 93);
        contentPane.add(textAreaFrog2);

        JTextArea textAreaFrog3 = new JTextArea();
        textAreaFrog3.setBackground(new Color(152, 251, 152));
        textAreaFrog3.setFont(new Font("Fira Code", Font.BOLD, 13));
        textAreaFrog3.setForeground(Color.WHITE);
        textAreaFrog3.setLineWrap(true);
        textAreaFrog3.setWrapStyleWord(true);
        textAreaFrog3.setEditable(false);
        textAreaFrog3.setBounds(10, 223, 730, 93);
        contentPane.add(textAreaFrog3);

        JTextArea textAreaFrog4 = new JTextArea();
        textAreaFrog4.setBackground(new Color(244, 164, 96));
        textAreaFrog4.setFont(new Font("Fira Code", Font.BOLD, 13));
        textAreaFrog4.setForeground(Color.WHITE);
        textAreaFrog4.setLineWrap(true);
        textAreaFrog4.setWrapStyleWord(true);
        textAreaFrog4.setEditable(false);
        textAreaFrog4.setBounds(10, 327, 730, 93);
        contentPane.add(textAreaFrog4);

        JTextArea textAreaFrog5 = new JTextArea();
        textAreaFrog5.setBackground(new Color(152, 251, 152));
        textAreaFrog5.setFont(new Font("Fira Code", Font.BOLD, 13));
        textAreaFrog5.setForeground(Color.WHITE);
        textAreaFrog5.setLineWrap(true);
        textAreaFrog5.setWrapStyleWord(true);
        textAreaFrog5.setEditable(false);
        textAreaFrog5.setBounds(10, 431, 730, 93);
        contentPane.add(textAreaFrog5);
        SapoController sapoController = new SapoController(farol, lbFrog1, lbFrog2, lbFrog3, lbFrog4, lbFrog5, btnIniciar, textArea,lbFinish,textAreaFrog1,textAreaFrog2,textAreaFrog3,textAreaFrog4,textAreaFrog5);
        btnIniciar.addActionListener(sapoController);
    }
}