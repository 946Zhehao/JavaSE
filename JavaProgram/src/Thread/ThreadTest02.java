package Thread;
/*
实现线程的第二种方式：编写一个类，实现java.lang.Runnable接口
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //创建一个可运行的对象
        MyRunnable mr = new MyRunnable();
        //将可运行的对象封装成线程对象
        Thread t = new Thread(mr);
        //合并代码
        //Thread t = new Thread(new MyRunnable());
        //启动线程
        t.start();

        for(int i=0; i < 1000; i++) {
            System.out.println("主线程：" + i);
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0; i < 1000; i++) {
            System.out.println("分支线程：" + i);
        }
    }
}
