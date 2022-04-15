package AAHuiHuiKaoYan;
import java.util.*;
/*
每日一道编程题（323）：2019华科软院学硕上机（一）-单词个数统计
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(str);
            System.out.println(str.length());
            System.out.println(str.charAt(4));
            for(int i = 0; i < str.length(); i++) {
                if(' ' == str.charAt(i) && ' ' != str.charAt(i - 1)) {
                    count++;
                }
                /*
                //如果出现逗号
                if(',' == str.charAt(i)) {
                    count++;
                }
                */
            }
            if(str.endsWith(" ")) {
                System.out.println(count);
            } else {
                System.out.println(count + 1);
            }
            count = 0;
        }
    }
}
