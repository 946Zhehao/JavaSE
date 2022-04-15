package Date;

public class Test02 {
    public static void main(String[] args) {
        //获取自1970年1月1日00：00：00 000到当前系统时间的总毫秒数
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);      //1611890379380

        long begin = System.currentTimeMillis();
        int i = 100000000;
        while(i >= 0) {
            i--;
        }
        long end = System.currentTimeMillis();
        System.out.println("程序执行时间为" + (end - begin) + "毫秒");
    }
}
