package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*

重点：放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写hashCode和equals方法

HashMap集合：
    1、HashMap集合底层是哈希表
    2、哈希表是一个数组和单向链表的结合体，充分发挥他们各自的优点
    3、同一个链表上所有结点的hash相同，因为它们的数组下标是一样的
    4、任何一个链表上k和k的equals方法肯定返回的是false
    5、HashMap集合的默认初始化容量是16，默认加载因子是0.75
        默认加载因子是当HashMap集合底层数组的容量达到75%时，数组开始扩容
        HashMap集合初始化容量必须是2的倍数，官方推荐的，这是因为达到散列均匀，为了提高HashMap集合的存取效率，所必须的
    6、扩容是原来的2倍
map.put(k, v)实现原理：
    1、先将k，v封装到Node对象中
    2、底层会调用k的hashCode()方法得出hash值，
       然后通过哈希算法，将hash值转换成数组的下标，下标位置上如果没有任何元素，
       就把Node添加到该位置，如果下标对应位置上有链表，此时会用k和链表上每一个结点的k
       进行equals，如果所有的equals都返回false，就把改结点插入到链表的尾端，如果
       其中又一个equals返回了true，这个结点的value就会被覆盖。
map.get(k)实现原理：
       先调用k的hashCode方法得出哈希值，通过哈希算法转换成数组下标，通过数组下标快速
    定位到某个位置上，如果这个位置什么也没有，返回null。如果有链表，那么使用k和链表上
    每个结点的k进行equals，如果所有equals都返回false，则get方法返回null，只要其中
    有一个equals返回true，那么get方法返回这个结点的value。
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //测试HashMap集合key部分的元素特点
        //Integer是key，它的hashCode和equals都重写了
        Map<Integer, String> map = new HashMap<>();
        map.put(111, "zhangsan");
        map.put(223, "lisi");
        map.put(355, "wangwu");
        map.put(499, "zhaoliu");
        map.put(499, "wuhu");       //key重复value会覆盖
        System.out.println(map.size());

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for(Map.Entry<Integer, String> node : set) {
            System.out.println(node.getKey() + "=" + node.getValue());
        }

    }
}
