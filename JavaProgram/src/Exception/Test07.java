package Exception;

public class Test07 {
    public static void main(String[] args) {
        MyException me = new MyException("请输入用户名");
        me.printStackTrace();
    }
}
