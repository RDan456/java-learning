package cn.bytego.reflect;

import java.lang.reflect.Constructor;

/**
 * 该类演示通过反射机制获取类的构造方法
 */
public class ConstructTest {

    public static void main(String[] args) throws Exception {

        ///首先需要获取类的对象,通常采用的方式为Class.forName()的方法
        Class clazz =Class.forName("cn.bytego.reflect.User");

        ///只能获取public的构造方法
        System.out.println("--------------------------------------------------");
        Constructor[] constructors = clazz.getConstructors();
        for(Constructor constructor : constructors) {

            System.out.println(constructor.toString());
        }

        ///能够获取类中所有的构造方法
        System.out.println("--------------------------------------------------");
        Constructor[] constructors2 = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors2) {

            System.out.println(constructor.toString());
        }

        ///通过参数来获取构造方法，getConstructor()方法只能够返回public的构造方法，
        ///getDeclaredConstructor()能够返回各种类型的构造方法。当参数为null时，返回的是
        ///默认的构造方法。
        System.out.println("--------------------------------------------------");
        Constructor constructor1 = clazz.getDeclaredConstructor(String.class, int.class, String.class, String.class);
        System.out.println(constructor1.toString());
        Constructor constructor2 = clazz.getDeclaredConstructor(String.class, int.class, String.class, String.class);
        System.out.println(constructor2.toString());

    }
}
