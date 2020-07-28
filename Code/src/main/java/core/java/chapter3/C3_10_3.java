package core.java.chapter3;

import java.util.Arrays;

/**
 * @author: huakaimay
 * @since: 2020-07-27
 */
public class C3_10_3 {

    public static void main(String[] args) {
        int[] smallPrimes = {2, 3, 5, 7, 11, 12};
        int[] luckyNumbers = smallPrimes;
        System.out.println(luckyNumbers[5]);

        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        System.out.println(copiedLuckyNumbers.length);
        luckyNumbers= Arrays.copyOf(luckyNumbers, luckyNumbers.length * 2);
        System.out.println(luckyNumbers.length);

    }
}
