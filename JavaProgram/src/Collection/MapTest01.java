package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
Map接口常用方法
    Map集合以key和value的方式存储数据
    key和value都是引用数据类型
    -------------------------------
    V put(K key, V value)   向Map集合中添加键值对
    V get(Object key)       通过key获取value
    void clear()            清空Map集合
    boolean containsKey(Object key) 判断Map中是否包含某个key
    boolean containsValue(Object value) 判断Map中是否包含某个value
    boolean isEmpty()       判断Map集合中所有元素个数是否为0
    Set<K> keySet()         获取Map集合所有的key

    V remove(Object key)    通过key删除键值对
    int size()              获取键值对的个数
    Collection<V> values()  获取Map集合中所有的value，返回一个Collection
    Set<Map.Entry<K, V>> entrySet() 将Map集合转换成Set集合
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //添加键值对
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");
        //通过key获取value
        String s = map.get(2);
        System.out.println(s);  //lisi
        //获取键值对的数量
        System.out.println("键值对的数量是：" + map.size());    //4
        //通过key删除键值对
        map.remove(3);
        System.out.println("键值对的数量是：" + map.size());    //3
        //判断是否包含某个key
        boolean flag = map.containsKey(1);
        System.out.println(flag);   //true
        //判断是否包含某个value
        flag = map.containsValue("zhaoliu");
        System.out.println(flag);   //true
        //获取所有的value
        Collection<String> values = map.values();
        for(String str : values) {
            System.out.println(str);
        }
        //清空Map集合
        map.clear();
        System.out.println("键值对的数量是：" + map.size());    //0
        //判断是否为空
        System.out.println(map.isEmpty());  //true

    }
}
