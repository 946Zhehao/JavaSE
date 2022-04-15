package Interface;

//类和类之间叫继承extends, 类和接口之间叫实现implements

public class Achieve implements A{

    public Achieve(){

    }

    @Override
    public void start() {
        System.out.println("伞兵一号卢本伟，准备就绪");
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
