package core.java.chapter6;

/**
 * @author: huakaimay
 * @since: 2020-09-04
 */
public  interface C6_1_2 {

     void a();

    default void c() {
        System.out.println("sdfa");
    }

    static void b() {
        System.out.println("123");
    }

    public static void main(String[] args) {
        C6_1_2.b();
    }
}
