package Interface;

/*
* 接口是完全抽象的，特殊的抽象类
* 基础语法【修饰符列表】 interface 接口名{}
* 接口是一种“引用数据类型”，编译之后也生成class字节码文件
* 接口支持多继承，一个接口可以继承多个接口
* 接口中只包含两部分内容：常量，抽象方法
* 接口中所有元素都是public修饰的
* 接口中所有方法都是抽象方法
* public abstract可以省略不写
* 类实现接口要实现所有方法，抽象类除外
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(A.a);
        System.out.println(B.str);

        //接口支持多态
        A ac = new Achieve();
        ac.start();
        int sum = ac.sum(10, 8);
        int sub = ac.sub(50, 60);
        System.out.println("sum = " + sum);
        System.out.println("sub = " + sub);

        //多继承
        Instance it = new TwoAchieve();
        A a = new TwoAchieve();

        it.attack();
        it.say();

        //没有转换类型时不能使用一个接口的引用去调用继承过来的另一接口的数据
        TwoAchieve tw = (TwoAchieve)it;
        tw.start();
        sum = tw.sum(20, 10);
        sub = tw.sub(50, 30);
        System.out.println("sum = " + sum);
        System.out.println("sub = " + sub);

        //注意以下操作,接口与接口之间进行强制类型转换的时候，没有继承关系，也可以强转
        //编译器没意见，但在运行时可能会出现：ClassCastException异常
        A a2 = (A)it;
        Instance it2 = (Instance)a;

        a2.start();

        it2.say();
        it2.attack();

    }
}
