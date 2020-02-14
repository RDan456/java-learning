package cn.bytego.reflect;

import java.lang.reflect.Method;

/**
 * 该类主要演示通过反射获取类中定义的方法
 */
public class MethodTest {


    public static void main(String[] args) throws Exception {

        ///首先需要获取类的Class对象
        Class clazz = Class.forName("cn.bytego.reflect.User");

        ///获取类中声明的公有的方法
        System.out.println("------------------------------------------");
        Method[] methods = clazz.getMethods();
        for(Method method : methods) {

            System.out.println(method.toString());
        }

        ///获取类中的所有方法
        System.out.println("------------------------------------------");
        Method[] methods1 = clazz.getDeclaredMethods();
        for(Method method : methods1) {

            System.out.println(method.toString());
        }

        ///通过名字和参数的类型获取固定的方法,getMethod()只能用于公有的方法。
        ///getDeclaredMethods()可以用于各种类型的方法。
        System.out.println("-----------------------------------------");
        Method method = clazz.getMethod("checkName", String.class);
        System.out.println(method.toString());

        ///方法调用，如果直接调用，只能调用其公有方法
        System.out.println("-----------------------------------------");
        Object object = clazz.getConstructor().newInstance();
        method.invoke(object, "小明");

        ///私有方法调用，因为私有方法默认的可访问性为false，所以需要我们手动设置
        Method method1 = clazz.getDeclaredMethod("checkAge", int.class);
        method1.setAccessible(true);
        method1.invoke(object, 20);
    }
}
