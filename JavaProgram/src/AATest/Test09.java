package AATest;
import java.util.*;
/*
1008: 美元和人民币
 */
public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollar;
        while(sc.hasNext()) {
            dollar = sc.nextDouble();
            float money = (float) (dollar * 6.5573);
            int x;
            //四舍五入
            if(money*1000%10 > 4) {
                x = (int) (money * 100) + 1;
            } else {
                x = (int) (money * 100);
            }

            double y = (double) x / 100;
            String s = String.valueOf(y);
            if((s.indexOf(".") + 2) == s.length()) {
                System.out.println(y + "0");
            } else {
                System.out.println(y);
            }
        }
    }
}
