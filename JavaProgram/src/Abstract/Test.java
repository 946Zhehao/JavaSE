package Abstract;
/*
* final不能和abstract一起使用
* 抽象类的子类可以是抽象类
* 抽象类虽然无法实例化，但有构造方法，供子类使用
* 子类继承抽象类时，必须将抽象方法重写实现
 */
public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal() {
            @Override
            public void run() {
                super.run();
            }

            @Override
            public void eat() {
                super.eat();
            }

            @Override
            public void breath() {
                System.out.println("开炮！");
            }
        };

        animals[0].run();
        animals[0].eat();
        animals[0].breath();

        animals[0] = new Bird();
        animals[1] = new Cat();
        animals[2] = new Fish();
        //鸟
        animals[0].run();
        animals[0].eat();
        animals[0].breath();
        //猫
        animals[1].run();
        animals[1].eat();
        animals[1].breath();
        //鱼
        animals[2].run();
        animals[2].eat();
        animals[2].breath();
    }
}
