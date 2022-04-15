package AATest;
import java.util.*;
/*
1005: 整数幂
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int num1, num2, num3;
        while(sc.hasNext()) {
            num[0] = sc.nextInt();
            num[1] = sc.nextInt();
            num[2] = sc.nextInt();

            for(int i = 0; i < num.length; i++) {
                int count = 1;
                System.out.print(num[i]);
                int temp = num[i];
                while((temp / 10) > 0) {
                    count++;
                    temp = temp / 10;
                }
                for(int x = 0; x < 9-count; x++) {
                    System.out.print(" ");
                }
                count = 1;
                System.out.print(num[i] * num[i]);
                temp = num[i] * num[i];
                while((temp / 10) > 0) {
                    count++;
                    temp = temp / 10;
                }
                for(int x = 0; x < 9-count; x++) {
                    System.out.print(" ");
                }
                System.out.println(num[i] * num[i] * num[i]);
            }
        }
    }
}
