package core.java.chapter3;

import java.time.LocalDate;

/**
 * @author: huakaimay
 * @since: 2020-07-30
 */
public class C4_4_4 extends C4_3_9 {

    void test() {
        LocalDate now = LocalDate.now();
    }

    private C4_4_4() {

    }


    /**
     * 静态工厂方法
     * 可以任意命名
     * 可以返回其他类型
     * @return
     */
    public static C4_3_9 init() {
        return new C4_4_4();
    }

    public static void main(String[] args) {
        C4_3_9 init = C4_4_4.init();
    }
}
