package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
HashSet集合：无序不可重复
TreeSet集合：无序不可重复，可自动按大小排序
 */
public class SetTest01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Hello");
        set.add("fasxz");
        set.add("sadw");
        set.add("axa");
        set.add("Hello");

        for(String s : set) {
            System.out.println(s);
        }

        Set<String> set2 = new TreeSet<>();
        set2.add("H");
        set2.add("f");
        set2.add("s");
        set2.add("a");
        set2.add("H");

        for(String s : set2) {
            System.out.println(s);
        }
    }
}
