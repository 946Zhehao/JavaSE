package Extend_Interface;

public class Dog extends Animal implements Wing{

    @Override
    public void run() {
        System.out.println("冲");
    }

    @Override
    public void fly() {
        System.out.println("起飞");
    }

    public void dash() {
        System.out.println("dddddddddddd");
    }
}
