package core.java.chapter6.c616;

/**
 * @author: huakaimay
 * @since: 2020-09-08
 */
public interface SuperInter {

   default void getName() {
       System.out.println("super");
   }
}
