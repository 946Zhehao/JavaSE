package Integer;
/*
相互转换
 */
public class Test05 {
    public static void main(String[] args) {
        //String---->int
        int a = Integer.parseInt("123");
        System.out.println(a);
        //int---->String
        int b = 10;
        String s = 10 + "";
        System.out.println(s);

        s = String.valueOf(b);
        System.out.println(s);
        //String---->Integer
        Integer y = Integer.valueOf("1001");
        System.out.println(y);
        //Integer---->String
        String s2 = String.valueOf(1100);
        System.out.println(s2);
        //int---->Integer
        Integer x = 1000;
        System.out.println(x);
        //Integer---->int
        int z = x;
        System.out.println(z);
    }
}
