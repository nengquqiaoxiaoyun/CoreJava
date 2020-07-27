package core.java.chapter3;

/**
 * @author: huakaimay
 * @since: 2020-07-27
 */
public class C3_8_6 {
    public static void main(String[] args) {
        read_data:
        while (true) {
            for (int i = 0; i < 10; i++) {
                if (true) {
                    break read_data;
                }
            }
        }
    }
}
