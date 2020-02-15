package cn.bytego.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoginInvocationHandler implements InvocationHandler {

    ///需要代理的对象
    private Object proxyTarget;

    /**
     * 构造方法
     * @param proxyTarget
     */
    public LoginInvocationHandler(Object proxyTarget) {

        this.proxyTarget = proxyTarget;
    }
    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("对输入的信息进行检测...........");

        ///这一步是利用Java的反射机制调用方法，args为这个方法的参数，返回结果为该方法实际的返回的结果。
        Object result = method.invoke(proxyTarget, args);

        System.out.println("将登录信息写入到日志中..............");
        return result;
    }
}
