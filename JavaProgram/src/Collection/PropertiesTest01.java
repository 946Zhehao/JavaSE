package Collection;

import java.util.Properties;

/*
Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型
Properties被称为属性类对象
 是线程安全的
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties pro = new Properties();
        //需要掌握两个方法，一个存，一个取
        //添加元素
        pro.setProperty("LZH1", "Love1");
        pro.setProperty("LZH2", "Love2");
        pro.setProperty("LZH3", "Love3");
        pro.setProperty("LZH4", "Love4");

        //通过key获取value
        String s1 = pro.getProperty("LZH1");
        String s2 = pro.getProperty("LZH2");
        String s3 = pro.getProperty("LZH3");
        String s4 = pro.getProperty("LZH4");
        String s5 = pro.getProperty("LZH5");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
