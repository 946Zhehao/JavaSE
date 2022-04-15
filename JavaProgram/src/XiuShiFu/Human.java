package XiuShiFu;

//类只能用 public 和 缺省 修饰，内部类除外

public class Human {
    //受保护的      同包下的类或子类，可以访问
    protected int i = 5;
    //缺省的        同包下的类可以访问
    int j = 10;
    //私有的        只有本类可以访问
    private int m = 20;
    //公有的        任何类都可访问
    public int n = 30;

}
