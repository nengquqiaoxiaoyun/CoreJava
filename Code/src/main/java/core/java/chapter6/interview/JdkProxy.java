package core.java.chapter6.interview;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: huakaimay
 * @since: 2020-10-27
 */
public class JdkProxy implements InvocationHandler {
    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("增强方法之前执行 before !!!");
        Object result = method.invoke(target, args);
        System.out.println("增强方法之后执行 after !!!");
        return result;
    }


    public <T> T getProxy() {
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}
