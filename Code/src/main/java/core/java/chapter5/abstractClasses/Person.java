package core.java.chapter5.abstractClasses;

import java.util.Arrays;

/**
 * @author: huakaimay
 * @since: 2020-08-04
 */
public abstract class Person {


    public abstract String getDescription();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
