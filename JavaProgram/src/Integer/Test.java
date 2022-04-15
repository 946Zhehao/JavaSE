package Integer;
/*
Java中为8中基本数据类型又对应准备了8中包装类型，属于引用数据类型，父类Object
    调用方法时可能需要传一个数字进去，但是方法的形参类型时Object，此时则需要用包装类传进去
 */
public class Test {
    public static void main(String[] args) {
        //把数字包装成对象
        MyInt myInt = new MyInt(100);

        doSome(myInt);
    }

    public static void doSome(Object obj) {
        System.out.println(obj);
    }
}
