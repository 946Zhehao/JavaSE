package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
记录日志的方法
 */
public class LogTest {
    public static void main(String[] args) {
        Logger.log("芜湖大司马起飞了！");
        Logger.log("狒狒使用了番茄连招!");
        Logger.log("骚猪烫嘴了!");
    }
}

class Logger {
    public static void log(String msg) {
        try {
            //指定一个输出文件
            PrintStream ps = new PrintStream(new FileOutputStream("D:\\宅\\图片\\生活\\logger.txt", true));
            //改变输出方向
            System.setOut(ps);
            //日期当前时间
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);

            System.out.println(strTime + ":" + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
