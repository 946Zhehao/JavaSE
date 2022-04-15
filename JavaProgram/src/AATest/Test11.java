package AATest;
import java.util.*;
/*
1010: 求圆的周长和面积
 */
public class Test11 {
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, c, s;
        while(sc.hasNext()) {
            r = sc.nextDouble();
            c = 2 * PI * r;
            s = PI * r * r;
            System.out.println(c);
            System.out.println(s);
            //四舍五入
            if((int)(c*1000%10) > 4) {
                c = c + 0.01;
            }
            //四舍五入
            if((int)(s*1000%10) > 4) {
                s = s + 0.01;
            }
            String str = String.valueOf(c);
            String cc = str.substring(0, str.indexOf(".") + 3);
            str = String.valueOf(s);
            String ss = str.substring(0, str.indexOf(".") + 3);
            System.out.println(cc + " " + ss);
        }
    }
}
