package ToString;
/*
* toString()方法一般都要重写
* 尽量简便，易懂
* System.out.println(引用);会默认调用toString()方法  相当于System.out.println(引用.toString());
*
 */
public class Test {
    public static void main(String[] args) {
        MyTime mt = new MyTime(1999, 3, 27);
        System.out.println(mt);
        System.out.println(mt.toString());
    }
}
