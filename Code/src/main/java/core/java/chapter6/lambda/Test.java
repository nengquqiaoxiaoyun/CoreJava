package core.java.chapter6.lambda;

import core.java.chapter5.abstractClasses.Employee;
import core.java.chapter5.abstractClasses.Person;
import core.java.chapter5.abstractClasses.Student;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-09-08
 */
public class Test {

    public static void main(String[] args) {
        String[] planets = {"mery", "longdd", "donkty", "cc"};
        System.out.println(Arrays.toString(planets));
        System.out.println("sorted in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("sorted by length");
        Arrays.sort(planets, (str1, str2) -> {
            return str1.length() - str2.length();
        });
        System.out.println(Arrays.toString(planets));

        new Timer(1000, event -> {
            System.out.println("the time is " + LocalDateTime.now());
        }).start();

        JOptionPane.showMessageDialog(null, "quit program?");
        System.exit(0);


    }
}
