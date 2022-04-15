package Final;

public class Nal{
    //final 定义的变量不能被第二次赋值,相当于常量, 修饰实例变量时必须手动赋值，不能采用默认值
    //以下时两种方法：
    //1、
    final int a = 50;
    //2、
    final int b;
    public Nal(){
        this.b = 100;
    }

    //final 定义的方法被继承后不能重写
    public final void run(){
        //局部变量可以这样写，但实例变量不可以
        final int c;
        c = 200;
        System.out.println("Run!");
    }
}
