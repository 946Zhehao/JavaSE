package Final;

public class YuanMianJi {
    public static void main(String args[]){
        final int b = 55;   //final定义b为常量，不可再进行赋值操作
        int a1 = 12;
        int a2 = 012;     //开头为0表示八进制
        int a3 = 0x12;    //十六进制
        int a4 = 0xAbc;   //十六进制
        long a5 = 11L;
        float f1 = 11.1002f;
        double d1 = 11.1201;
        double d2 = 11.21D;
        char c1 = 'A';
        char c3 = '国';      //一个中文占两个字节，char类型正好两个字节
        //Unicode码定义字符集，u后边的为十六进制数，Unicode编码字符用16位无符号整数表示，0~65535（2^16）
        //注释中若含有 \ + u 则会出现非法的Unicode转义错误
        char c2 = '\u0031';
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(b);

        int i = 23456789;
        float f = i;
        System.out.println(f);
    }
}
