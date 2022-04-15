package StringBuffer;
/*
java中字符串是不可变的，每次拼接都会产生新的字符串，这样会占用大量的方法去内存
若要进行大量字符串的拼接操作，建议使用JDK中自带的：
    java.lang.StringBuffer
    java.lang.StringBuilder
 */
public class Test {
    public static void main(String[] args) {
        //创建一个初始化容量为16个byte[]数组
        StringBuffer stringBuffer = new StringBuffer();
        //拼接字符串，同意调用append()方法
        stringBuffer.append(3);
        stringBuffer.append(3.14);
        stringBuffer.append(300L);
        stringBuffer.append('a');
        stringBuffer.append("hello");
        stringBuffer.append(new Test());
        //append()追加时，若byte数组满了，会自动扩容
        System.out.println(stringBuffer);
    }
}
