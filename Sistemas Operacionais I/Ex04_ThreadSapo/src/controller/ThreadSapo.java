package controller;

import java.awt.Rectangle;
import java.util.Random;
import java.util.concurrent.Semaphore;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ThreadSapo extends Thread {

    Random r = new Random();

    private JLabel lbFrog;
    private JButton btnIniciar;
    private static JTextArea textArea;
    private int n = 0;
    private int f;
    private JLabel lbFinish;
    private Semaphore farol;
    private JTextArea textAreaFrog;

    public ThreadSapo(Semaphore farol, JLabel lbFrog, JButton btnIniicar, JTextArea textArea, final int f,
                      JLabel lbFinish, JTextArea textAreaFrog) {
        this.farol = farol;
        this.lbFrog = lbFrog;
        this.btnIniciar = btnIniicar;
        ThreadSapo.textArea = textArea;
        this.f = f;
        this.lbFinish = lbFinish;
        this.textAreaFrog = textAreaFrog;

    }

    private void restart() {
        switch (f) {
            case 1:
                lbFrog.setBounds(10, 11, 100, 93);
                break;
            case 2:
                lbFrog.setBounds(10, 118, 100, 93);
                break;
            case 3:
                lbFrog.setBounds(10, 223, 100, 93);
                break;
            case 4:
                lbFrog.setBounds(10, 327, 100, 93);
                break;
            case 5:
                lbFrog.setBounds(10, 431, 100, 93);
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + f);
        }
    }

    private void podio() {

        System.out.println("Sapo " + f + " chegou!");
        textArea.setText(textArea.getText() + " Sapo " + f + "\n");

    }

    private void race() {
        btnIniciar.setEnabled(false);
        Rectangle position;
        position = lbFrog.getBounds();
        lbFrog.setBounds(position);
        Rectangle finish = lbFinish.getBounds();
        while (position.x < finish.x) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            n = r.nextInt(50);
            position.x += n;
            textAreaFrog.setText(textAreaFrog.getText() + " " + position.x);
            lbFrog.setBounds(position);

        }
        System.out.println();
        btnIniciar.setEnabled(true);
    }

    @Override
    public void run() {

        race();
        try {
            farol.acquire();
            podio();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            farol.release();
        }
        restart();
    }

}