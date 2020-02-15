package cn.bytego.reflect;

import java.lang.reflect.Field;

/**
 * 该类主要演示通过反射获取类的属性信息
 */
public class FieldTest {

    public static void main(String[] args) throws Exception {

        ///首先，需要获取类的Class对象。
        Class clazz = Class.forName("cn.bytego.reflect.User");

        ///获取类中定义的public 属性
        System.out.println("------------------------------------------");
        Field[] fields = clazz.getFields();
        for(Field field : fields) {

            System.out.println(field.toString());
        }

        ///获取类中定义的所有属性，各种类型都能获取到
        System.out.println("------------------------------------------");
        Field[] fields1 = clazz.getDeclaredFields();
        for(Field field : fields1) {

            System.out.println(field.toString());
        }

        ///获取类中的一个属性，其中通过getField()方法只能获取到public的属性，通过
        ///getDeclaredField获取到所有类型的属性,这里的参数为属性名称，不用加上包名，
        ///否则将会抛出异常
        System.out.println("--------------------------------------------");
        Field field = clazz.getDeclaredField("name");
        System.out.println(field.toString());

        ///为字段设置相应的值,该方法为公有字段设置值
        System.out.println("---------------------------------------------");
        Object object = clazz.getConstructor().newInstance();
        field.set(object, "小明");
        User user = (User)object;
        System.out.println(user.getName());

        ///为私有字段设置对应的值,私有字段的可访问性默认为false，如果需要改变，需要自己手动进行设置，
        ///否则将无法为该字段设置值
        Field field1 = clazz.getDeclaredField("phone");
        field1.setAccessible(true);
        field1.set(object, "123");
        System.out.println(user.getPhone());
    }
}
