package Interface;

public interface Instance {
    void say();

    void attack();
}

interface A {
    public final static int b = 20;
    //接口中都是常量 final static 可以省略不写
    int a = 50;

    //public abstract 也可以不写，系统默认加
    void start();

    int sum(int a, int b);
    int sub(int a, int b);
}

interface B extends A,Instance {
    String str = "芜湖";
}

interface C extends A,B,Instance {
    int f = 521;
}

interface D{

}

interface E{

}

