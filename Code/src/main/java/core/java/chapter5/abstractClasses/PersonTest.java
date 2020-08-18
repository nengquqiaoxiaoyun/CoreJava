package core.java.chapter5.abstractClasses;

/**
 * @author: huakaimay
 * @since: 2020-08-18
 */
public class PersonTest {

    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("张三", 12000, 2017, 11, 18);
        people[1] = new Student("李四", "computer science");

        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getDescription());
        }

        System.out.println(people[0]);
    }
}
