package core.java.chapter5.abstractClasses;

/**
 * @author: huakaimay
 * @since: 2020-08-04
 */
public class Student extends Person {

    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
