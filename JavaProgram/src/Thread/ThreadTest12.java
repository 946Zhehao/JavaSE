package Thread;
/*
守护线程
    java语言中线程分为两大类：
        一类是：用户线程
        一类是：守护线程（后台线程）
        其中具有代表性的就是：垃圾回收线程（守护线程）
    守护线程的特点：
        一般守护线程是一个死循环，所有的用户线程只要结束
        守护线程自动结束
    注意：主线程main方法是一个用户线程
    守护线程用在什么地方？
        每天00：00的时候系统数据自动备份
        这个需要使用到定时器，并且我们可以将定时器设置为守护线程
        一直在哪里看着，每到00：00的时候就备份一次，所有的用户线程
        如果结束了，守护线程自动退出，没有必要进行数据备份了
 */
public class ThreadTest12 {
    public static void main(String[] args) {
        BakDataThread bdt = new BakDataThread();
        bdt.setName("备份数据的线程");
        //将线程设置为守护线程
        bdt.setDaemon(true);
        bdt.start();

        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "------>" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BakDataThread extends Thread {
    public void run() {
        int i = 0;
        //即使是死循环，由于该线程是守护线程，当用户线程结束时，该线程也会自动结束
        while(true) {
            System.out.println(Thread.currentThread().getName() + "------>" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}