package AAHuiHuiKaoYan;
import java.util.*;
/*
 * 503下一个更大元素 II
 * 算法思想：可以将数组拷贝一份放在数组后面
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            //接收一行数据
            String s1 = sc.nextLine();
            //将字符串以“ ”空格符分隔成String数组
            String[] s3 = s1.split(" ");
            //将String数组每个元素转换为int类型，放入int数组
            int[] num1 = new int[1000];
            for(int i = 0; i < s3.length; i++) {
                num1[i] = Integer.parseInt(s3[i]);
            }
            //用于接收结果的数组
            int[] result = new int[1000];
            //int数组长度等于String数组长度
            int length1 = s3.length;
            //找到标志位
            boolean flag = false;
            for(int i = 0; i < length1; i++) {
                int index = i+1;
                while(index != i) {
                    if(num1[i] < num1[index]) {
                        result[i] = num1[index];
                        flag = true;
                        break;
                    }
                    index = (++index) % length1;
                }
                if(flag) {
                    flag = false;
                } else {
                    result[i] = -1;
                }
            }

            for(int i = 0; i < length1; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();

        }

    }
}
