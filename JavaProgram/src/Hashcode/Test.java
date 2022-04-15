package Hashcode;

/*
* Object中的hashcode方法
*       public native int hashCode();
*       不是抽象方法，带有native关键字，底层调用C++程序
* hashCode()返回的时哈希码：
*       实际上就是一个java对象的内存地址，经过哈希算法，得出的一个值
*       hashCode()的执行结果可以等同于看作一个java对象的内存地址
 */
public class Test {
    public static void main(String[] args) {
        Object o = new Object();
        int hashCodeValue = o.hashCode();

        System.out.println(hashCodeValue);      //284720968
    }
}
