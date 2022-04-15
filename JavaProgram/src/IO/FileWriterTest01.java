package IO;

import java.io.FileWriter;
import java.io.IOException;

/*
字符输出流
 */
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            //创建字符输出流对象
            //使用该构造方法和FileOutputStream一样会先清空
            //fw = new FileWriter("D:\\宅\\图片\\生活\\000.txt");
            //若要追加使用该构造方法
            fw = new FileWriter("D:\\宅\\图片\\生活\\000.txt", true);
            char[] chars = {'起', '飞', '!'};
            //将char数组的数据全部写入
            fw.write(chars);
            //将char数组的部分数据写入
            fw.write(chars, 1, 1);
            //可以直接写入String类型数据
            fw.write("ddxxaa");
            //输出流不要忘记刷新
            fw.flush();
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
        }
    }
}
