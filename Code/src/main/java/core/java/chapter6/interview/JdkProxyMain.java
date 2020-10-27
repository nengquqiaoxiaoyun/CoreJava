package core.java.chapter6.interview;

import java.lang.reflect.Proxy;

public class JdkProxyMain {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        JdkProxy jdkProxy = new JdkProxy(new BuyServiceImpl());
        IBuyService buyService = jdkProxy.getProxy();
        buyService.buyItem(10);
        boolean proxyClass = Proxy.isProxyClass(buyService.getClass());
        System.out.println(proxyClass);
    }
}
