package core.java.chapter6.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

/**
 * @author: huakaimay
 * @since: 2020-09-08
 */
public  class Test {

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

        Test test = new Test();
        new Timer(1000, test::test2).start();

        JOptionPane.showMessageDialog(null, "quit program?");
        System.exit(0);


    }


    @org.junit.Test
    public void test2(ActionEvent event) {
        int[] arr = {1, 2, 3};

    }
}
