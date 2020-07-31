package core.java.chapter4;


/**
 * @author: huakaimay
 * @since: 2020-07-31
 */
public class C4_6_7 {


    static {
        System.out.println("static: A");
    }

    {
        System.out.println("instance A");
    }

    C4_6_7() {
        System.out.println("constructor A");
    }


    public static void main(String[] args) {
        C c = new C();
        System.out.println("---");
        C c1 = new C();
        System.out.println("---");
        B b = new B();
    }

}

class B extends C4_6_7 {

    static {
        System.out.println("static: B");
    }

    {
        System.out.println("instance B");
    }

    B() {
        System.out.println("constructor B");
    }
}

class C extends B {

    static {
        System.out.println("static: C");
    }

    {
        System.out.println("instance C");
    }

    C() {
        System.out.println("constructor C");
    }
}
