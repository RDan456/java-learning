package cn.bytego.reflect;

public class User {

    protected String name;
    private int age;
    private String address;
    private String phone;

    private User(String name, int age, String address,String phone) {

    }

    protected User(String name,int age) {

        this.name = name;
        this.age = age;
    }

    public User() {

    }

    public User(String name) {

        this.name = name;
    }

    public User(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {

        return name;
    }

    public String getPhone() {

        return phone;
    }

    private void checkAge(int age) {

        if(age == 20) {

            System.out.println("我的年龄是就是这个：" + age);
        }
    }

    protected void checkPhone(String phone) {

        if(phone.equals("123")) {

            System.out.println("我的电话号码就是：" +  phone);
        }
    }

    public void checkName(String name) {

        if(name.equals("小明")) {

            System.out.println("我的名字就是它: " + name);
        }
    }
}
