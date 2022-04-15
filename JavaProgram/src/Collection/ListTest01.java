package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
List接口常用方法
    1、List集合存储元素特点：有序可重复
        有序：集合中元素有下标
        可重复：可以存储相同的元素
    2、List集合特有的方法（除了父接口Collection中继承的方法）：
        常用的：
            void add(int index, Object element)
            Object get(int index)
            int LastIndexOf(Object o)
            Object remove(int index)
            Object set(int index, Object element)
 */
public class ListTest01 {
    public static void main(String[] args) {
        //创建list类型的集合
        List list = new ArrayList();
        //添加元素,默认向集合末尾添加
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");
        //在集合指定下标位置插入元素，该方法对于ArrayList效率较低，使用不多
        list.add(1, "King");
        //根据下标取元素
        Object obj = list.get(1);
        System.out.println(obj);    //King
        //获取指定对象第一次出现处的索引
        int index = list.indexOf("D");
        System.out.println(index);  // 4  (不是下标)
        //获取指定对象最后一次出现处的索引
        index = list.lastIndexOf("D");
        System.out.println(index);  // 5  (不是下标)
        //删除指定下标位置的元素
        list.remove(3);
        //修改指定下标位置的元素
        list.set(2, "Attack");

        //迭代
        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
