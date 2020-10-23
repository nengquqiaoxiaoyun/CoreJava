package core.java.chapter6.c646;

import java.util.Objects;

/**
 * @author: huakaimay
 * @since: 2020-10-23
 */
public class Super {

    private int id;

    public Super(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        int id = 1;
        /*
        匿名类不能有构造器，必须将构造器参数传递给父类构造器
         */
        Super superClass = new Super(id) {

        };
    }

}
