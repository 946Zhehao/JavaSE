package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
使用字符输入输出流，复制文本文件
FileReader 和 FileWriter 联用
 */
public class FileCopytTest02 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            //创建字符输入流对象
            fr = new FileReader("D:\\宅\\图片\\生活\\000.txt");
            //创建字符输出流对象
            fw = new FileWriter("D:\\宅\\图片\\生活\\111.txt");
            //一次读10个字符
            char[] chars = new char[1024 * 512];    //1MB
            int readCount = 0;
            //开始读，边读边写
            while((readCount = fr.read(chars)) != -1) {
                //读多少，写多少
                fw.write(chars, 0, readCount);
            }
            //输出流不要忘记刷新
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
