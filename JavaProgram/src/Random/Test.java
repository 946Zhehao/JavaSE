package Random;

import java.util.Random;
/*
随机数
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        //随机产生一个int范围内的数字
        int num = random.nextInt();
        System.out.println(num);

        //产生0-100之间的随机数,不包括101
        num = random.nextInt(101);
        System.out.println(num);
    }
}
