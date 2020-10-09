package core.java.chapter6.c64;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

/**
 * @author: huakaimay
 * @since: 2020-10-09
 */
public class TalkingClock {

    private int interval;

    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        TimePrinter timePrinter = new TimePrinter();
        Timer timer = new Timer(interval, timePrinter);
        timer.start();
    }

    public class TimePrinter implements ActionListener {

        /*
        内部类中的静态域必须是final的
         */
        public final static int b = 1;

        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is " + LocalDateTime.now());
            /*
             * TalkingClock.this.beep
             */
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(1000, false);

        TalkingClock.TimePrinter timePrinter = talkingClock.new TimePrinter();

        talkingClock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}
