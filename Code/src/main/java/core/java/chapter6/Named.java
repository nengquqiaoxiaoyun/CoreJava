package core.java.chapter6;

/**
 * @author: huakaimay
 * @since: 2020-09-07
 */
public interface Named {

    default void getName() {
        System.out.println("Named getName");
    }

    void test();

}
