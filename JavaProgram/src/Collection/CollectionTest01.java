package Collection;
/*
1、什么是集合？有什么用？
    数组其实就是一个集合，集合实际上就是一个容器，可以来容纳其他类型的数据
    集合是一个载体，可以一次容纳多个对象，在开发中使用较多
        在实际开发中，假设链接数据库，数据库当中有10条记录，那么假设把这10条记录查询出来，
        在java程序中会将10条数据封装成10个java对象，然后将10个java对象放到某个集合中，
        将集合传到前端，然后遍历集合，将一个数据一个数据展现出来
2、集合不能直接存储基本数据类型，另外集合也不能直接存储java对象，存储的都是java对象的内存地址（引用）
    list.add(10);   自动装箱Integer
    集合在java中本身是一个容器，一个对象
    集合中任何时候存储的都是“引用”
3、在java中每一个不同的集合，底层会对应不同的数据结构。网不通的集合中存储元素，等于数据放到了不同的数据结构中。
    数据结构有：数组，二叉树，链表，哈希表等
4、所有的集合类和集合接口都在java.util包下
5、java中集合分为两大类
    一类是单个方式存储元素
        单个方式存储元素，这一类集合中超级父接口：java.util.Collection;
    一类是以键值对儿的方式存储元素
        以键值对的方式存储元素，这一类集合中超级父接口：java.util.Map;

 */

import java.util.ArrayList;
import java.util.Collection;

/*
        java.util.Collection接口中常用的方法
        1、Collection中存放的元素
            没有使用泛型之前，Collection中可以存储Object的所有子类型
            使用了泛型之后，只能存储某个具体的类型
        2、Collection中常用的方法
            boolean add(Object e)   向集合中添加元素
            int size()  获取集合中的元素个数
            void clear() 清空集合
            boolean contains(Object o) 判断当前集合中是否包含元素o，包含返回true，反之false
            boolean remove(Object o)  删除集合中某个元素
            boolean isEmpty();  判断集合中的元素个数是否为0
            Object[] toArray()  将集合转换成数组
*/
public class CollectionTest01 {
    public static void main(String[] args) {
        //多态，创建一个集合对象，由于Collection是接口，所以间接使用子类ArrayList的对象
        Collection c = new ArrayList();
        //常用方法
        //添加元素
        c.add(1200);    //自动装箱，参数1200实际上是一个Integer对象，Integer x = new Integer(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(true);

        //获取集合中的元素个数
        System.out.println("集合中元素的个数" + c.size());
        //清空集合
        c.clear();
        System.out.println("集合中元素的个数" + c.size());
        //判断集合是否为空，（元素个数是否为0）
        System.out.println(c.isEmpty());
        //添加元素
        c.add("H");
        c.add("A");
        c.add("X");
        c.add("C");
        c.add("V");
        //判断集合中是否包含
        boolean flag = c.contains("X");
        System.out.println(flag);
        //获取集合中的元素个数
        System.out.println("集合中元素的个数" + c.size());
        //删除集合中某个元素
        c.remove("V");
        //获取集合中的元素个数
        System.out.println("集合中元素的个数" + c.size());
        //判断集合是否为空，（元素个数是否为0）
        System.out.println(c.isEmpty());
        //将集合转换为数组  使用不多
        Object[] objs = c.toArray();
        for(int i=0; i<objs.length; i++) {
            Object o = objs[i];
            System.out.println(o);
        }
        /*
        remove()方法注意
            底层和contain()方法一样调用equals方法比较，由于String类重写的equals方法
            s1和s2由equals方法判断是相同的
            故对不在集合中的s2进行删除操作，会将集合中的s1删除
        存放在集合中的元素需要重写equals方法
         */
        String s1 = new String("Hello");
        c.add(s1);
        System.out.println(c.size());   //5
        String s2 = new String("Hello");
        c.remove(s2);
        System.out.println(c.size());   //4
    }
}
