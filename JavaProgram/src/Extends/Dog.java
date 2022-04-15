package Extends;

public class Dog extends Animals{
    private static String kind = "🐕";

    //方法重写
    /*
    *方法重写只能发生在子类中
    * 重写时：返回值类型，函数名，参数类型都必须相同
    * 重写时：访问权限只能更高，不能更低
    * 重写时：抛出异常只能更少
    *
    * 注意：私有方法不能被继承，所以不存在覆盖
    *      构造方法。。。。。。。
    *      静态方法不存在覆盖
    *      覆盖只针对方法
     */
    public void move(){
        System.out.println("🐕跑了！");
    }

    public void eat(){
        System.out.println("吃骨头！");
    }

    //构造方法
    public Dog() {
    }

    public Dog(int age, int length, String name) {
        super(age, length, name);
    }

    //setter getter
    public static String getKind() {
        return kind;
    }

    public static void setKind(String kind) {
        Dog.kind = kind;
    }
}
