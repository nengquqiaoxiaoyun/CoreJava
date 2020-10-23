package core.java.chapter6.staticInnerClass;

import java.util.Arrays;

/**
 * @author: huakaimay
 * @since: 2020-10-23
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] doubles = new double[20];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = 100 * Math.random();
        }
        ArrayAlg.Pair pair = ArrayAlg.Pair.minmax(doubles);
        System.out.println(pair);
        System.out.println("min = " + pair.getFirst());
        System.out.println("max = " + pair.getSecond());
    }
}

class ArrayAlg {

    public static class Pair {
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }

        public static Pair minmax(double[] values) {


            double min = Double.POSITIVE_INFINITY;
            double max = Double.NEGATIVE_INFINITY;

            for (double value : values) {
                if (min > value)
                    min = value;
                if (max < value)
                    max = value;
            }

            return new Pair(min, max);
        }
    }
}
