package core.java.chapter6.timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author: huakaimay
 * @since: 2020-09-08
 */
public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("at the tone, the time is " + LocalDateTime.now());
        Toolkit.getDefaultToolkit().beep();
    }
}
