package Thread;
/*
采用匿名内部类的方式
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i < 1000; i++) {
                    System.out.println("分支线程：" + i);
                }
            }
        });
        //启动线程
        t.start();

        for(int i=0; i < 1000; i++) {
            System.out.println("主线程：" + i);
        }
    }
}
