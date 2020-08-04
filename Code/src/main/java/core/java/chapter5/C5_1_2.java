package core.java.chapter5;

/**
 * @author: huakaimay
 * @since: 2020-07-31
 */
public class C5_1_2 extends Employee {

    public C5_1_2(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public void aa() {
        String name = super.getName();
    }
}
