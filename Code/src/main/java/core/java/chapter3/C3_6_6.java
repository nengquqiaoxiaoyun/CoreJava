package core.java.chapter3;

/**
 * @author: huakaimay
 * @since: 2020-07-23
 */
public class C3_6_6 {

    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("第i个码点：");
        int index = s.offsetByCodePoints(0, 2);
        int cp = s.codePointAt(index);                 
        System.out.println(cp);

        System.out.println("字符串转为码点：");
        int[] ints = s.codePoints().toArray();
        for (int anInt : ints) {
            System.out.println(anInt);
        }

        System.out.println("码点转为字符串：");
        String s1 = new String(ints, 0, ints.length);
        System.out.println(s1);

    }
}
