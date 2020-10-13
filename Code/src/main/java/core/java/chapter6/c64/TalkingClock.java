package core.java.chapter6.c64;

import core.java.chapter6.timer.TimePrinter;

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

    private static int number;

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


    /**
     * 局部内部类
     */
    public void start2() {
        /*
        局部内部类 作用域被限定在这个局部类中的块中
        除该方法外，没有任何方法知道该内的存在
         */
        class TimePrinter implements ActionListener {

            @Override
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


        /**
         * with lambda
         */
        ActionListener timePrinter = (e) -> {
            System.out.println("At the tone, the time is " + LocalDateTime.now());
            /*
             * TalkingClock.this.beep
             */
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        };
        TimePrinter timePrinter1 = new TimePrinter();
        // lambda
        Timer t = new Timer(interval, timePrinter);
        // 局部内部类
        Timer t2 = new Timer(interval, timePrinter1);
        t.start();
    }

//    public class TimePrinter implements ActionListener {
//
//        /*
//        非静态内部类中的静态域必须是final的
//         */
//        public final static int b = 1;
//
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("At the tone, the time is " + LocalDateTime.now());
//            /*
//             * TalkingClock.this.beep
//             */
//            if (beep) {
//                Toolkit.getDefaultToolkit().beep();
//            }
//        }
//    }

    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(1000, false);

        talkingClock.start2();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}
