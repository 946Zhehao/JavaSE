package Thread;
/*
怎么合理的终止一个线程的执行，这种方式是很常用的
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        //创建一个可运行的对象
        MyRunnable4 mr = new MyRunnable4();
        //将可运行的对象转换为线程对象
        Thread t = new Thread(mr);
        //设置名字
        t.setName("二爷");
        //启动线程
        t.start();

        //5秒后终止线程
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        mr.run = false;
    }
}

class MyRunnable4 implements Runnable {
    public boolean run = true;

    @Override
    public void run() {
        //获取当前线程对象
        //哪个线程执行run方法，获取的就是哪个线程
        Thread t = Thread.currentThread();
        for(int i=0; i < 10; i++) {
            //如果run为true，则执行，否则终止线程
            if(run) {
                System.out.println(t.getName() + "------------->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                //return之前可以执行保存数据的代码
                //终止线程
                return;
            }
        }
    }
}

