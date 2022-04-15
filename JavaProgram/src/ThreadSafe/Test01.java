package ThreadSafe;

public class Test01 {
    public static void main(String[] args) {
        //创建账户对象
        Account acc = new Account("三爷", 10000);
        Account acc1 = new Account("皇叔", 10000);
        //创建线程对象
        AccountThread at1 = new AccountThread(acc);
        AccountThread at2 = new AccountThread(acc);
        AccountThread at3 = new AccountThread(acc1);
        AccountThread at4 = new AccountThread(acc1);
        //设置名字
        at1.setName("二爷");
        at2.setName("三爷");
        at3.setName("皇叔");
        at4.setName("曹贼");
        //启动线程
        at1.start();
        at2.start();
        at3.start();
        at4.start();
    }
}
