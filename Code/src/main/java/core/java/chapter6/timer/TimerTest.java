package core.java.chapter6.timer;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author: huakaimay
 * @since: 2020-09-08
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        Timer timer = new Timer(1000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program");
        System.exit(0);
        
    }
}
