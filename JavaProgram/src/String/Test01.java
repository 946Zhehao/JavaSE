package String;
/*
String类中的构造方法
 */
public class Test01 {
    public static void main(String[] args) {
        byte[] bt = {97, 99, 105};  //byte数组会自动将97, 99, 105转换成对应字符
        //String类的构造方法
        String s1 = new String(bt);
        //String类已经重写了toString()方法
        System.out.println(s1); //aci

        //String类的构造方法
        //                    数组   起始下标    长度
        String s2 = new String(bt, 1, 2);
        System.out.println(s2); //ci

        //String类的构造方法
        char[] ch = {'我', '爱', '中', '国'};
        String s3 = new String(ch);
        String s4 = new String(ch, 2, 2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
