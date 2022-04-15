package Integer;
/*
Integer常用方法
 */
public class Test04 {
    public static void main(String[] args) {
        //字符串转换
        int value = Integer.parseInt("123");
        System.out.println(value);
        System.out.println(Character.getNumericValue('4'));
        double value2 = Double.parseDouble("1231");
        System.out.println(value2);
        //转换为二进制
        String str = Integer.toBinaryString(9);
        System.out.println(str);
        //转换为16进制
        str = Integer.toHexString(16);
        System.out.println(str);
        //转换为八进制
        str = Integer.toOctalString(8);
        System.out.println(str);

        //valueOf方法
        value = Integer.valueOf("111");
        System.out.println(value);

        value = Integer.valueOf(100);
        System.out.println(value);

        str = String.valueOf("1001");
        System.out.println(str);

        str = String.valueOf(1002);
        System.out.println(str);

        int x = Integer.valueOf("61s2");
        System.out.println(x);
    }
}
