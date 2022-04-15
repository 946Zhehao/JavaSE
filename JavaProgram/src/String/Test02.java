package String;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

/*
String类中常用方法
 */
public class Test02 {
    public static void main(String[] args) {
        //charAt(int index)取字符串中下标为index的字符返回
        char c = "中国".charAt(1);
        System.out.println(c);      //国

        //compareTo(String anotherString)比较两个字符串
        //相等返回0，前大后小返回1，前小后大返回-1
        //比较出第一个不相等字符的大小就会停止
        int result = "abc".compareTo("abc");    //0
        System.out.println(result);
        result = "abc".compareTo("abb");        //1
        System.out.println(result);
        result = "abc".compareTo("abd");        //-1
        System.out.println(result);
        //比较到第一个不相等字符的大小停止
        //以下值比较第一个字母 b 和 a
        result = "bac".compareTo("abd");        //1
        System.out.println(result);

        //boolean contains(CharSequence s)
        //判断前面的字符串中是是否包含后面的子字符串
        System.out.println("WDNMD".contains("NMD"));    //true
        System.out.println("WDNMD".contains("nmd"));    //false

        //boolean endsWith(String suffix)
        //判断当前字符串是否以某个字符串结尾
        System.out.println("WDNMD".endsWith("NMD"));    //true
        System.out.println("WDNMD".endsWith("nmd"));    //false

        //equals
        System.out.println("WDNMD".equals("WDNMD"));  //true
        System.out.println("WDNMD".equals("wdnmd"));  //false

        //boolean equalsIgnoreCase(String anotherString)
        //忽略大小写，判断两个字符串是否相等
        System.out.println("WDNMD".equalsIgnoreCase("WDNMD"));  //true
        System.out.println("WDNMD".equalsIgnoreCase("wdnmd"));  //true

        //byte[] getByte()
        //将字符串对象转换成字节数组
        byte[] bytes ="WDNMD".getBytes();
        /*
        for(int i=0; i<"WDNMD".length(); i++) {
            System.out.println(bytes[i]);
        }
        */
        
        //int indexOf(String str)
        //判断子字符串在主串中第一次出现的索引
        System.out.println("WDNMD".indexOf("D"));   //1

        //boolean isEmpty()
        //判断字符串是否为空字符串
        String s = null;
        String s2 = "";
        //System.out.println(s.isEmpty());  //空指针异常
        System.out.println(s2.isEmpty());   //true

        //int lastIndexOf(String str)
        //判断子字符串在主串中最后一次出现处的索引
        System.out.println("WDNMD".lastIndexOf("D"));   //4

        //String replace(char oldChar, char newChar)
        //将字符串中所有oldChar替换为newChar
        String s1 = "hello world".replace("ll", "x");
        System.out.println(s1);
        s1 = "https://www.bilibili.com/video/BV1Rx411876f?p=599".replace("video", "xxxxx");
        System.out.println(s1);

        //String[] split(String regex)
        //拆分字符串,将字符串以regex为分隔符进行拆分
        String[] str = "1999-03-27".split("-");
        for(int i=0; i<str.length; i++) {
            System.out.println(str[i]);   //1999  03  27
        }

        //boolean startsWith(String prefix)
        //判断主串是否以子串开始
        System.out.println("hello world".startsWith("hello"));  //true

        //String substring(int beginIndex)
        //从beginIndex位置开始截取字符串到末尾位置
        System.out.println("hello world".substring(5));  // world
        //String substring(int beginIndex, int endIndex)
        //从beginIndex位置开始截取字符串到endIndex-1为止
        System.out.println("hello world".substring(6, 9));//wor

        //char[] toCharArray()
        //将字符串转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for(int i=0; i<chars.length; i++) {
            System.out.println(chars[i]);
        }

        //String toLowerCase()
        //转换成小写
        System.out.println("HELLO WORLD".toLowerCase(Locale.ROOT)); //hello world
        //String toUpperCase()
        //转换成大写
        System.out.println("hello world".toUpperCase(Locale.ROOT));

        //String trim()
        //去除字符串前后空白，中间不去
        System.out.println("    xxx   aaa    ".trim()); //xxx   aaa

        //String 中只有一个方法是静态的
        //valueOf, 将非字符串转换成字符串
        s1 = String.valueOf(999);
        System.out.println(s1); //999
        //以下代码对象也会自动调用toString()方法
        s1 = String.valueOf(new Test02());
        System.out.println(s1); //String.Test02@10f87f48
    }
}
