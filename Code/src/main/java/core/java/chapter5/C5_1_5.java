package core.java.chapter5;

/**
 * @author: huakaimay
 * @since: 2020-08-04
 */
public class C5_1_5 {

    public static void main(String[] args) {
        // 经理
        Manager[] managers = new Manager[10];
        // 雇员 -> 经理 和 雇员 引用了同一个数组
        Employee[] staff = managers;


        // 这里擅自把一个雇员归入经理的行列当中了
        staff[0] = new Employee("zhangsan", 9999, 2018, 10, 15);

        managers[0].setBonus(15);
        System.out.println(managers[0].getName());
        System.out.println(staff[0].getName());
    }
}
