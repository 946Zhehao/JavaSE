package Date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
        //1970-01-01 00:00:00 001
        Date time  = new Date(10);   //参数是一毫秒

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);

        System.out.println(strTime);  //1970-01-01 08:00:00 010

        //获取昨天此时的时间
        Date yesTime = new Date(System.currentTimeMillis() - 1000*60*60*24);
        strTime = sdf.format(yesTime);
        System.out.println(strTime);

        //获取去年今天的当前时间
        Date lastYearTime = new Date(System.currentTimeMillis() - (long)1000*60*60*24*365);
        strTime = sdf.format(lastYearTime);
        System.out.println(strTime);
    }
}
