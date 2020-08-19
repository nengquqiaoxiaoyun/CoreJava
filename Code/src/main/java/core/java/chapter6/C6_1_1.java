package core.java.chapter6;

import core.java.chapter5.abstractClasses.Employee;

import java.util.Arrays;

/**
 * @author: huakaimay
 * @since: 2020-08-19
 */
public interface C6_1_1 {

    // 接口中可以有常量 不能有实例域
    final static String name = "";

    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("zhangsan", 10000, 2018, 10, 19);
        employees[1] = new Employee("lisi", 12000, 2017, 9, 9);
        employees[1] = new Employee("wangwu", 10500, 2019, 5, 26);
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }

}
