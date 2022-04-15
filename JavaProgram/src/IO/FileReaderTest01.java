package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
文件字符输入流，只能读取普通文本，读取文本内容时，方便快捷
操作和FileInputStream差不多，比葫芦画瓢
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            //创建一个字符输入流对象
            fr = new FileReader("D:\\宅\\图片\\生活\\000.txt");
            //指定一次读取的字符数量
            char[] chars = new char[5];
            int readCount = 0;
            //开始读
            while((readCount = fr.read(chars)) != -1) {
                System.out.print(new String(chars, 0, readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
