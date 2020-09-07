package core.java.chapter6;

/**
 * @author: huakaimay
 * @since: 2020-09-07
 */
public interface Person {

     default void getName() {
        System.out.println("Person getName");
    }

    default void test() {
        System.out.println("test");
    }



}
