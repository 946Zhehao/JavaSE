package Integer;
//JDK1.5之后，支持自动拆箱和自动装箱
//有了自动拆箱之后，Number类中的方法就用不着了
public class Test03 {
    public static void main(String[] args) {
        Integer x = 1000;
        int y = x;
        //基本运算时可以自动拆箱
        System.out.println(x + 1);  //1001
        Integer z = 1000;
        //双等号不会触发自动拆箱，比较的还是引用的地址
        System.out.println(x == z); //false

        //java中为了提高程序的执行效率，将 -128~127之间所有的包装对象提前创建好
        //放到方法去的整数型常量池中，目的是只要用这个区间的数据就不需要再new了，直接从整数型常量池当中取出来
        x = 127;
        z = 127;
        System.out.println(x == z); //true
        x = 128;
        z = 128;
        System.out.println(x == z); //false
        double d = x;
        System.out.println(d);
        //字符串转换成Int
        int value = Integer.parseInt("12345");
        System.out.println(value);
    }
}
