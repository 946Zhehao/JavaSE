package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
通过反射机制，反编译一个类的属性Field
不开发反编译器的，不需要掌握
 */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception {
        //创建这个为了拼接字符串
        StringBuilder s = new StringBuilder();
        //获取类
        Class c = Class.forName("Reflect.Student");
        s.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");

        Field[] fields = c.getDeclaredFields();
        for(Field field : fields) {
            //tab
            s.append("\t");
            //获取属性的修饰符
            s.append(Modifier.toString(field.getModifiers()));
            s.append(" ");
            //获取属性的类型
            s.append(field.getType().getSimpleName());
            s.append(" ");
            //获取属性名
            s.append(field.getName());
            s.append(";\n");
        }

        s.append("}");
        System.out.println(s);
    }
}
