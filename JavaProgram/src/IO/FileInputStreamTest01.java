package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
1、字节输入流，万能的
2、字节的方式，完成输入的操作，完成读的操作（硬盘--->内存）
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        //创建文件字节输入流对象
        FileInputStream fis = null;

        try {
            //绝对路径，若是相对路径一定是从当前路径开始找，IDEA默认的当前路径是工程project的根,F:\JavaProgram
            fis = new FileInputStream("D:\\宅\\图片\\生活\\000.txt");
            //开始读,读完文件末尾，再读就会返回-1，读到的会返回ASCII码
            //read()方法缺点：一次读取一个字节byte，效率较低
            int readData;
            while((readData = fis.read()) != -1) {
                System.out.println(readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    //关闭流
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
