package Array;
import java.util.Scanner;

public class HotelTest {
    public static void main(String[] args) {
        Hotel ht = new Hotel(9, 10);
        Scanner sc = new Scanner(System.in);

        do {
            //显示所有房间状态
            ht.showAllRooms();
            System.out.println("欢迎光临！请问您需要什么服务!（请输入对应编号）");
            System.out.println("1、预订房间");
            System.out.println("2、退房");
            System.out.println("3、查看房间状态");
            System.out.println("4、退出系统");

            switch (sc.nextInt()) {
                case 1:
                    System.out.print("请输入您要预定的房间编号：");
                    ht.subscribe(sc.nextInt());
                    break;
                case 2:
                    System.out.print("请输入您要退订的房间编号：");
                    ht.leave(sc.nextInt());
                    break;
                case 3:
                    //查看所有房间状态
                    ht.showAllRooms();
                    break;
                case 4:
                    //退出系统
                    return;
                default:
                    System.out.println("请重新输入编号！");
                    break;
            }

            System.out.println("是否退出(T)");
        }while(true);
    }
}
