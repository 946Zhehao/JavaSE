package Array;
/*
1、 Java语言中的数组是一种引用数据类型，数组的父类也是Object
2、 数组实际上是一个容器，可以容纳多个元素
3、 可以存储基本数据类型的数据，也可以存储引用数据类型的数据
4、 由于数据是引用数据类型，数组对象也是在堆内存当中
5、 数组当中如果存储的是Java对象的话，实际上存储的是对象的引用，即：内存地址
6、 数组一旦创建，长度不可变
7、 数组分类：一维，二维，三维，多维。。。（一维较多，二维偶尔使用）
8、 数组对象自带Length属性，用来获取数组长度
9、 数组中的元素内存地址是连续的，引用存放的地址是数组首元素的地址
10、 数组的优缺点：
        优点：   查询/查找/检索某个下标上的元素时效率极高，可以说是查询效率最高的一个数据结构
                为什么效率高？
                    一、每一个元素的内存地址在空间存储上是连续的
                    二、每一个数据元素的类型相同，所以占用空间大小一样
                    三、知道第一个元素的内存地址，知道每一个元素占用空间的大小，又知道下标，
                        所以通过一个数学表达式就可以计算出某个下标上元素的内存地址。直接通过内存地址
                        定位元素，所以数组的检索效率是最高的。
                数组中存储100个元素，或100万个元素，查找效率是相同的，
                因为数组中元素查找的时候不会一个一个找，是通过数学表达式计算出来的。（算出一个
                内存地址，直接定位的。）

        缺点：   1、为了保持数组中每个元素的内存地址连续，增加或删除元素使需要移动其他元素（除最后一个元素）
                2、数组不能存储大数据量，因为很难在内存空间中找到一块特别大的连续的内存空间。
11、 定义一个一维数组的语法格式：
        数据类型[] 变量名;
12、 如何初始化一个一维数组
        两种方式：
                静态初始化语法格式：
                        数据类型[] 变量名 = {a, b, c, d};
                动态初始化语法格式：
                        数据类型[] 变量名 = new 数据类型[length];  元素默认值为0或null
13、 当确定数组中存放的具体数据时采用静态初始化，否则采用动态初始化预分配空间。
14、 各数据类型的默认值
        byte            0
        short           0
        int             0
        long            0L
        float           0.0F
        double          0.0
        boolean         false
        char            \u0000
        引用             null

 */
public class Test01 {
    public static void main(String[] args) {
        //静态初始化的方式，初始化数组
        int[] a1 = {100, 2, 30, 4000};

        System.out.println(a1.length);
        for(int i=0; i < a1.length; i++) {
            //System.out.println(a1[i]);
        }
        //System.out.println(a1[0] + ", " + a1[1] + ", " + a1[2] + ", " + a1[a1.length - 1]);

        //动态初始化
        Object[] o1 = new Object[5];
        for(int i=0; i < o1.length; i++) {
            //System.out.println(o1[i]);
        }

        String[] strs = new String[6];
        for(int i=0; i < strs.length; i++) {
            //strs[i] = "x" + i;
        }
        for(int i=0; i < strs.length; i++) {
            //System.out.println(strs[i]);
        }

        //如果传递一个静态数组，可以这样写
        printArray(new int[]{1, 5, 30, 100});
    }

    public static void printArray(int[] a) {
        System.out.println(a.length);
        for(int i=0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
