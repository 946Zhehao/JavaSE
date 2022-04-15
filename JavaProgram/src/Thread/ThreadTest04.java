package Thread;
/*
1、怎么获取当前线程对象
    static Thread currentThread()
    Thread t = Thread.currentThread();
2、获取线程对象的名字
    String name = 线程对象.getName();
3、修改线程对象的名字
    线程对象.setName("名字");
    不修改线程对象的名字时，默认为Thread-0，Thread-1..............
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        //这个放啊出现在main方法中，当前线程就是主线程
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        //创建线程对象
        MyThread2 mt = new MyThread2();
        MyThread2 mt2 = new MyThread2();
        //设置线程的对象
        mt.setName("ZRJ");
        mt2.setName("LZH");
        //启动线程
        mt.start();
        mt2.start();
        //获取线程的名字
        String threadName = mt.getName();
        System.out.println(threadName);
        for(int i=0; i < 1000; i++) {
            System.out.println(t.getName() + ":" + i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        //获取当前线程对象
        //哪个线程执行run方法，获取的就是哪个线程
        Thread t = Thread.currentThread();
        for(int i=0; i < 1000; i++) {
            System.out.println(t.getName() + ":" + i);
        }
    }
}
