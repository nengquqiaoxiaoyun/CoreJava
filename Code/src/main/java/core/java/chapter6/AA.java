package core.java.chapter6;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: huakaimay
 * @since: 2020-08-24
 */
public class AA {
    @Test
    public void ss() {
        System.out.println((2&1) == 1);
    }


    public static void main(String[] args) {
        int fib = fib(30);
        System.out.println(fib);

        int arr[] = {3, 9, 8, 1, 8, 7};
        bubble(arr);
        String s = Arrays.toString(arr);
        System.out.println(s);

    }

    public static int fib(int index) {

        if (index == 1 || index == 2)
            return 1;

        return fib(index - 1) + fib(index - 2);

    }

    public  static void bubble(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
