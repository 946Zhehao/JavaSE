package Collection;

import Extends.Animals;
import Extends.Cat;
import Extends.Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK5.0之后推出的新特性：泛型
泛型只在编译阶段起作用，只是给编译器参考的。（运行阶段没用）
好处：
    1、集合中存储的元素类型统一了
    2、从集合中取出的元素类型是泛型指定的类型，不需要再进行大量的向下转型
缺点：
    1、导致集合中存储的元素缺乏多样性
 */
public class GenericTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        Cat c = new Cat();
        Dog d = new Dog();
        //向集合中添加元素
        list.add(c);
        list.add(d);

        Iterator it = list.iterator();
        while(it.hasNext()) {
            //迭代器取出的都是Object类型
            Object o = it.next();
            //向下转型
            if( o instanceof Animals) {
                Animals as = (Animals) o;
                as.move();
            }
        }

        //使用泛型机制
        //使用泛型List<Animals>之后，表示集合中只允许存储Animals类型的数据
        List<Animals> myList = new ArrayList<Animals>();
        myList.add(c);
        myList.add(d);
        //获取迭代器，这个迭代器表示迭代的是Animal类型
        Iterator<Animals> it2 = myList.iterator();
        while(it2.hasNext()) {
            //此时从迭代器中取出来的都是Animals类型，不用再向下转型
            Animals a = it2.next();
            a.move();
        }
    }
}
