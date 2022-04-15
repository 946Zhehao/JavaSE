package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/*
实现线程的第三种方式：实现Callable接口（JDK8新特性）
这种方式实现的线程可以获取线程的返回值
之前讲解的那两种方式无法获取线程返回值，因为run方法返回void
优点：可以获取线程的执行结果
缺点：效率较低，在获取线程执行结果时，当前线程会被阻塞
 */
public class ThreadTest14 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一步：创建一个“未来任务类”对象
        //参数非常重要，需要给一个Callable接口实现类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {     //call()方法就相当于run方法，只不过有返回值
                //线程执行一个惹怒我，执行之后可能会有一个执行结果
                //模拟执行
                System.out.println("call method begin");
                Thread.sleep(1000 * 10);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;
            }
        });

        //创建线程对象
        Thread t = new Thread(task);
        //启动线程
        t.start();

        //获取call()方法的返回值
        Object obj = task.get();
        //get方法会导致当前线程阻塞
        //get方法可能会导致main方法的代码不能往下执行，因为要等待call方法的返回值，所以需要等到另一个线程执行结束，才可以继续往下执行
        System.out.println(obj);
    }
}
