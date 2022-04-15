package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*

 */
public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception {
        //字节流不是Reader
        FileInputStream fis = new FileInputStream("D:\\宅\\图片\\生活\\111.txt");
        //通过转换流转换（InputStreamReader将字节流转换成字符流）
        //fis是节点流,isr是包装流
        //字符流是Reader
        InputStreamReader isr = new InputStreamReader(fis);
        //isr是节点流，br是包装流
        BufferedReader br = new BufferedReader(isr);
        //开始读
        String s;
        while((s = br.readLine()) != null) {
            //读一行
            System.out.println(s);
        }

        //关闭流
        br.close();
    }
}
