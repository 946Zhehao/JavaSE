package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
    异常对象有两个非常重要的方法
        获取异常简单的描述信息
            String msg = exception.getMessage();
        打印异常追踪的堆栈信息
            exception.printStackTrace();
 */
public class Test03 {
    public static void main(String[] args) {
        //这里只new了异常对象，但是没有将异常对象抛出，JVM会认为这是一个普通的java对象
        NullPointerException npe = new NullPointerException("空指针异常");
        //获取异常简单的描述信息
        String msg = npe.getMessage();
        System.out.println(msg);
        //打印异常堆栈信息
        //打印异常堆栈信息时，采用了异步线程的方式
        //在实际开发中建议在catch中使用以下代码
        npe.printStackTrace();

        try {
            m1();
        }catch (FileNotFoundException fis) {
            fis.printStackTrace();
        }

        System.out.println("Hello World!");
    }

    public static void m1() throws FileNotFoundException {
        new FileInputStream("F:\\Program Run\\复试\\2021王道操作系统.pdf");
    }
}
