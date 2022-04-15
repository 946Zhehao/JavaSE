package Integer;
/*
8中基本数据类型队形的包装类
    基本数据类型              包装类型
    byte                    java.lang.Byte(父类Number)
    short                   java.lang.Short(父类Number)
    int                     java.lang.Integer(父类Number)
    long                    java.lang.Long(父类Number)
    float                   java.lang.Float(父类Number)
    double                  java.lang.Double(父类Number)
    boolean                 java.lang.Boolean(父类Object)
    char                    java.lang.Character(父类Object)
重点时Integer其他照葫芦画瓢
 */
public class Test02 {
    public static void main(String[] args) {
        //基本数据类型转换为引用数据类型（装箱）
        //形参为int类型的构造方法
        Integer i = new Integer(123);
        //形参为String类型的构造方法
        Integer ir = new Integer("100");
        System.out.println(i);
        System.out.println(ir);
        //将引用数据类型转换为基本数据类型
        float f = i.floatValue();
        System.out.println(f);
        //将引用数据类型转换为基本数据类型（拆箱）
        int i2 = i.intValue();
        System.out.println(i2);

        //访问包装类的常量，获取最大值和最小值
        System.out.println("int的最大值" + Integer.MAX_VALUE);
        System.out.println("int的最小值" + Integer.MIN_VALUE);
        System.out.println("Byte的最大值" + Byte.MAX_VALUE);
        System.out.println("Byte的最小值" + Byte.MIN_VALUE);

        //JDK1.5之后，支持自动拆箱和自动装箱
        Integer x = 100;
        int y = x;
    }
}
