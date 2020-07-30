package core.java.chapter3;

/**
 * @author: huakaimay
 * @since: 2020-07-30
 */
public class C4_3_9 {

    private final String name;
    private final int a;
    private final Integer b;

    public C4_3_9() {
        a = 1;
        b = 2;
        name = "";
    }

    public String getName() {
        return name;
    }

    void aaa() {

    }

    // 构建之后 name 将不会被修改 没有setName方法
//    public void setName(String name) {
//        this.name = name;
//    }

    public static void main(String[] args) {
        // 引用不变，对象本身可变
        final int[] arr = {1, 2, 3};

        arr[2] = 6;

        System.out.println(arr[2]);
    }
}
