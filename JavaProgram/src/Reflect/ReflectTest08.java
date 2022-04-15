package Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/*
了解内容
    反射Method
 */
public class ReflectTest08 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取类
        Class c = Class.forName("Reflect.UserService");
        //获取UserService类中的所有方法（包括私有）
        Method[] methods = c.getDeclaredMethods();

        for(Method method : methods) {
            //获取方法名
            String s = method.getName();
            System.out.println(s);
            //获取方法返回值类型
            s = method.getReturnType().getSimpleName();
            System.out.println(s);
            //获取修饰符列表
            System.out.println(Modifier.toString(method.getModifiers()));
            //获取参数类型
            Class[] parameterTypes = method.getParameterTypes();
            for(Class parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}
