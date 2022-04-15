package AATest;
import java.util.*;
/*
郑轻OJ 1002：简单多项式求值
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        while(sc.hasNext()) {
            x = sc.nextInt();
            y = 2*x*x + x + 8;
            System.out.println(y);
        }
    }
}
