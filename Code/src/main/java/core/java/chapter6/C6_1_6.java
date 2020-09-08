package core.java.chapter6;

/**
 * @author: huakaimay
 * @since: 2020-09-07
 */
public class C6_1_6 implements Named, Person{

    @Override
    public void getName() {
        Person.super.getName();
        Named.super.getName();
    }

    @Override
    public void test() {

    }

}
