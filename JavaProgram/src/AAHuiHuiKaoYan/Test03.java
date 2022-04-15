package AAHuiHuiKaoYan;
import java.util.*;
/*
2019中南大学计算机上机（一）-走台阶
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n < 1 || n > 1000000) {
                System.out.println("输入错误！");
                continue;
            }
            int result = Run(n);
            System.out.println(result);
        }
    }

    public static int Run(int n) {
        if(n == 1) {
            return 1;
        } else if (n == 0) {
            return -1;
        } else if (n == 2) {
            return 2;
        }
        return Run(n - 1) + Run(n - 2);
    }
}
