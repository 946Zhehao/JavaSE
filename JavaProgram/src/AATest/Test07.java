package AATest;
import java.util.*;
/*
1006: 求等差数列的和
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, last, sub;
        while(sc.hasNext()) {
            first = sc.nextInt();
            last = sc.nextInt();
            sub = sc.nextInt();
            int n = (last - first) / sub + 1;
            int sum = n * (first + last) / 2;
            System.out.println(sum);
        }
    }
}
