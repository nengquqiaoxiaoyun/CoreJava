package core.java.chapter5;

import java.util.ArrayList;

/**
 * @author: huakaimay
 * @since: 2020-08-18
 */
public class C5_3_1 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Integer[] ints = {1, 2};
        Integer[] integers = list.toArray(ints);
        System.out.println(integers);

    }
}
