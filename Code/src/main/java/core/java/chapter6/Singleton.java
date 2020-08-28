package core.java.chapter6;

/**
 * @author: huakaimay
 * @since: 2020-08-21
 */
public class Singleton {


    public static final class SingletonHolder {
        private static final Singleton instance = new Singleton();

    }

    public static final Singleton getInstance() {

        return SingletonHolder.instance;
    }
}
