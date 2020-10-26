package core.java.chapter5.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: huakaimay
 * @since: 2020-10-26
 */
public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("the following call with generate an exception.");
        b = (String[]) badCopyOf(b, 10);

    }

    private static Object badCopyOf(Object[] a, int newLength) {
        Object[] newArr = new Object[newLength];
        System.arraycopy(a, 0, newArr, 0, Math.min(a.length, newLength));
        return newArr;
    }

    private static Object goodCopyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if (!cl.isArray()) {
            return null;
        }
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
