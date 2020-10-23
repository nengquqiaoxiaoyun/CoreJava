package core.java.chapter6.c646;

import java.util.ArrayList;

/**
 * @author: huakaimay
 * @since: 2020-10-23
 */
public class Sub extends Super {


    public Sub(int id) {
        super(id);
    }

    public static void main(String[] args) {
        /*
        双括号初始化
         */
        invite(new ArrayList<String>() {
            {
                add("Harry");
                add("Mary");
            }
        });
    }

    private static void invite(ArrayList<String> strings) {


    }


}
