package AAHuiHuiKaoYan;
import java.util.*;
/*
LeetCode232用栈实现队列
 */
public class Test07 {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();

        mq.push(10);
        mq.push(3);
        mq.push(5);
        mq.push(7);
        mq.push(9);
        mq.push(8);

        int x = mq.pop();
        System.out.println(x);

        int peek = mq.peek();
        System.out.println(peek);

        boolean flag = mq.empty();
        System.out.println(flag);
    }
}

class MyQueue {
    private int length = 0;
    private Stack<Integer> s1 = null;
    private Stack<Integer> s2 = null;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    //压栈
    public void push(int i) {
        if(s1.size() == s1.capacity()) {
            System.out.println("队列已满，不能压栈！");
            return;
        }
        if(s1.isEmpty() && !s2.isEmpty()) {
            //将s2剩余所有元素放回s1栈中
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        s1.push(i);
        length++;
    }

    //弹栈
    public int pop() {
        if(s1.size() == 0 && s2.size() == 0) {
            System.out.println("队列已空，不能弹栈！");
            return -1;
        }
        //将s1栈中元素弹栈到s2，方便取到队列首部元素
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        //弹出所需元素
        int result = s2.pop();
        length--;
        return result;
    }

    //返回队列首部元素
    public int peek() {
        if(s1.size() == 0 && s2.size() == 0) {
            System.out.println("队列已空！");
            return -1;
        }
        if(!s2.isEmpty()) {
            return s2.peek();
        } else {
            //将s1栈中元素弹栈到s2，方便取到队列首部元素
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    //判断是否为空
    public boolean empty() {
        if(s1.isEmpty() && s2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
