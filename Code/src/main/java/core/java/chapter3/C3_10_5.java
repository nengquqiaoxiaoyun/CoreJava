package core.java.chapter3;

import java.util.Arrays;

/**
 * @author: huakaimay
 * @since: 2020-07-27
 */
public class C3_10_5 {

    public static void main(String[] args) {


        System.out.println("How many numbers do need to draw");
        int k = 6;

        System.out.println("What is the highest number you can draw?");
        int total = 6;

        int[] numbers = new int[total];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // draw k numbers and put them into a seconde array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            // make a random index between 0 and n - 1
            int random = (int) (Math.random() * total);

            System.out.println(random);
            // pick the element at the random location
            result[i] = numbers[random];

            // move the last element into the random location
            /*
            用最后一个数替代 numbers[random]
            保证最后已经有的元素不会被重复消费
            比如 numbers[5] 那么5上的元素6就会被最后一个元素替换，使得6不会再次出现
             */
            numbers[random] = numbers[total - 1];
            total--;
        }

        // print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int i : result) {
            System.out.println(i);
        }
    }
}
