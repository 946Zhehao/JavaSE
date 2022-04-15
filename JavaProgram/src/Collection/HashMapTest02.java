package Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
    如果一个类的equals方法重写了，hashCode方法必须重写，
    且equals方法返回true时，hashCode方法的返回值必须一样，
    因为equals返回true表示两个对象相同，是在同一个单向链表上比较的，
    而同一个单向链表上的所有结点的哈希值都相同，故hashCode的返回值必须一样

    放在HashMap集合key部分的，以及HashSet集合中的元素需要同时重写equals和hashCode方法
 */
public class HashMapTest02 {
    public static void main(String[] args) {

        Student st1 = new Student("张三");
        Student st2 = new Student("张三");

        //重写hashCode之前的哈希值
        System.out.println(st1.hashCode()); //189568618         (重写之后774920)
        System.out.println(st2.hashCode()); //793589513         (重写之后774920)

        Set<Student> students = new HashSet<>();
        students.add(st1);
        students.add(st2);
        /*
        由于为重写hashCode之前，hashCode方法返回的是内存地址，所以两个元素的哈希值不相同
        转换成的数组下标不同，所以两个相同的元素都被放进了集合中
        而Set集合的特点是无序不可重复
         */
        System.out.println(students.size());    //重写hashCode之前为 2， 之后为 1.
    }
}

class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
