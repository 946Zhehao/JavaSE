package Collection;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet集合无法对自定义类型排序，因为没有指定Person对象的比较规则
 需要继承Comparable接口，并实现compareTo()方法指定比较规则
 */
public class TreeMapTest02 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        Person p1 = new Person(11);
        Person p2 = new Person(2);
        Person p3 = new Person(32);
        Person p4 = new Person(4);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for(Person p : set) {
            System.out.println(p);
        }
    }
}

class Person implements Comparable<Person> {
    int age;

    public Person(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person age = " + age;
    }

    public int compareTo(Person person) {
        if(this.age > person.age) {
            return 1;
        } else if (this.age < person.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
