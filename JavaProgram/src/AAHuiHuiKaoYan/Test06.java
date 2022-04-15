package AAHuiHuiKaoYan;
import java.util.*;
/*
LeetCode682棒球比赛
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            //最新一轮分数
            int score = 0;
            //倒数第二轮的分数
            int score2 = 0;
            //总分
            int sum = 0;
            //轮数
            int round = 0;
            //最后一次得分的轮数
            int count = 0;
            //删除第几轮的分数
            int reomveRount = 0;
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] scores = new int[s.length];
            for(int i = 0; i < s.length; i++) {
                //轮数
                if(!"C".equals(s[i])) {
                    round++;
                }
                if ("C".equals(s[i])) {
                    //如果是字符
                    sum = sum - score;
                    count--;
                    score = scores[count-1];
                    reomveRount = round;
                    System.out.println("第" + (round--) + "轮的数据无效。总数是：" + sum);

                } else if("D".equals(s[i])) {
                    scores[count] = 2 * scores[count-1];
                    score = scores[count++];
                    sum = sum + score;
                    System.out.println("你可以得到" + score + "分（第" + reomveRount +"轮的数据已被删除）。总和是：" + sum);
                } else if("+".equals(s[i])) {
                    scores[count] = scores[count-1] + scores[count-2];
                    score = scores[count++];
                    sum = sum + score;
                    System.out.println("你可以得到" + score + "分。总和是：" + sum);
                } else {
                    //如果是数字
                    scores[count] = Integer.parseInt(s[i]);
                    score = scores[count++];
                    sum = sum + score;
                    System.out.println("你可以得到" + score + "分。总和是：" + sum);
                }
            }
        }
    }
}
