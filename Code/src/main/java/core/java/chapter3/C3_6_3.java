package core.java.chapter3;

/**
 * @author: huakaimay
 * @since: 2020-07-23
 */
public class C3_6_3 {

    public static void main(String[] args) {
        // 这里创建两个对象 初始常量池为空创建一个 堆区创建一个
        String str = new String("abc");
        // 这里创建一个堆区对象， 常量池已有一个abc
        String str2 = new String("abc");
        // == 比较的地址 所以为false
        System.out.println(str == str2);
        // 这里创建三个对象 ab bc abbc
        String str3 = "ab" + "bc";

        // 四个对象 常量池 a b ab 堆区一个
        String str4 = new String("a" + "b");
    }
}
