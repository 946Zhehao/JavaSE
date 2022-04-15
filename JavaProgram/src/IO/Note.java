package IO;
/*
IO流
    I:input
    O:output
分类：
    一、按照流的方式进行分类：
        以内存作为参照物
            往内存中去，叫做输入（Input）， 或 读（Read）
            从内存中出来，叫做输出（Output），或 写（Write）
    二、按照读取数据方式不同进行分类
        1、有的流是按照字节的方式读取数据，一次读取1个字节byte，等同于依次读取8个二进制位。
        这种流是万能的，什么类型的文件都可以读取。
        2、有的流是按照字符的方式读取数据的，一次读取一个字符，这种流是为了读取普通文本文件而存在的，
        只能读取纯文本文件。
综上所述：流的分类
    输入流，输出流，
    字节流，字符流

java IO流的四大家族
    四大家族的首领：
    java.io.InputStream 字节输入流
    java.io.OutputStream 字节输出流
    java.io.Reader 字符输入流
    java.io.Writer 字符输出流
    四大家族的首领都是抽象类
    注意：java中只要“类名”以Stream结尾的都是字节流，以“Reader/Writer”结尾的都是字符流

    所有的流都实现了：
        java.io.Closeable接口，都是可关闭的，都有close()方法。
        流毕竟是一个管道，这个是内存和硬盘之间的通道，用完之后一定要关闭。
        不然会耗费很多资源
    所有的输出流都实现了：
        java.io.Flushable，都是可刷新的，都有flush()方法。
        养成一个好习惯，输出流在最终输出之后，一定要flush()刷新一下，
        这个刷新表示将管道当中剩余为输出的数据强行输出完（清空管道！）
        刷新的作用就是清空管道
        注意：如果没有flush()可能会导致丢失数据

java.io包下需要掌握的流有16个：
    文件专属：
    java.io.FileInputStream
    java.io.FileOutputStream
    java.io.Reader
    java.io.Writer

    转换流：（将字节流转换成字符流）
    java.io.InputStreamReader
    java.io.OutputStreamWriter

    缓冲流专属：
    java.io.BufferedReader
    java.io.BufferedWriter
    java.io.BufferedInputStream
    java.io.BufferedOutputStream

    数据流专属
    java.io.DataInputStream
    java.io.DataOutputStream

    标准输出流：
    java.io.ObjectInputStream
    java.io.ObjectOutputStream

    对象专属流：
    java.io.PrintWriter
    java.io.PrintStream
 */
public class Note {

}
