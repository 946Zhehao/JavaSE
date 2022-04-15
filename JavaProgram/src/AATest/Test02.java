package AATest;
import java.util.*;
/*
郑轻OJ 1001：植树问题
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int treeNum, stuNum;
        int ave, sy;
        while(sc.hasNext()) {
            treeNum = sc.nextInt();
            stuNum = sc.nextInt();
            ave = treeNum / stuNum;
            sy = treeNum % stuNum;
            System.out.println(ave + " " + sy);
        }
    }
}
