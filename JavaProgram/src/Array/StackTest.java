package Array;
import Extends.*;

public class StackTest {
    public static void main(String[] args) {
        Stack sk = new Stack(4);

        try {
            sk.push(new Cat());
            sk.push(new Cat());
            sk.push(new Dog());
            sk.push(new Dog());
            sk.push(new Cat());
        } catch (MyStackOperationException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        //输出数组长度
        System.out.println(sk.getLength());
        //输出栈顶指针
        System.out.println(sk.getIndex());
        //输出弹栈的元素
        Object obj = null;

        try {
            obj = sk.pop();
        } catch (MyStackOperationException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("弹出元素：" + obj);
        //输出栈顶指针
        System.out.println(sk.getIndex());
        //扩容
        sk.addLength(20);
        //输出数组长度
        System.out.println(sk.getLength());
        //输出栈顶指针
        System.out.println(sk.getIndex());
        //输出弹栈的元素
        Object obj2 = null;

        try {
            obj2 = sk.pop();
        } catch (MyStackOperationException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("弹出元素：" + obj2);
        //输出栈顶指针
        System.out.println(sk.getIndex());
    }
}

