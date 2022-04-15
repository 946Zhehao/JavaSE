package Thread;
/*
实现线程的第一种方式，
    编写一个类，继承java.lang.Thread，重写run方法
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        //创建一个分支线程对象
        MyThread mt = new MyThread();
        //启动线程
        //start()方法的作用是：启动一个分支线程，在JVM中开辟一个新的栈空间，这段代码任务完成之后，瞬间就结束了。
        //启动成功的线程会自动调用run()方法，并且run方法在分支栈的栈底部。
        //和main方法是平级的
        mt.start();
        for(int i=0; i < 1000; i++) {
            System.out.println("主线程：" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        //编写程序，这段程序运行在分支线程中（分支栈）
        for(int i=0; i < 1000; i++) {
            System.out.println("分支线程：" + i);
        }
    }
}
