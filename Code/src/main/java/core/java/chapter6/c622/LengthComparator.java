package core.java.chapter6.c622;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author: huakaimay
 * @since: 2020-09-08
 */
public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    public static void main(String[] args) {
        String[] person = {"Marks", "Paulaa", "Andy", "Lisa"};

        Arrays.sort(person, new LengthComparator());
        String s = Arrays.toString(person);
        System.out.println(s);

    }
}
