package SuperX;

public class Cat extends Animal{
    private static String kind = "🐱";

    //构造方法
    public Cat() {
        this(10, 20, "芜湖大司马");
        System.out.println("猫出生了！");
    }

    public Cat(int age, int length, String name) {
        //super(age, length, name);
        System.out.println(name + "诞生了！");
    }

    //setter getter
    public static String getKind() {
        return kind;
    }

    public static void setKind(String kind) {
        Cat.kind = kind;
    }
}
