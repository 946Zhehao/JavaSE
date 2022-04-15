package Extend_Interface;
/*
* 继承和实现同时使用，这样写 extends 类 implements 接口
* 若只有实现接口，系统也会默认继承 Object
 */

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        a1.run();
        a2.run();

        a1.dash();
        a2.dash();

        System.out.println(a1.toString());

        if(a1 instanceof Wing){
            Wing w1 = (Wing)a1;
            w1.fly();
        }
        if(a1 instanceof Cat){
            Cat c1 = (Cat)a1;
            c1.run();
            c1.fly();
        }

        if(a2 instanceof Wing){
            Wing w1 = (Wing)a2;
            w1.fly();
        }
        if(a2 instanceof Dog){
            Dog d1 = (Dog)a2;
            d1.run();
            d1.fly();
        }

    }
}
