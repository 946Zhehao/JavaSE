package IO;

import java.io.File;
import java.io.IOException;

/*
File的父类是Object，和四大家族无关，不能完成文件的读和写
1、File对象代表文件和目录路径名的表示形式
    D:\宅\图片\生活\000.txt  这是一个File对象
    D:\宅\图片\生活          这也是一个File对象
    有可能对应的是目录，也可能是文件
2、需要掌握的方法
 */
public class FileTest01 {
    public static void main(String[] args) {
        //创建一个File对象
        File f1 = new File("D:\\宅\\图片\\生活\\123");
        //判断是否存在
        System.out.println(f1.exists());
        System.out.println(f1.getAbsolutePath());
        //如果不存在，以文件的形式创造出来
        /*
        if( !f1.exists() ) {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         */
        //以目录的形式创造出来
        /*
        if( !f1.exists() ) {
            f1.mkdir();
        }
         */

        /*
        //多重目录的形式创建
        File f2 = new File("D:\\宅\\图片\\生活\\123\\222\\333\\444");
        if(!f2.exists()) {
            f2.mkdirs();
        }
        */

        //获取文件的父路径
        String parentPath = f1.getParent();
        System.out.println(parentPath);
        //以对象的形式返回文件的父亲
        File parentFile = f1.getParentFile();
        //获取绝对路径getAbsolutePath()
        System.out.println("获取绝对路径" + parentFile.getAbsolutePath());
    }
}
