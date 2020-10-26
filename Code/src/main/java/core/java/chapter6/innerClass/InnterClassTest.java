package core.java.chapter6.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

/**
 * @author: huakaimay
 * @since: 2020-10-26
 */
public class InnterClassTest {
    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(1000, true);
        talkingClock.start();


        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClock {
    private int interval;
     private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener timePrinter = new TimePrinter();
        Timer timer = new Timer(interval, timePrinter);
        timer.start();
    }

    public class TimePrinter implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is " + LocalDateTime.now());
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
