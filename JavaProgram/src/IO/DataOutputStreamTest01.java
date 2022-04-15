package IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
java.io.DataOutputStream:数据专属的流
这个流可以将数据连同数据的类型一并写入文件
注意：这个文件不是普通文本文档（不能用记事本打开）
 */
public class DataOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //创建数据专属的字节输出流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\宅\\图片\\生活\\222.txt"));
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 900L;
        float f = 3.1F;
        double d = 3.14;
        boolean flag = false;
        char c = 'a';
        //写
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(flag);
        dos.writeChar(c);

        //刷新
        dos.flush();
        //关闭
        dos.close();
    }
}
