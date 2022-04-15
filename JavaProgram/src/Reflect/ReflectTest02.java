package Reflect;
/*
获取class能干什么
 */
public class ReflectTest02 {
    public static void main(String[] args) {

        try {
            //通过反射机制，获取Clas,通过Class来实例化对象
            Class c1 = Class.forName("Reflect.User");
            //这个方法会调用User这个类的无参数构造方法，完成对象的创建
            //重点是：newInstance()调用的是无参构造
            //相对于User u = new User();这种普通的new对象的方法，这种方法比较灵活
            Object o1 = c1.newInstance();
            System.out.println(o1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
