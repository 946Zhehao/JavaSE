package IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/*
带有缓冲的字符输出流
 */
public class BufferWriterTest01 {
    public static void main(String[] args) throws Exception{
        //带有缓冲区的字符输出流
        //BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\宅\\图片\\生活\\222.txt", true));
        //使用字节流，转换成字符流，再传入
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\宅\\图片\\生活\\222.txt", true)));
        //开始写
        bw.write("芜湖");
        bw.write("\n");
        bw.write("zxnbv");
        //刷新
        bw.flush();
        //关闭
        bw.close();
    }
}
