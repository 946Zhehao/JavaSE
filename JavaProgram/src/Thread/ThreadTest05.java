package Thread;
/*
关于线程的sleep()方法
    static void sleep(long millis)
    1、静态方法
    2、参数是毫秒
    3、作用：让当前线程进入休眠，进入“阻塞状态”，放弃占有CPU时间片，让给其他线程使用
    4、该方法可以做到该效果：每隔一段时间执行一段特定的代码
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        /*
        try {
            //让当前线程进入休眠，5秒
            //当前线程为主线程：main
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World!");
         */

        //关于Thread.sleep()方法的一个面试题
        //创建线程对象
        Thread t = new MyThread2();
        //设置线程名字
        t.setName("三爷");
        //启动线程
        t.start();

        try {
            //休眠5秒
            //问题：该行代码会让线程t进入休眠状态吗？
            t.sleep(1000 * 5);      //在执行的时候还是会转换成：Thread.sleep(1000 * 5)
                                          //这行代码的作用时，让当前线程进入休眠，也就是说main线程进入休眠
                                          //这行代码出现在main方法中，main方法休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World!");
    }
}
