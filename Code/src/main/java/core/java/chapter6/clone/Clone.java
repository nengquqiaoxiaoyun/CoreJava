package core.java.chapter6.clone;

import core.java.chapter5.Employee;
import org.junit.Test;

/**
 * @author: huakaimay
 * @since: 2020-09-08
 */
public class Clone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee zhangsan = new Employee("zhangsan", 10000, 2018, 06, 14);
        Employee lisi = zhangsan;

        // 对象的引用指向同一个，任意一个修改都会影响另一个
        lisi.setName("lisi");
        System.out.println(zhangsan);


        Employee wangwu = new Employee("wangwu", 10000, 2011, 06, 14);
        Employee clone = wangwu.clone();

        clone.setName("xiaobai");
        System.out.println(wangwu);
        System.out.println(clone);

    }

    @Test
    public void test() {
        try {
            core.java.chapter6.clone.Employee xiaoba = new core.java.chapter6.clone.Employee("xiaoba", 18000);
            xiaoba.setHireDay(2008, 10, 23);
            core.java.chapter6.clone.Employee coby = xiaoba.clone();
            System.out.println(xiaoba);
            coby.setName("zhoushen");
            coby.setHireDay(2009, 05, 19);
            System.out.println(coby);
            System.out.println(xiaoba);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
