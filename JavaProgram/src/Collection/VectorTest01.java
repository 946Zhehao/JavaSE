package Collection;

import java.util.*;

/*
Vector:
    底层也是数组
    初始容量10
    扩容之后是原来容量的2倍
    所有方法都是线程同步的，都带有synchronized关键字，效率较低，使用较少
    怎么将一个线程不安全的ArrayList集合转换成线程安全的： 使用集合工具类
        java.util.Collections   是集合工具类
        java.util.Collection    是集合接口
 */
public class VectorTest01 {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);

        Iterator it = vector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        List list = new ArrayList();
        //变成线程安全的
        Collections.synchronizedList(list);
        list.add(30);
        list.add(20);
        list.add(10);

    }
}
