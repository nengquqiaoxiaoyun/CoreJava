package core.java.chapter8.c881;

/**
 * @author: huakaimay
 * @since: 2020-11-02
 */
public class Hero {

    private String i;

    @Override
    public String toString() {
        return "Hero{" +
                "i='" + i + '\'' +
                '}';
    }

    public Hero(String i) {
        this.i = i;
    }
}
