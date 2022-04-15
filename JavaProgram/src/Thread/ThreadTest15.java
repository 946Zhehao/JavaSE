package Thread;
/*
关于Object类中的wait和notify方法。（生产者和消费者模式）
    第一：wait和notify方法不是线程对象的方法，是java中任何一个java对象都有的方法。
        因为这两个方式是Object类中自带的
    第二：wait()方法的作用
        Object o = new Object();
        o.wait();
        表示：让正在o对象上活动的线程进入等待状态，无期限等待，直到被唤醒为止

    第三：notify()方法的作用
        Object o = new Object();
        o.notify();
        表示：唤醒正在o对象上等待的线程

        还有一个notifyAll()方法
        表示：唤醒o对象上所有处于等待的线程
 */
public class ThreadTest15 {
    public static void main(String[] args) {

    }
}
