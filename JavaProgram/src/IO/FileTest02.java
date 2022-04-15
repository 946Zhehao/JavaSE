package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
常用方法
 */
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("D:\\宅\\图片\\生活\\222.txt");
        //获取文件名
        System.out.println("文件名:" + f1.getName());      //文件名:222.txt
        //判断是否是一个目录
        System.out.println(f1.isDirectory());       //false
        //判断是否是一个文件
        System.out.println(f1.isFile());        //true
        //获取文件最后一次修改时间
        long l = f1.lastModified(); //毫秒,从1970年开始到现在的总毫秒数
        Date time = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);        //2021-02-14 13:37:56 852

        //获取文件大小
        System.out.println(f1.length());    //30个字节

        //获取当前目录下所有的子文件
        //File[] listFiles()
        File f2 = new File("D:\\宅\\图片\\生活");
        File[] files = f2.listFiles();
        for(File file : files) {
            System.out.println(file.getName());
        }
    }
}
