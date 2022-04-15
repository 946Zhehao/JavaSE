package Reflect;

import java.io.FileReader;
import java.util.Properties;

/*
验证反射机制的灵活性
    java代码写一遍，在不改变java源代码的基础上，可以做到不同对象的实例化，非常之灵活
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        //通过IO流读取Classinfo.properties文件
        FileReader fr = new FileReader("Classinfo.properties");
        //创建一个Map集合
        Properties pro = new Properties();
        //读取配置文件中的数据加入Map集合
        pro.load(fr);
        //关闭流
        fr.close();
        //通过key获取value
        String className = pro.getProperty("ClassName");
        System.out.println(className);
        //通过反射机制实例化对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);

    }
}
