package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
数据字节输入流
DataOutputStream写的文件，只能使用DataInputStream去读，并且读的顺序需要和写的顺序一样
 */
public class DataInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\\\宅\\\\图片\\\\生活\\\\222.txt"));
        //读
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean flag = dis.readBoolean();
        char c = dis.readChar();
        //输出
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("boolean = " + flag);
        System.out.println("char = " + c);

        //关闭
        dis.close();
    }
}
