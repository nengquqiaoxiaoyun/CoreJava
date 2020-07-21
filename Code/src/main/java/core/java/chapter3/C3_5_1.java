package core.java.chapter3;

import org.junit.Test;

/**
 * @author: huakaimay
 * @since: 2020-07-21
 */
public class C3_5_1 {


    @Test
    public void test1() {
        int a = 99;
        boolean flag = isEve(a);
        System.out.println("是否为奇数: " + flag);
    }

    /**
     * 判断基数时不能使用 n % 2 == 1
     * 因为没有考虑到负数的情况
     * 而偶数则不同 偶数不论正负 都是一样的 可以直接使用 n % 2 == 0
     *
     * @param n
     * @return
     */
    private boolean isEve(int n) {
        // return !(n % 2 == 0);
        return (n & 1) == 1;
    }

}
