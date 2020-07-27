package core.java.chapter3;

import java.math.BigDecimal;

/**
 * @author: huakaimay
 * @since: 2020-07-27
 */
public class C3_9 {
    public static void main(String[] args) {

        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;

        System.out.println(a);
        System.out.println(b);

        BigDecimal c = new BigDecimal("1.0");
        BigDecimal d = new BigDecimal("0.9");
        BigDecimal e = new BigDecimal("0.8");

        BigDecimal x = c.subtract(d);
        BigDecimal y = d.subtract(e);

        System.out.println(x.equals(y));
        

    }
}
