package Thread;
/*
强行终止一个线程
    这种方式存在很大的缺点：容易丢失数据。线程为保存的数据将会丢失，不建议使用
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new Thread(new MyRunnable3());
        //设置线程名字
        t.setName("丞相");
        //启动线程
        t.start();

        //5秒后强行终止t线程
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止t线程
        t.stop();   //已过时（不建议使用）
    }
}

class MyRunnable3 implements Runnable {
    @Override
    public void run() {
        //获取当前线程对象
        //哪个线程执行run方法，获取的就是哪个线程
        Thread t = Thread.currentThread();
        for(int i=0; i < 10; i++) {
            System.out.println(t.getName() + "------------->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
