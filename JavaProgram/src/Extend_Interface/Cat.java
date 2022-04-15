package Extend_Interface;

public class Cat extends Animal implements Wing, Fire{
    //抽象类Animal 方法重写
    public void run(){
        System.out.println("I'm a cat that dreams of flying!");
    }
    //接口Wing 方法重写
    public void fly(){
        System.out.println("I'm flying!");
    }

    @Override
    public void fire() {
        System.out.println("Rain fire!");
    }

    public void dash() {
        System.out.println("ccccccccccccc");
    }
}
