package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
反射Student类当中的所有Field
 */
public class ReflectTest05 {
    public static void main(String[] args) throws Exception {
        //获取整个类
        Class c = Class.forName("Reflect.Student");
        //获取类中所有的public修饰的Field
        Field[] fields = c.getFields();
        System.out.println(fields.length);  //测试数组中只有1个Field
        //取出这个Field
        Field f = fields[0];
        //获取属性的名字
        String fieldName = f.getName();
        System.out.println(fieldName);

        //获取所有的Field
        Field[] fs = c.getDeclaredFields();
        System.out.println(fs.length);      //4

        for(Field field : fs) {
            //获取属性的修饰符
            int i = field.getModifiers();   //返回的修饰符是一个数字，每个数字是修饰符的代号
            //将代号转换为“字符串”
            String modifier = Modifier.toString(i);
            System.out.println(modifier);
            //获取属性的类型
            Class fieldType = field.getType();
            System.out.println(fieldType.getName());
            //获取属性的名字
            System.out.println(field.getName());

        }

    }
}

class Student {
    //Field翻译为字段，其实就是属性/成员
    public int num;
    private String name;
    protected  int age;
    boolean sex;
}
