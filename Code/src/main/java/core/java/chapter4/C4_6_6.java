package core.java.chapter4;

/**
 * @author: huakaimay
 * @since: 2020-07-30
 */
public class C4_6_6 {

    private String name;

    private Integer age;

    public C4_6_6(String name) {
        this.name = name;
    }

    public C4_6_6() {

    }

    public C4_6_6(String name, Integer age) {
        this(name);
        this.name = name;
        this.age = age;
    }
}
