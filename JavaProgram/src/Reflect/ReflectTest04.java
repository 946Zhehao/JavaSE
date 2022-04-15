package Reflect;
/*
如果只希望一个类的静态代码块执行，其他代码一律不执行，
可以使用：
    Class.forNmae("完整类名");
    这个方法会导致类加载，类加载时，静态代码块执行

提示：
    后面JDBC技术时还需要
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Reflect.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
