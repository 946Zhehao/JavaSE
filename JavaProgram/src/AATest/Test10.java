package AATest;
import java.util.*;
/*
1009: 求平均分
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float math, english, computer;
        while(sc.hasNext()) {
            math = sc.nextFloat();
            english = sc.nextFloat();
            computer = sc.nextFloat();
            float ave = (float) (math + english + computer) / 3;
            //四舍五入
            if(ave*1000%10 > 4) {
                ave = (float) (ave + 0.01);
            }
            int x = (int) (ave * 100);
            float y = (float) x / 100;
            String s = String.valueOf(y);
            if((s.indexOf(".") + 2) == s.length()) {
                System.out.println(y + "0");
            } else {
                System.out.println(y);
            }
        }
    }
}
