package IO;

import java.io.*;

/*
作业：目录拷贝
 */
public class Homework {
    public static void main(String[] args) {
        //              起点目录                终点目录
        copyDirectory("D:\\宅\\图片\\生活", "D:\\宅\\图片\\JAVA目录拷贝作业练习\\生活");
        System.out.println("所有文件已拷贝完成！");
    }

    //拷贝目录
    public static void copyDirectory(String startPath, String endPath) {
        //创建一个File对象,目录指向拷贝对象
        File fStart = new File(startPath);
        //创建一个File对象，目录指向终点目录
        File fEnd = new File(endPath);
        //判断终点目录是否存在，不存在则创建
        if(!fEnd.exists()) {
            fEnd.mkdirs();
            System.out.println("终点目录创建成功！");
        }
        //获取该目录下所有的子文件名
        File[] files = fStart.listFiles();
        //遍历
        for(File file : files) {
            //如果是一个文件，则创建文件
            //如果是一个文件夹，深入文件夹内部，将文件夹内所有文件全部拷贝
            if(file.isFile()) {
                createFile(endPath, file);
            } else if(file.isDirectory()) {
                createDirectory(endPath, file);
                copyDirectory(startPath + "\\" + file.getName(), endPath + "\\" + file.getName());
            }
        }
    }

    //创建文件
    public static void createFile(String endPath, File file) {
        //创建字节输入流对象
        FileInputStream fis = null;
        //创建字节输出流对象
        FileOutputStream fos = null;

        //创建一个File对象，指向终点目录的拷贝文件
        File f1 = new File(endPath  + "\\" + file.getName());
        //如果终点目录不存在该文件，则创建一个同名文件
        if(!f1.exists()) {
            try {
            fis = new FileInputStream("D:\\宅\\图片\\生活\\" + file.getName());
            fos = new FileOutputStream(endPath + "\\" + file.getName());
            //指定一次读入的容量
            byte[] bytes = new byte[1024 * 1024];   //1MB
            int readCount = 0;
            //边读边写
            while((readCount = fis.read(bytes)) != -1) {
                //读多少写多少
                fos.write(bytes, 0, readCount);
            }
            //刷新
            fos.flush();
            System.out.println("文件" + file.getName() + "已创建！");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //关闭流
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("文件" + file.getName() + "已存在！");
        }
    }

    //创建目录
    public static void createDirectory(String endPath, File file) {
        //指定创建文件夹的目录
        File f1 = new File(endPath + "\\" + file.getName());
        if(!f1.exists()) {
            f1.mkdir();
            System.out.println("文件夹" + file.getName() + "已创建！");
        } else {
            System.out.println("文件夹" + file.getName() + "已存在！");
        }
    }
}
