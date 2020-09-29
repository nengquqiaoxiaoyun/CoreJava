package core.java.chapter6.c638;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-09-27
 */
public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("zhangsan", 18);
        Person p2 = new Person("lisi", 20);
        Person p3 = new Person("zhangwww", 20);

        List<Person> list = Arrays.asList(p1, p2, p3);

        Collections.sort(list, Comparator.comparing(Person::getAge).thenComparing((t1, t2) -> {
           return t2.name.length() - t1.name.length();
        }));

        System.out.println(list);


    }

}
