package core.java.chapter9.c913;

import core.java.chapter5.Employee;
import core.java.chapter5.Manager;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

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


    @Test
    public void test() {
        ArrayList<? super Comparable> a = new ArrayList<Object>();
        a.add("str");
        a.add(123);
        ListIterator<? super Comparable> listIterator = a.listIterator(1);
        Comparable object = (Comparable)a.get(0);
        System.out.println(object);
        Object next = listIterator.next();
        System.out.println(next);


    }

}
