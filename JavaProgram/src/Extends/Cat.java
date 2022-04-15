package Extends;

public class Cat extends Animals{
    private static String kind = "🐱";

    //方法重写
    public void move(){
        System.out.println("🐱跑了！");
    }
    public void eat(){
        System.out.println("吃鱼！");
    }

    //构造方法
    public Cat() {
    }

    public Cat(int age, int length, String name) {
        super(age, length, name);
    }

    //setter getter
    public static String getKind() {
        return kind;
    }

    public static void setKind(String kind) {
        Cat.kind = kind;
    }
}
