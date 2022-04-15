package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
常用方法：
    int available():返回流当中剩余的没有读到的字节数量
    long skip(long n):跳过几个字节不读
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("D:\\宅\\图片\\生活\\000.txt");
            //返回流当中剩余的没有读到的字节数量
            System.out.println("流当中剩余的没有读到的字节数量" + fis.available());
            //跳过几个字节不读
            fis.skip(10);
            //读
            byte[] bytes = new byte[fis.available()];
            int readData = fis.read(bytes);
            System.out.println(new String(bytes, 0, readData));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
