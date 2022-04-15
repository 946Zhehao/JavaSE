package Extends;

public class ExtendsTest {
    public static void main(String[] args) {
        //java 只支持单继承 c++支持多继承
        //父类 基类 超类 superclass
        //子类 派生类 subclass
        //私有的不支持继承  构造方法不支持继承   其他都支持
        //可以间接继承  A extends B, B extends C,  A间接继承C
        //一个类默认继承 java.lang.Object类

        Cat c1 = new Cat();
        c1.setAge(10);
        c1.setLength(20);
        c1.setName("芜湖");

        System.out.println(c1.getAge() + "-" + c1.getLength() + "-" + c1.getName() + "-" + Cat.getKind());

        Cat c2 = new Cat(15, 25, "起飞");
        //c2.setAge(15);
        //c2.setLength(25);
        //c2.setName("起飞");

        System.out.println(c2.getAge() + "-" + c2.getLength() + "-" + c2.getName() + "-" + Cat.getKind());

        Dog d1 = new Dog();
        d1.setAge(5);
        d1.setLength(50);
        d1.setName("阿黄");

        //方法的覆盖
        c1.move();
        c1.eat();
        d1.eat();
        d1.move();
    }
}
