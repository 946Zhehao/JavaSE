package AAHuiHuiKaoYan;
import java.util.*;
/*
2019中南大学计算机上机（二）-走台阶改进
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int F1 = 1;
            int F2 = 2;
            int Fn = 0;
            if(n == 1) {
                System.out.println(F1);
                continue;
            } else if(n == 2) {
                System.out.println(F2);
                continue;
            } else {
                for(int i = 3; i <= n; i++) {
                    Fn = F1 + F2;
                    F1 = F2;
                    F2 = Fn;
                }
                System.out.println(Fn);
                continue;
            }
        }
    }
}
