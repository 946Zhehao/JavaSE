package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
一次序列化多个对象，将对象放到集合中，序列化集合
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "张三"));
        list.add(new Student(2, "李四"));
        list.add(new Student(3, "王五"));
        list.add(new Student(4, "赵六"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        //序列化集合
        oos.writeObject(list);
        //反序列化
        Object obj = ois.readObject();
        //System.out.println(obj);
        if(obj instanceof List) {
            List<Student> l = (List<Student>) obj;
            for(Student o : l) {
                System.out.println(o);
            }
        }
        //刷新
        oos.flush();
        //关闭
        oos.close();
    }
}
