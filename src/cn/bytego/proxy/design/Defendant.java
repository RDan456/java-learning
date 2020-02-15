package cn.bytego.proxy.design;

public class Defendant implements Person {

    @Override
    public void goToLaw() {

        System.out.println("打官司了......");
    }
}
