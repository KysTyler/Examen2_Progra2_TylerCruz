package examen2_tylercruz;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;

public class ThreadMessage extends Thread {

    private JProgressBar bar;
    private int time;
    private boolean vive;
    private boolean avanzar;

    public ThreadMessage() {
    }
    

    public ThreadMessage(JProgressBar bar, int time, boolean vive, boolean avanzar) {
        this.bar = bar;
        this.time = time;
        vive = true;
        avanzar = true;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (vive) {
            if (avanzar) {
                bar.setMaximum(time);
                bar.setValue(bar.getValue() + 1);
                if (bar.getValue() == time) {
                      vive = false;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        bar.setValue(0);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
