package Reflect;

import java.lang.reflect.Field;

/*
必须掌握：
    怎么通过反射机制访问一个java对象的属性？
        给属性赋值set
        获取属性的值get
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception {
        //获取类
        Class c = Class.forName("Reflect.Student");
        //创建Student对象
        Object obj = c.newInstance();
        //获取Student类中的num属性
        Field noField = c.getDeclaredField("num");
        //给obj对象（Student对象）的num属性赋值
        noField.set(obj, 121);
        //获取属性的值
        System.out.println(noField.get(obj));

        //访问私有的属性，必须打破封装，否则不能访问
        Field nameField = c.getDeclaredField("name");
        //打破封装      缺点：可能会给不法分子留下机会
        //这样设置完之后，在外部以是可以访问private的
        nameField.setAccessible(true);
        //给name属性赋值
        nameField.set(obj, "皇叔");
        System.out.println(nameField.get(obj));

    }
}
