package Abstract;

public class Cat extends Animal{
    //动作
    @Override
    public void run() {
        System.out.println("猫咪爬树！");
    }
    //吃
    @Override
    public void eat() {
        System.out.println("猫咪吃鱼！");
    }
    //呼吸
    @Override
    public void breath() {
        System.out.println("Oh! I can't breath!");
    }
}
