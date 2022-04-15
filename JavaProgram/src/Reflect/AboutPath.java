package Reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
研究文件路径问题

 */
public class AboutPath {
    public static void main(String[] args) throws IOException {
        //这种方式的路径缺点时：移植性差，在IDEA中默认的当前路径时project的根。
        //这个代码假设离开了IDEA，换到了其他位置，可能当前路径就不是project的根了这时这个路径就无效了
        //FileReader fr = new FileReader("Classinfo.properties");

        //一种比较通用的路径，即使代码换位置了，这样编写仍是通用的
        //使用前提是：这个文件必须在类路径下
        //凡是在src下的都是类路径下
        //src是类的根路径
        /*
        解释：
            Thread.currentThread()  当前线程对象
            getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载器对象
            getResource()   [获取资源]这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
         */
        /*
        //这种方法可以获取文件的绝对路径                                                  ↓这个位置是一个路径，从src开始
        String path = Thread.currentThread().getContextClassLoader().getResource("Classinfo2.properties").getPath();
        //System.out.println(path);
        FileReader fr = new FileReader(path);
        */
        //以上两行代码可以改写为，直接以流的方式返回
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("Classinfo2.properties");

        Properties pro = new Properties();
        pro.load(reader);
        String className = pro.getProperty("ClassName");
        String wdnmd = pro.getProperty("WDNMD");
        String aoligei = pro.getProperty("WUHU");
        System.out.println(className);
        System.out.println(wdnmd);
        System.out.println(aoligei);
    }
}
