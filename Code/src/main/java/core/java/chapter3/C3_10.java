package core.java.chapter3;

/**
 * @author: huakaimay
 * @since: 2020-07-27
 */
public class C3_10 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < 10; i++) {
            if (i >= arr.length) {
                arr = new int[10];
            }
            arr[i] = i;
        }
        ensure(arr);
        System.out.println(arr.length);

    }


    static void ensure(int[] arr) {
        arr = new int[15];
    }
}
