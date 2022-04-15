package Abstract;

public class Bird extends Animal{
    //动作
    @Override
    public void run() {
        System.out.println("芜湖起飞！");
    }
    //吃
    @Override
    public void eat() {
        System.out.println("你屌任你屌，我吃你大鸟！");
    }
    //呼吸
    @Override
    public void breath() {
        System.out.println("I can't breath!");
    }
}
