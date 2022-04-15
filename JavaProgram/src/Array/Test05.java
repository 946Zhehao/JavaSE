package Array;
/*
二维数组
    1、是一个特殊的一维数组，该一维数组当中的每一个元素是一个特殊的一维数组
三维数组：是一个特殊的二维数组，该二维数组中每个元素是一个一维数组
 */
public class Test05 {
    public static void main(String[] args) {
        //二维数组
        int[][] a1 = {{1, 2, 3}, {4, 5}, {6 ,7, 8, 9}};
        //三维数组
        int[][][] a2 = {{{1, 2}, {1, 2}, {1}},
                {{3, 4}, {3, 4}, {3, 4, 7}},
                {{5, 6, 9, 0}, {5, 6, 8}, {5, 6}}};

        System.out.println(a1.length);
        System.out.println(a1[1].length);
        System.out.println(a2.length);
        System.out.println(a2[1].length);
        System.out.println(a2[1][1].length);
        System.out.println("==============================");
        //遍历二维数组
        for(int x=0; x<a1.length; x++) {
            for(int y=0; y<a1[x].length; y++) {
                System.out.print(a1[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("==============================");
        //遍历三维数组
        for(int x=0; x<a2.length; x++) {
            for(int y=0; y<a2[x].length; y++) {
                for(int z=0; z<a2[x][y].length; z++) {
                    System.out.print(a2[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println("------------------");
        }
    }
}
