package Date;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
java.util.Date类
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //获取系统时间
        Date date = new Date();
        //已重写toString方法
        System.out.println(date);   //Thu Jan 28 19:07:00 CST 2021
        //java.text包下有一个SimpleDateFormat方法，专门负责日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        //yyyy  年
        //MM    月
        //dd    日
        //HH    时
        //mm    分
        //ss    秒
        //SSS   毫秒
        //除了以上的，其他可以随便写，例如：yyyy-MM-dd HH:mm:ss:sss ----yyyy/MM/dd HH/mm/ss/sss

        //将时间格式转换为新定义的格式
        String str = sdf.format(date);
        System.out.println(str);

        //将字符串String转换为Date类型
        String time = "1999-03-27 03:27:10:221";
        //SimpleDateFormat sdf2 = new SimpleDateFormat("格式不能随便写，要和字符串格式一样");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date datetime = sdf2.parse(time);
        System.out.println(datetime);
        str = sdf2.format(datetime);
        System.out.println(str);       //Sat Mar 27 03:27:10 CST 1999
    }
}

