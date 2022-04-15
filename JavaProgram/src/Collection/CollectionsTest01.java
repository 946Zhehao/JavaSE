package Collection;

import java.util.*;

/*
Collections工具类
 */
public class CollectionsTest01 {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();
        //变成线程安全的
        Collections.synchronizedList(list);

        list.add("abf");
        list.add("vhj");
        list.add("ewq");
        list.add("fds");
        list.add("szc");
        //排序
        Collections.sort(list);
        //遍历
        for(String s : list) {
            System.out.println(s);
        }
        //--------------------------------------------------
        //如果集合元素是对象，需要该对象的类继承并实现Comparable接口
        List<HeiHei> list1 = new ArrayList<>();

        list1.add(new HeiHei(111));
        list1.add(new HeiHei(233));
        list1.add(new HeiHei(132));
        //排序
        Collections.sort(list1);
        //或者编写一个比较器,和集合一起传入
        /*
        Collections.sort(list1, new Comparator<HeiHei>() {
            @Override
            public int compare(HeiHei o1, HeiHei o2) {
                return o1.age - o2.age;
            }
        });
         */

        for(HeiHei hh : list1) {
            System.out.println(hh);
        }

        //----------------------------------------------------------------------------
        Set<String> set = new HashSet<>();
        set.add("ads");
        set.add("qwe");
        set.add("dfh");
        set.add("xzc");
        //对set集合进行排序，需要将set集合转换为list才能传入Collections.sort();
        List<String> list2 = new ArrayList(set);
        Collections.sort(list2);

        for(String s : list2) {
            System.out.println(s);
        }
    }
}

class HeiHei implements Comparable<HeiHei> {
    int age;
    public HeiHei(int age) {
        this.age = age;
    }

    public String toString() {
        return "HH = " + age;
    }

    @Override
    public int compareTo(HeiHei o) {
        return this.age - o.age;
    }
}