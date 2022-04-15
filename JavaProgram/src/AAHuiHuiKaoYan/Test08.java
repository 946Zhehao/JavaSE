package AAHuiHuiKaoYan;
import java.util.*;
/*
LeetCode225用队列实现栈
 */
public class Test08 {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        //int i = ms.pop();
        LinkedList l = new LinkedList();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        Iterator it = l.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(l.pop());
    }
}

class MyStack {
    private int maxSize = 10;
    private List<Integer> l;

    public MyStack() {
        l = new LinkedList<Integer>();
    }

    //元素x入栈
    public void push(int x) {
        //如果栈满不能执行该操作
        if(l.size() == 10) {
            System.out.println("栈已满！无法入栈。");
            return;
        }

    }

    //移除栈顶元素
    public int pop() {
        //如果栈为空，不能执行该操作
        if(l.size() == 0) {
            System.out.println("栈已空！无法出栈。");
            return -1;
        }
        return 0;
    }

    //获取栈顶元素
    public int top() {
        return -1;
    }

    //返回栈是否为空 true为空，false不为空
    public boolean empty() {
        return false;
    }
}
