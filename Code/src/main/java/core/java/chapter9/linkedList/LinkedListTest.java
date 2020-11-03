package core.java.chapter9.linkedList;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;

/**
 * @author: huakaimay
 * @since: 2020-11-03
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.addLast("Amy");
        a.addLast("Carl");
        a.addLast("Erica");

        LinkedList<String> b= new LinkedList<>();
        b.addLast("Bob");
        b.addLast("Doug");
        b.addLast("Frances");
        b.addLast("Gloria");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if(aIter.hasNext()) {
                aIter.next();
            }
            aIter.add(bIter.next());
        }

        System.out.println(a);

        bIter = b.iterator();

        while (bIter.hasNext()) {
            bIter.next();
            if(bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }

        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);


        HashMap<Object, Object> hashMap = new HashMap<>();
//        hashMap.put("1",1);
        Collection<Object> values = hashMap.values();

        for(Map.Entry<Object, Object>  map : hashMap.entrySet()) {
            map.getKey();
            map.getValue();
            hashMap.put("2",2);
        }

        hashMap.forEach((k, v) -> {
            // TODO
            System.out.println("k: " + k);
        });


    }
}
