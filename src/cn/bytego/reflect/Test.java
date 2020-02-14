package cn.bytego.reflect;

/**
 * 该类主要演示三种获取类的Class对象的方法。
 */
public class Test {

    public static void main(String[] args) throws Exception {

        ///第一种方式为Object.getClass()的方式。
        User user = new User();
        Class userClass1 = user.getClass();
        System.out.println(userClass1.getName());

        ///第二种方式为Class.class的方式
        Class userClass2 = User.class;
        ///判断该对象是否和方法一生成的对象一样
        if(userClass1 == userClass2) {

            System.out.println("userClass1 和 userClass2 是一个对象");
        }

        ///第三种方式为Class.forName（）的方式，参数需要是类完整的路径，也就是需要加上包名称
        Class userClass3 = Class.forName("cn.bytego.reflect.User");
        ///判断该方法与第二种方法生成的对象是不是一个对象
        if(userClass2 == userClass3) {

            System.out.println("userClass2 和 userClass3对象是一个对象");
        }
    }
}
