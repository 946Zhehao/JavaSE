package String;
/*
要经常翻文档 java.lang.String
    1、String表示字符串，属于引用数据类型
    2、用双引号括起来的都是String对象
    3、双引号括起来的字符串，是不可变的
    4、双引号括起来的字符串，都是直接存储在“方法区”的“字符串常量池”当中的
    5、由于字符串在实际开发中使用太频繁，为了执行效率，故存放在“方法区”的“字符串常量池”当中
 */
public class Test {
    public static void main(String[] args) {
        //以下两句代码存在三个对象,都在字符串常量池当中
        //s1指向“abc”
        //“xyz”没有引用指向它，但它也是一个对象
        //s2指向由“abc”和"xyz"拼接而成的新的对象"abcxyz"
        String s1 = "abc";
        String s2 = "abc" + "xyz";

        //使用new对象方式创建字符串对象
        //凡是双引号括起来的都是在字符串常量池当中
        //new对象时一定在堆内存中开辟空间，故堆内存中的对象存放的是一个指向字符串常量池中的"def"的地址
        //s3 指向堆内存中的对象
        String s3 = new String("def");

        //由于双引号括起来的都是在字符串常量池中
        //由于s4和s5等号后的内容相同，故在字符串常量池中不会重复创建对象
        //而是s4和s5同时指向一个对象，故存放的地址相同
        String s4 = "hello";
        String s5 = "hello";
        System.out.println(s4 == s5);   //比较s4和s5的地址，结果为true

        //以下两行s6和s7存放的是堆内存中对象的地址，new一次就创建一个对象
        //故s6和s7存放的地址是不相同的
        String s6 = new String("world");
        String s7 = new String("world");
        System.out.println(s6 == s7);   //false
        //判断字符串相等必须使用equals方法
    }
}
