package Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
定时器
    作用：间隔特定的时间，执行特定的程序
    如：每周要进行银行账户的总账操作
       每天要进行数据的备份操作
    这种需求很常见，在java中可以采用多种方式实现：
        1、可以额使用sleep方法，设置睡眠时间，最原始的定时器
        2、在java的类库中已经写好了一个定时器：java.util.Timer，可以直接用，不过这种方式在目前的开发中也很少用，因为现在又很多高级框架都是支持定时任务的
        3、在实际开发中，目前使用较多的是Spring框架中提供的SpringTask框架，只要进行简单的配置，就可以完成定时器的任务
 */
public class ThreadTest13 {
    public static void main(String[] args) throws ParseException {
        //使用定时器指定定时任务
        //创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true);    //守护线程的方式

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        //指定开始时间
        Date fistTime = sdf.parse("2021-02-16 14:08:00 000");
        //指定定时任务
        //time.schedule(定时任务，第一次执行时间，间隔多久执行一次)，firstTime可以使用匿名内部类
        timer.schedule(new LogTimerTask(), fistTime, 1000 * 10);
    }
}

//编写一个定时任务类
//假设这是一个纪律日志的定时任务
class LogTimerTask extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        //获取当前时间
        String strTime = sdf.format(new Date());
        //编写要执行的任务
        System.out.println(strTime + "任务执行");
    }
}
