package core.java.chapter8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 绕过编译器 向泛型中添加不同的类型
 *
 * @author: huakaimay
 * @since: 2020-11-02
 */
public class GenericTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        // 编译器会阻止
        // list.add(333);

        Method method = list.getClass().getDeclaredMethod("add", Object.class);
        method.invoke(list, 123);
        System.out.println(list);


        Object g = new Object();
        GenericTest a = (GenericTest)g;
        System.out.println(a);

    }
}
