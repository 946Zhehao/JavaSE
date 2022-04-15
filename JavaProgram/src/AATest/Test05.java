package AATest;
import java.util.*;
/*
1004: 三位数的数位分离
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        while(sc.hasNext()) {
            num1 = sc.nextInt();
            int bai = num1 / 100;
            int shi = num1 % 100 / 10;
            int ge = num1 % 10;
            System.out.println(ge+ " " + shi + " " + bai);
        }
    }
}
