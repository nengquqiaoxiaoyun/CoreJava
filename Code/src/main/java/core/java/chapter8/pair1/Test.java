package core.java.chapter8.pair1;

import java.util.LinkedList;

/**
 * @author: huakaimay
 * @since: 2020-10-29
 */
public class Test {
    public static void main(String[] args) {
        Class c1 = new LinkedList<String>().getClass();
        Class c2 = new LinkedList<Double>().getClass();


        System.out.println(c1 == c2);
        System.out.println(c1.getName());
    }

    public <T extends Throwable> void test(T t) throws T {
        try {

        } catch (Throwable tt) {
            t.initCause(tt);
            throw t;
        }
    }
}
