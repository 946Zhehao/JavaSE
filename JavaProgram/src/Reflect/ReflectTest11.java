package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/*
反编译一个了类的构造方法Constructor
 */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        //获取类
        Class c = Class.forName("Reflect.Vip");
        //类的修饰符
        s.append(Modifier.toString(c.getModifiers()));
        //class
        s.append(" class ");
        //类名
        s.append(c.getSimpleName());
        s.append("{\n");
        //获取所有构造方法
        Constructor[] constructors = c.getDeclaredConstructors();
        for(Constructor constructor : constructors) {
            //tab缩进
            s.append("\t");
            //构造方法的修饰符
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            //构造方法名
            s.append(constructor.getDeclaringClass().getSimpleName());
            s.append("(");
            //所有参数类型
            Parameter[] parameters = constructor.getParameters();
            for(Parameter parameter : parameters) {
                s.append(parameter.getType().getSimpleName());
                s.append(",");
            }
            //删除多余逗号
            if(parameters.length > 0){
                s.deleteCharAt(s.length() - 1);
            }
            s.append(")");
            s.append("{\n");
            s.append("\t");
            s.append("}\n");
        }


        s.append("}");
        System.out.println(s);
    }
}
