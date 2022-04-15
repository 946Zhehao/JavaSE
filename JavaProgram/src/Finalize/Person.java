package Finalize;

public class Person {
    //重写finalize()方法
    protected void finalize() throws Throwable {
        //遗嘱
        System.out.println("即将被销毁!");
    }
}
