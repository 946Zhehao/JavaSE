package Thread;

/*
唤醒正在睡眠的线程
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        //创建一个可运行的对象
        MyRunnable2 mr = new MyRunnable2();
        //将可运行的对象转换成线程对象
        Thread t = new Thread(mr);
        //设置线程名字
        t.setName("皇叔");
        //启动线程
        t.start();

        try {
            //main线程休眠5秒，之后叫醒t线程
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //唤醒t线程
        t.interrupt();
        System.out.println("Hello World!");
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "------------>" + "begin");
        try {
            //睡眠一年
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "------------>" + "over");
    }
}