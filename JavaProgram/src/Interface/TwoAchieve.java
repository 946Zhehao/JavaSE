package Interface;
/*
* 一个类和以实现多个接口，弥补了单继承带来的缺陷
 */
public class TwoAchieve implements Instance, A{
    @Override
    public void say() {
        System.out.println("冲!!!!!");
    }

    @Override
    public void attack() {
        System.out.println("开炮！！！");
    }

    @Override
    public void start() {
        System.out.println("全体上刺刀！！！");
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}
