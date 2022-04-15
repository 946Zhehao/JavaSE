package Reflect;

import java.lang.reflect.Constructor;

/*
使用反射机制怎么创建对象
 */
public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        //获取类
        Class c =Class.forName("Reflect.Vip");
        //调用无参构造方法
        Object obj = c.newInstance();
        //调用有参构造如何做？
        //第一步：先获取到这个有参构造
        Constructor con1 = c.getDeclaredConstructor(int.class, String.class, boolean.class);
        //第二部：调用构造方法new对象
        Object obj1 = con1.newInstance(110, "曹贼", true);
        System.out.println(obj1);

    }
}
