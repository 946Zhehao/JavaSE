package Thread;
/*
了解内容
线程的调度：
    1、常见的线程调度有两种
        抢占式调度模型：
            哪个线程的优先级比较高，抢到的时间片的概率就高一些
            java采用的就是抢占式调度模型
        均分式调度模型：
            平均分配CPU时间片，每个线程占有的CPU时间片时间长度一样
            平均分配，一切平等
    2、java中提供了一些和线程调度有关的方法
        实例方法：
            void setPriority(int new Priority)  设置线程的优先级
            int getPriority()   获取线程优先级
            最低优先级1
            默认优先级5
            最高优先级10
            优先级比较高的获取CPU时间片可能会多一些（但也不完全是）
            void join()     合并线程
                class MyThread1 extends Thread {
                    public void doSome() {
                        MyThrad2 t = new MyThread2();
                        t.join();   //当前线程进入阻塞，t线程执行，直到t线程结束，当前线程才可以继续
                    }
                }

                class MyThread2 extend Thread {
                }
        静态方法：
            static void yield() 让位方法
            暂停当前正在执行的线程对象，并执行其他线程
            yield()方法不是阻塞方法，让当前线程让位，让给其他线程使用
            yield()方法的执行会让当前线程从”运行状态“回到”就绪状态“

 */
public class ThreadTest09 {
    public static void main(String[] args) {
        System.out.println("最高优先级" + Thread.MAX_PRIORITY);
        System.out.println("默认优先级" + Thread.NORM_PRIORITY);
        System.out.println("最低优先级" + Thread.MIN_PRIORITY);

        System.out.println(Thread.currentThread().getName() + "线程的默认优先级是：" + Thread.currentThread().getPriority());

        Thread t = new Thread(new MyRunnable5());
        t.setName("曹贼");
        t.start();
    }
}

class MyRunnable5 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程的默认优先级是：" + Thread.currentThread().getPriority());
    }
}


