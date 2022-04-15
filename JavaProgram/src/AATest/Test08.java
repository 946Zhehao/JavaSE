package AATest;
import java.util.*;
/*
1007: 鸡兔同笼
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        while(sc.hasNext()) {
            m = sc.nextInt();
            n = sc.nextInt();
            int y = (n - 2*m) / 2;
            int x = m - y;
            System.out.println(x + " " + y);
        }
    }
}
