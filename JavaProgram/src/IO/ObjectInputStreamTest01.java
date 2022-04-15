package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
反序列化
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        //反序列化
        Object obj = ois.readObject();
        System.out.println(obj);
        //关闭
        ois.close();
    }
}
