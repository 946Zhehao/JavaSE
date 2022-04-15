package ShuZu;

import java.util.Scanner;

public class Enter {
    public void Run(){
        int count;
        //创建一个double类型的数组
        double next[] = new double[10];
        double sum, average;
        sum = 0;
        //输入
        Scanner sc = new Scanner(System.in);

        for(count = 0; count < 7; count++){
            System.out.println("输入第"+(count+1)+"天的温度");
            next[count] = sc.nextDouble();
            sum+=next[count];
        }

        average = sum/7;
        System.out.println(sum);
        System.out.println(average);

        for (count = 0; count < 7; count++){
            System.out.println(next[count]);
        }
    }
}
