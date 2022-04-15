package UsingOfThis;

public class TThis {
    int i;

    //静态方法内部访问其他方法
    public static void doother(){
        //访问普通方法
        TThis t = new TThis();
        t.dosome();
        t.run();
        System.out.println(t.i);

        //访问静态方法
        TThis.go();
        go();

    }
    //普通方法内部访问其他方法
    public void dosome(){
        //访问普通方法
        this.run();
        System.out.println(this.i);
        run();

        //访问静态方法
        TThis.go();
        TThis.doother();
        go();
        doother();
    }

    public static void go(){
        //访问静态方法
        TThis.doother();
        doother();

        //访问普通方法
        TThis t = new TThis();
        t.run();
        t.dosome();
        System.out.println(t.i);

    }

    public void run(){
        //访问静态方法
        go();
        doother();
        TThis.go();
        TThis.doother();

        //访问普通方法
        this.dosome();
        System.out.println(this.i);
    }
}
