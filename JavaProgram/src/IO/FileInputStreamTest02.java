package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
int read(byte[] b)
    一次最多读取b.length个字节
    减少硬盘和内存的交互，提高程序的执行效率
    往byte[]数组中读
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("D:\\宅\\图片\\生活\\000.txt");
            //开始读，采用byte数组，一次读取多个字节
            byte[] bytes = new byte[5];
            //这个方法的返回值是：读取到的字节数量
            //一个都没读到返回-1
            /*
            int readData = fis.read(bytes);
            System.out.println(readData);   //5,一次读到5个字节
            //将byte数组转换成字符串，不应该全部转换，应该读取到多少个转换多少个，因为读一次数据会覆盖bytes数组的元素，
            //有可能所剩字节不足bytes.length后面的也就不能被覆盖，全部输出的话也就会将之前的重复输出
            //System.out.println(new String(bytes));
            System.out.println(new String(bytes, 0, readData));

            readData = fis.read(bytes);
            System.out.println(readData);   //4
            //将byte数组转换成字符串
            //System.out.println(new String(bytes));
            System.out.println(new String(bytes, 0, readData));
            */

            int readData;
            while((readData  = fis.read(bytes)) != -1) {
                //将读到的字节转换为字符串，读到几个转换几个
                System.out.print(new String(bytes, 0, readData));
            }
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
