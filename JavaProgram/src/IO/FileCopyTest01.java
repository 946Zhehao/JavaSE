package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件复制：
    FileInputStream 和 FileOutputStream 联用
 */
public class FileCopyTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //创建字节输入流对象
            fis = new FileInputStream("D:\\宅\\图片\\生活\\CHESHOU.jpg");
            //创建字节输出流对象
            fos = new FileOutputStream("D:\\宅\\图片\\生活\\起飞.jpg");
            //创建一个容量为1M的byte数组,一次最多拷贝1MB
            byte[] bytes = new byte[1024 * 1024];
            int readCount;
            //开始读，边读边写
            while((readCount = fis.read(bytes)) != -1) {
                //读多少写多少
                fos.write(bytes, 0, readCount);
            }
            //不要忘记刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分开try
            //若一起try，可能导致一个出现异常，另一个流就不能关闭了
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
