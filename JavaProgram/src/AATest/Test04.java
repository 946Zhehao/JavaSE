package AATest;
import java.util.*;
/*
郑轻OJ 1003：两个整数的四则运算
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        while(sc.hasNext()) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            int sum = num1 + num2;
            int sub = num1 - num2;
            int j = num1 * num2;
            int s = num1 / num2;
            int y = num1 % num2;
            System.out.println(sum + " " + sub + " " + j + " " + s + " " + y);
        }
    }
}
