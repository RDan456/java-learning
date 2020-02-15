package cn.bytego.proxy;

import cn.bytego.proxy.impl.UserDAOImpl;
import java.lang.reflect.Proxy;

/**
 * 代理测试类，主要演示代理的使用
 */
public class ProxyTest {

    public static void main(String[] args) {

        ///
        LoginInvocationHandler handler = new LoginInvocationHandler(new UserDAOImpl());

        ///
        UserDAO userDAOProxy = (UserDAO) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),
                new Class[]{UserDAO.class},
                handler);

        ///
        boolean isLoginSuccess = userDAOProxy.login("rd", "rd");
        System.out.println(isLoginSuccess);

    }
}
