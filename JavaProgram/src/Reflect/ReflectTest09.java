package Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/*
了解内容
 */
public class ReflectTest09 {
    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder s = new StringBuilder();
        Class c = Class.forName("Reflect.UserService");
        //              类的修饰符                        class          类名              {
        s.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");
        //获取类中所有方法
        Method[] methods = c.getDeclaredMethods();
        for(Method method : methods) {
            s.append("\t");
            //              方法的修饰符                          空格          方法返回值类型       空格     方法名            （
            s.append(Modifier.toString(method.getModifiers()) + " " + method.getReturnType() + " " + method.getName() + "(");
            //获取方法的所有参数
            Class[] parameterTypes = method.getParameterTypes();
            for(Class parameterType : parameterTypes) {
                //                  参数类型                        参数名
                s.append(parameterType.getSimpleName() + ",");
            }
            //删除指定下标位置的字符,有参数的方法删除多余逗号
            if(parameterTypes.length > 0) {
                s.deleteCharAt(s.length() - 1);
            }
            /*
            Parameter[] parameters = method.getParameters();
            for(Parameter parameter : parameters) {
                //                  参数类型                        参数名
                s.append(parameter.getType().getSimpleName() + " " + parameter.getName() + " ");
            }
            */
            s.append(")" + "{\n" + "\t" + "}\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
