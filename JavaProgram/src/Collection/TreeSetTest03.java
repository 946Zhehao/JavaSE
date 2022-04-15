package Collection;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet集合中元素可排序的第二种方式：实现比较器接口
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        //new集合对象时需要传一个比较器对象才能使用自己编写的比较器

        TreeSet<WuGui> set  = new TreeSet<>(new WuGuiComparator());
        /*
        可以使用匿名内部类
        TreeSet<WuGui> set = new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.age - o2.age;
            }
        });

         */

        set.add(new WuGui(33));
        set.add(new WuGui(42));
        set.add(new WuGui(31));
        set.add(new WuGui(32));
        set.add(new WuGui(42));

        //遍历
        for(WuGui wg : set) {
            System.out.println(wg);
        }

    }
}

class WuGui{
    int age;

    public WuGui(int age) {
        this.age = age;
    }

    public String toString() {
        return "乌龟 = " + age;
    }
}

//单独编写一个比较器
//比较器实现java.util.Comparator接口（Comparable是java.lang包下的；Comparator是java.util包下的）
class WuGuiComparator implements Comparator<WuGui> {

    @Override
    public int compare(WuGui o1, WuGui o2) {
        return o1.age - o2.age;
    }
}
