package Collection;

import Extends.Animals;
import Extends.Cat;
import Extends.Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK8之后引入了：自动类型推断机制（钻石表达式）
 */
public class GenericTest02 {
    public static void main(String[] args) {
        //ArrayList<这里的类型会自动推断>，JDK8之后
        //自动类型推断，钻石表达式
        List<Animals> list = new ArrayList<>();

        list.add(new Animals());
        list.add(new Cat());
        list.add(new Dog());

        //迭代
        Iterator<Animals> it = list.iterator();
        while(it.hasNext()) {
            Animals a = it.next();
            a.move();
        }
    }
}
