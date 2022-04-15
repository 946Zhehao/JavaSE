package AAHuiHuiKaoYan;
import java.util.*;
/*
2019华科软院学硕上机（二）-魔方阵
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x, y;
        while(sc.hasNext()) {
            n = sc.nextInt();
            int[][] moFang = new int[n][n];
            if(n == 1) {
                moFang[0][0] = 1;
            } else {
                //将1放在第一行中间一列
                x = 0;
                y = ((n+1) / 2) - 1;
                moFang[x][y] = 1;

                for(int i = 2; i <= n*n; i++) {
                    int xNew, yNew;
                    //如果上一个元素在第一行，这个元素就该在最后一行,否则行数减1
                    if(x == 0) {
                        xNew = n - 1;
                    } else {
                        xNew = x-1;
                    }
                    //列数+1
                    yNew = (y + 1) % n;
                    //如果该位置已有元素,则放在上一个数的最下方，否则放入
                    if(moFang[xNew][yNew] != 0) {
                        x = (x + 1) % n;
                    } else {
                        x = xNew;
                        y = yNew;
                    }
                    moFang[x][y] = i;
                }
            }


            //遍历魔方
            for(int m = 0; m < moFang.length; m++) {
                for(int z = 0; z < moFang[m].length; z++) {
                    if(z == n-1) {
                        System.out.print(moFang[m][z]);
                    } else {
                        System.out.print(moFang[m][z] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
