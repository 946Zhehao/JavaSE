package ThreadSafe;

public class Account {
    //账户
    private String user;
    //余额
    private double balance;

    public Account() {

    }

    public Account(String user, double balance) {
        this.user = user;
        this.balance = balance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款，解决线程安全问题
    public void withdraw(double money) {
        /*
        线程同步机制的语法：
            1、synchronized(线程的共享对象) {
                //线程同步代码块
            }
            小括号内的数据相当关键，这个数据必须是多线程共享的数据。
            ()中要写线程共享的对象，假设有5个线程，只想让t1，t2，t3排队，
            ()中就要写t1,t2,t3这三个线程共享的对象
            大括号括的内容越多效率越低

            2、也可以在实例方法上加上synchronized，
            public synchronized void withdraw() {
            }
            一定锁的是this，不能是其他对象，这种方式不灵活
            表示整个方法体都需要同步，导致效率降低
            优点：代码少。如果锁的只有this，没有其他对象的情况，建议使用该方法
         */
        synchronized(this) {
            //取款前
            double before = balance;
            //取款后
            double after = before - money;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //更新账户余额
            this.setBalance(after);
            System.out.println(Thread.currentThread().getName() + "取款成功，" + "余额：" + this.balance);
        }
    }

    /*
    //取款
    public void withdraw(double money) {
        //取款前
        double before = balance;
        //取款后
        double after = before - money;
        //让执行到处的线程睡眠1秒，另一个线程就会在上一个线程更新账户余额之前进行取款操作，
        //加睡眠是为了看清线程安全问题
        //不加睡眠也有可能会出现该问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //更新账户余额
        this.setBalance(after);

        System.out.println(Thread.currentThread().getName() + "取款成功，" + "余额：" + this.balance);
    }
     */
}
