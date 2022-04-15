package ThreadSafe;

public class AccountThread extends Thread{
    private  Account acc;

    public  AccountThread() {

    }

    public AccountThread(Account acc) {
        this.acc = acc;
    }
    @Override
    public void run() {
        acc.withdraw(2000);
    }
}
