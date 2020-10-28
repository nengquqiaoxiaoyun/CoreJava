package core.java.chapter7;

import org.junit.Test;

import java.io.IOException;

/**
 * @author: huakaimay
 * @since: 2020-10-28
 */
public class ThrowTest {

    @Test
    public void test() {
        System.out.println("a");

        testThrow();
        System.out.println("b");

        System.out.println("c");
    }

    public void testThrow() {
        System.out.println("throw");
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw e;
        }
    }
}
