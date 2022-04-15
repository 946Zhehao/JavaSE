package Array;
/*
数组扩容：先创建一个大容量数组，再将小容量数组中的数据一个一个拷贝到大数组中
数组扩容效率很低，尽量一开始就将数组容量设计合适
 */
public class Test04 {
    public static void main(String[] args) {
        //Java中的数组如何拷贝
        //                      拷贝源      源起始下标      拷贝目标    目标起始下标       长度
        //System.arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);
        //拷贝源：从哪个数组拷贝
        //拷贝目标：拷贝到哪个数组
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = new int[10];
        //将数组 a1 从下标为 1 的位置开始拷贝到数组 a2 从下标为 3 的位置开始，拷贝长度为2
        //System.arraycopy(a1, 1, a2, 3, 2);
        System.arraycopy(a1, 0, a2, 2, a1.length);
        for (int i=0; i<a2.length; i++) {
            System.out.println(a2[i]);
        }
    }
}
