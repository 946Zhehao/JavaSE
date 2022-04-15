package IO;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
序列化（Serialize）：java对象存储到文件中，将java对象的状态保存下来的过程（保存硬盘中）
反序列化（DeSerialize）：将硬盘上的数据重新恢复到内存当中，恢复成java对象
 1、java.io.NotSerializableException
    对象不支持序列化异常
 2、参与序列化和反序列化的对象，必须实现Serializable接口
 3、注意：通过源代码发现，Serializable接口只是一个标志接口：
    public interface Serializable {
    }
    这个接口中什么代码都没有
    那么它起到一个什么作用呢？
        起到表示作用，标志的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊待遇，会自动生成一个序列化版本号
 4、若不想让某个属性参与序列化，需要加一个关键字transient，表示游离的，不参与序列化
 5、java语言中靠什么机制区分类？
    第一：首先通过类名进行比对，如果类名不一样，肯定不是同一个类
    第二：如果类名一样，考序列化版本号进行区分
 6、自动生成序列化版本号的缺点
    一旦代码确定之后，不能进行后续的修改，只要一修改，必然会重新编译，此时会生成全新的序列化版本号
    此时java虚拟机会认为这是一个全新的类。
 7、凡是一个类实现了Serializable接口，建议手动提供一个固定不变的版本号
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception {
        Student student = new Student(111, "张三");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));
        //序列化对象
        oos.writeObject(student);
        //刷新
        oos.flush();
        //关闭
        oos.close();
    }
}

class Student implements Serializable {
    //IDEA自动生成序列化版本号
    private static final long serialVersionUID = -7805226589774730486L;
    private int num;
    //transient表示游离的，不参与序列化
    private transient String name;
    //手动编写序列化版本号
    //private static final long serialVersionUID = 1L;

    public Student (int num, String name) {
        this.name = name;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return num + "=" + name;
    }
}