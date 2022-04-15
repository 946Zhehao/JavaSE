package Collection;

import java.util.TreeSet;

/*
1、TreeSet集合底层是一个TreeMap
2、TreeMap集合底层是一个二叉树
3、放到TreeSet集合中的元素，等同于放到了TreeMap集合的key部分
4、TreeSet集合中的元素，无序不可重复，但可以按照元素的大小顺序自动排序
称为：可排序集合
 */
public class TreeMapTest01 {
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<String> ts = new TreeSet<>();
        //添加
        ts.add("1");
        ts.add("2");
        ts.add("a");
        ts.add("4");
        ts.add("A");
        ts.add("b");
        //遍历
        for(String s : ts) {
            System.out.println(s);
        }
    }
}
