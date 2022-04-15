package Thread;
/*
让位，让当前线程暂停，回到就绪状态，让给其他线程
静态方法：Thread.yield()
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable6());
        t.setName("江东鼠辈");
        t.start();

        for(int i=0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class MyRunnable6 implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0; i < 1000; i++) {
            System.out.println(t.getName() + ":" + i);
            //如果i是10的倍数，让位一次
            if(i % 10 == 0) {
                Thread.yield();
            }
        }
    }
}
