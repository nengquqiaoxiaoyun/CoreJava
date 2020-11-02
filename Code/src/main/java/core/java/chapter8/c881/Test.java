package core.java.chapter8.c881;

import core.java.chapter6.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-10-30
 */
public class Test {

    @org.junit.Test
    public void t() {
        ArrayList obje = new ArrayList<>();
        ArrayList test = test(obje);
        String o = (String) test.get(0);
        Object o1 = test.get(1);
        System.out.println(o);
        System.out.println(o1);

    }


    public ArrayList test(ArrayList ts) {
        ts.add("1");
        ts.add(1);
        return ts;
    }


}
