package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
try..catch中的finally子句
1、在finally中的代码是最后执行的，并且一定会执行，即使try语句块中出现了异常
    finally必须和try一起使用
2、finally语句通常使用在哪些情况？

 */
public class Test04 {
    public static void main(String[] args) {
        //声明位置放在try外面，这样再finally中才可以使用
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("F:\\Program Run\\复试\\2021王道操作系统.pdf");

            String s = null;
            //这里会出现空指针异常，导致后面的代码无法执行
            s.toString();

            //流使用完需要关闭，应为流是占用资源的
            //即使以上程序出现异常，流也必须要关闭
            //放在这里可能管不了
            //fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            //流的关闭凡在这里比较保险
            //finally中的代码一定会执行
            //即使try出现了异常
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("Shut Down!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        System.out.println("Hello World!");
    }
}
