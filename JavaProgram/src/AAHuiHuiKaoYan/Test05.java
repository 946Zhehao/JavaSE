package AAHuiHuiKaoYan;
import java.util.*;
/*
2019中南大学计算机上机（三）-走台阶进阶
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 2;
            int count = 1;
            //1 2 4 8 16 32.......
            for(int i = 2; i < n; i++) {
                arr[i] = 2 * arr[i - 1];
            }
            //int result = 2的n-1次方
            //System.out.println(result);
            System.out.println(arr[n - 1]);
        }
    }
}
