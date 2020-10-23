package core.java.chapter6.anonymousInnerClass;

import core.java.chapter6.c64.TalkingClock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

/**
 * @author: huakaimay
 * @since: 2020-10-23
 */
public class AnonymousInnerClassTest {

    public static void main(String[] args) {
        TalkingClock1 talkingClock = new TalkingClock1();
        talkingClock.start(1000, true);

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

class TalkingClock1 {
    public void start(int interval, boolean beep) {
        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("at the tone, the time is " + LocalDateTime.now());
                if (beep) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };

        Timer timer = new Timer(interval, actionListener);
        timer.start();

    }
}

