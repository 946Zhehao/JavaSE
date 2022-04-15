package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*
带缓冲区的字符输入流
使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组，自带缓冲
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\宅\\图片\\生活\\111.txt");
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
        //外部负责包装的这个流叫做：包装流，还有一个名字叫做：处理流
        //FileReader就是一个节点流，BufferedReader就是包装流/处理流
        //只能传入抽象类Reader，FileInputStream不是Reader，需要用转换流转换
        BufferedReader br = new BufferedReader(fr);
        //读一行,readLine()方法读不到信息时，会返回null
        String s;
        while((s = br.readLine()) != null) {
            //readLine()读完一行不自带换行符
            System.out.println(s);
        }
        //关闭流,包装流关闭时，会自动关闭节点流
        //故对于包装流来说，只需关闭最外层流
        br.close();
    }
}
