package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
/*

 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        //HashMap的key可以为空
        map.put(null, null);
        System.out.println(map.size());     //1
        System.out.println(map.get(null));  //null
        //key相同 value会被覆盖
        map.put(null, 100);
        System.out.println(map.size());     //1
        System.out.println(map.get(null));  //100

        /*
        Hashtable的初始化容量是11，加载因子是0.75
        扩容是 原容量*2+1
         */
        Map map1 = new Hashtable();
        //Hashtable的key和value都不可以为null会出现空指针异常
        //map1.put(null, "123");
        //map1.put(111, null);
    }
}
