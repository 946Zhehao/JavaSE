package Reflect;
/*
如何获取一个类的父类，已经实现了那些接口
 */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception{
        //获取类String
        Class c = Class.forName("java.lang.String");
        //获取父类
        Class superClass = c.getSuperclass();
        System.out.println(superClass);
        //获取所有接口
        Class[] classes = c.getInterfaces();
        for(Class in : classes) {
            System.out.println(in);
        }
    }
}
