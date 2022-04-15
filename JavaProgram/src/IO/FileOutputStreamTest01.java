package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件字节输出流，负责写
从内存到硬盘
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try {
            //注意刚方式创建对象，写时会先清空文件
            //fos = new FileOutputStream("D:\\宅\\图片\\生活\\000.txt");
            //要想在文件末尾写入，使用该构造方法
            fos = new FileOutputStream("D:\\宅\\图片\\生活\\000.txt", true);

            String s = "\n卫生打扫的最新传闻青蛙似的";
            //将字符串转换为byte数组
            byte[] bytes = s.getBytes();
            //将byte数组全部数据写入文件
            fos.write(bytes);
            //将byte数组一部分数据写入文件
            //有乱码情况，不清楚怎么回事
            //fos.write(bytes, 0, 2);
            //写完之后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
