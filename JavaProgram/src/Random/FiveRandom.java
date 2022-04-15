package Random;

import java.util.Random;

/*
生成五个不重复的随机数

可以先将数组排序，再用二分法查找判断数组中是否已存在  视频P626中的方法
 */
public class FiveRandom {
    public static void main(String[] args) {
        //创建一个长度为5的数组对象，默认值为0
        int[] array = new int[5];
        //创建随机数对象
        Random random = new Random();
        //i用来标记数组最后一个有效值的下标
        int i = 0;
        //num用来临时存放随机数
        int num;
        do{
            //生产随机数范围在0-10
            num = random.nextInt(11);
            //判断数组中是否有和num相同的值
            for(int x=0; x<=i; x++) {
                //若存在，重新生成随机数，并重新与数组中的有效值比较
                if(array[x] == num) {
                    //重新生成随机数
                    num = random.nextInt(11);
                    System.out.println("筛选掉的数值：" + num);
                    //将比较位置重置到数组首元素
                    x=0;
                }
            }
            //若数组中不存在与num相同值的元素，将num放入数组
            array[i] = num;
        }while((++i) < array.length);
        //遍历数组
        for (int y=0; y<array.length; y++) {
            System.out.println(array[y]);
        }

    }
}
