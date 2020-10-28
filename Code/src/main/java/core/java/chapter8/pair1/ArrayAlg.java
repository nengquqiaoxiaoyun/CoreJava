package core.java.chapter8.pair1;


/**
 * @author: huakaimay
 * @since: 2020-10-28
 */
public class ArrayAlg {

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    public static void main(String[] args) {
        double a = ArrayAlg.<Double>getMiddle(3.14, 1729d, 0d);
    }
}
