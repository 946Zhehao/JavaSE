package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历
 第二种方法效率较高，因为第二种方法是将key和value放在一起了，key和value作为node的属性值
而第一种方法需要通过key获取value
 */
public class MapTest02 {
    public static void main(String[] args) {
        //第一种：获取所有的key，遍历value
        Map<Integer, String> map = new HashMap<>();
        //添加键值对
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");
        //获取所有的key集合，是一个Set集合
        Set<Integer> keys = map.keySet();
        //遍历key，通过key获取value
        //获取迭代器
        Iterator<Integer> it = keys.iterator();
        //迭代
        while (it.hasNext()) {
            Integer key = it.next();
            String str = map.get(key);
            System.out.println(key + "=" + str);
        }

        System.out.println("----------------------------------------------------------");

        //第二种：Set<Map.Entry<K, V>> entrySet() 将Map集合转换成Set集合
        //第二种方式效率较高，处理大数据量时尽量使用该方法
        //以上这个方法是把Map集合直接全部转换成Set集合
        //Set集合中元素的类型是：Map.Entry
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        //遍历set集合，每次取出一个Node
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        while(it2.hasNext()) {
            Map.Entry<Integer, String> node = it2.next();
            //Integer key = node.getKey();
            //String value = node.getValue();
            //System.out.println(key + "=" + value);
            //以上三行输出结果和下面一行相同，说明该类重写了toString()方法
            System.out.println(node);
        }
        //foreach
        for(Map.Entry<Integer, String> node : set) {
            System.out.println(node.getKey() + "=" + node.getValue());
        }
    }
}
