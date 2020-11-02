package core.java.chapter8.c881;

import java.util.LinkedList;

/**
 * 不支持泛型的stack
 *
 * @author: huakaimay
 * @since: 2020-11-02
 */
public class HeroStack {

    private LinkedList<Hero> heroStack = new LinkedList<>();

    public Hero pull() {
        return heroStack.removeLast();
    }

    public void push(Hero h) {
        heroStack.addLast(h);
    }

    public Hero peek() {
        return heroStack.getLast();
    }

    public static void main(String[] args) {
        HeroStack heroStack = new HeroStack();
        for (int i = 0; i < 5; i++) {
            Hero hero = new Hero("my name is: " + (i + 1));
            heroStack.push(hero);
        }

        for (int i = 0; i < 5; i++) {
            Hero h = heroStack.pull();
            System.out.println("弹出 " + h);
        }

    }

}
