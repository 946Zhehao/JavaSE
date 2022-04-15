package Collection;

import java.util.*;

/*
ArrayList集合初始化容量是10（底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量10）
底层是Object类型的数组
ArrayList集合的扩容：
    原容量的1.5倍
    由于底层是数组，尽量避免扩容，初始化时尽量选择适当的容量避免扩容
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量10
        List list1 = new ArrayList();
        //指定初始化容量20
        List list2 = new ArrayList(20);

        //将指定元素添加到末尾
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        //另一个构造方法
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(300);
        //通过这个构造方法就可以将HashSet集合转换成List集合
        List list3 = new ArrayList(c);

        //两种遍历方法
        //遍历list集合
        for(int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
        //迭代
        Iterator it = list3.iterator();
        while(it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
     }
}
