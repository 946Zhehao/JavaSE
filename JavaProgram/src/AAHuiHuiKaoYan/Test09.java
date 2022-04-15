package AAHuiHuiKaoYan;
import java.util.*;
/*
 * LeetCode496下一个更大元素 I
 */
public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int nums1[] = new int[10];
            int nums2[] = new int[10];
            System.out.println(nums1.length);
            int counts1 = 0;
            int counts2 = 0;
            //数字在nums2中相等，设置一个标志位
            boolean flag = false;
            boolean noFind = true;
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] s11 = s1.split(" ");
            String[] s22 = s2.split(" ");

            for(String s : s11) {
                nums1[counts1++] = Integer.parseInt(s);
            }
            for(String s : s22) {
                nums2[counts2++] = Integer.parseInt(s);
            }

            for(int i = 0; i < counts1; i++) {
                for(int j = 0; j < counts2; j++) {
                    //如果找到相等，将标志位设为true
                    if(nums1[i] == nums2[j]) {
                        flag = true;
                    }
                    if(flag == true && nums1[i] < nums2[j]) {
                        System.out.println("对于num1中的数字" + nums1[i] + "，第二个数组中数字" + nums1[i] + "右边的下一个较大的数字是" + nums2[j]);
                        noFind = false;
                        break;
                    } else {
                        noFind = true;
                    }
                }
                if(flag == false || noFind == true) {
                    System.out.println("对于num1中的数字" + nums1[i] + "，你无法在第二个数组中找到下一个更大的数字，因此输出-1");
                }
                flag = false;
            }
        }
    }
}
