package cn.bytego.proxy.design;

public class Lawyer implements Person {

    private Person person;

    /**
     * 默认构造函数，将person赋值为一个Lawyer对象
     */
    public Lawyer() {

        person = new Lawyer();
    }

    /**
     * @param person
     */
    public Lawyer(Person person) {

        this.person = person;
    }


    @Override
    public void goToLaw() {

        System.out.println("打官司前，我需要收集资料.....");
        person.goToLaw();
        System.out.println("打官司结束来，我要提交资料给法院了......");
    }
}
