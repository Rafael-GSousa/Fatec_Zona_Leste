package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class SapoController implements ActionListener {
    private JLabel lbFrog1;
    private JLabel lbFrog2;
    private JLabel lbFrog3;
    private JLabel lbFrog4;
    private JLabel lbFrog5;
    private JButton btnIniciar;
    private JTextArea textArea;
    private JLabel lbFinish;
    private final int f1 = 1;
    private final int f2 = 2;
    private final int f3 = 3;
    private final int f4 = 4;
    private final int f5 = 5;
    private Semaphore farol;
    private JTextArea textAreaFrog1;
    private JTextArea textAreaFrog2;
    private JTextArea textAreaFrog3;
    private JTextArea textAreaFrog4;
    private JTextArea textAreaFrog5;

    public SapoController(Semaphore farol, JLabel lbFrog1,JLabel lbFrog2,JLabel lbFrog3,JLabel lbFrog4,JLabel lbFrog5,JButton btnIniciar,
                          JTextArea textArea, JLabel lbFinish, JTextArea textAreaFrog1, JTextArea textAreaFrog2, JTextArea textAreaFrog3, JTextArea textAreaFrog4, JTextArea textAreaFrog5) {
        this.farol = farol;
        this.btnIniciar = btnIniciar;
        this.lbFrog1 = lbFrog1;
        this.lbFrog2 = lbFrog2;
        this.lbFrog3 = lbFrog3;
        this.lbFrog4 = lbFrog4;
        this.lbFrog5 = lbFrog5;
        this.textArea = textArea;
        this.lbFinish = lbFinish;
        this.textAreaFrog1 = textAreaFrog1;
        this.textAreaFrog2 = textAreaFrog2;
        this.textAreaFrog3 = textAreaFrog3;
        this.textAreaFrog4 = textAreaFrog4;
        this.textAreaFrog5 = textAreaFrog5;
    }

    private void startButtom() {


        Thread t1 = new ThreadSapo(farol, lbFrog1, btnIniciar,textArea, f1, lbFinish, textAreaFrog1);
        Thread t2 = new ThreadSapo(farol, lbFrog2, btnIniciar,textArea, f2, lbFinish, textAreaFrog2);
        Thread t3 = new ThreadSapo(farol, lbFrog3, btnIniciar,textArea, f3, lbFinish, textAreaFrog3);
        Thread t4 = new ThreadSapo(farol, lbFrog4, btnIniciar,textArea, f4, lbFinish, textAreaFrog4);
        Thread t5 = new ThreadSapo(farol, lbFrog5, btnIniciar,textArea, f5, lbFinish, textAreaFrog5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        startButtom();
    }

}