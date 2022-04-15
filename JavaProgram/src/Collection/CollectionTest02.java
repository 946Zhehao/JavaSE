package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
关于集合遍历/迭代专题（重点）
在所有Collection及其子类中使用
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //添加元素
        c.add("Hello");
        c.add("Fuck");
        c.add("exchange");
        c.add("tree");
        c.add("down");
        //对集合Collection进行遍历/迭代
        //第一步：获取集合对象的迭代器对象Iterator
        //集合结构发生改变，迭代器必须重新获取（获取了迭代器，之后又添加或删除了元素，必须重新获取迭代器）
        //否则使用迭代器方法时会出现java.util.ConcurrentModificationException异常
        Iterator it = c.iterator();
        //c.add(100);
        //第二步：通过以上获取的迭代器对象开始迭代/遍历集合
        /*
        以下两个方法是迭代器对象Iterator中的方法
        boolean hasNext()   如果仍有元素可以迭代，则返回true
        Object next()   返回迭代的下一个元素(让迭代器前进一位，并将指向的元素返回)（迭代器最初不指向任何元素，所指位置的下一个元素为第一个元素）
         */

        while(it.hasNext()) {
            System.out.println(it.next());
            //由于迭代器指针一开始不指向任何元素，所有应该先使用next方法使指针移动到第一个元素位置，再使用remove方法，否则会出现java.lang.IllegalStateException异常
            it.remove();    //删除迭代器当前指向元素，会同时从迭代器和集合中删除
            //c.remove("tree");   迭代过程中不能直接将集合中的元素删除
        }
        System.out.println(c.size());
    }
}
