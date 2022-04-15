package Reflect;

import java.lang.reflect.Method;

/*
通过反射机制调用方法
    必须掌握

    反射机制，让代码很具有通用性，可变化的内容都是写到配置文件当中
    将来修改配置文件之后，出啊关键的对象不一样了，调用的方法也不同了
    但是java代码不需要做任何改动
 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Reflect.UserService");
        Object obj = c.newInstance();
        //                                          方法名        参数类型        参数类型     后面两个是可变长度参数
        Method loginMethod = c.getDeclaredMethod("login", String.class, String.class);
        //反射机制中最重要的方法
        /*
        loginMethod是方法
        obj是对象
        "123", "123"是参数
        retValue是返回值
         */
        Object retValue = loginMethod.invoke(obj, "123", "123");
        System.out.println(retValue);
    }
}
