package ArrayTools;

import java.util.Arrays;

/*
Java 中已经封装好了排序算法，可直接调用
Java 中提供了一个数组工具类： java.util.Arrays
    Arrays是一个工具类，其中有一个 static 的 sort() 方法,可直接使用Arrays.sort()
    所有方法都是静态的
    常用的有两个：二分法查找 binarySearch()，排序 sort()
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 55, 20, 90, 101, 333};
        //排序
        Arrays.sort(arr);
        //遍历输出
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        int temp = Arrays.binarySearch(arr, 90);
        System.out.println("90的数组下标为：" + temp);
    }
}
