package Thread;
/*
线程合并
 */
public class ThreadTest11 {
    public static void main(String[] args) {
        System.out.println("main begin");

        Thread t = new Thread(new MyRunnable7());
        t.setName("MVP阿斗");
        t.start();

        //合并线程
        try {
            //t线程合并到当前线程，当前线程受到阻塞，直到t线程结束
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main over");
    }
}

class MyRunnable7 implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0; i < 1000; i++) {
            System.out.println(t.getName() + ":" + i);
        }
    }
}
