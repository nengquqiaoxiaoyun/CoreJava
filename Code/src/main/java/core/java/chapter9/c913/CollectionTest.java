package core.java.chapter9.c913;

import core.java.chapter5.Employee;
import core.java.chapter5.Manager;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-11-02
 */
public class CollectionTest{

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("123");

        Iterator iterator = list.iterator();
        iterator.forEachRemaining(e -> {
            System.out.println(e);
        });

        ArrayList<? super Employee> a = new ArrayList<>();
        a.add(new Manager("", 1000, 2011, 10, 04));
        Object object = a.get(0);


    }
}
