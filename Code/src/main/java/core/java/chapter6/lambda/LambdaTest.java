package core.java.chapter6.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-09-08
 */
public class LambdaTest {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person zhangsan = new Person("zhangsan");
        Person lisi = new Person("lisi");
        list.add(zhangsan);
        list.add(lisi);
        Collections.sort(list, (p1, p2) -> {
            return p1.getName().length() - p2.getName().length();
        });
        list.forEach(System.out::println);
    }
}
