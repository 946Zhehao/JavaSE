package Array;

import java.util.Arrays;

public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[5][5];
        //分配房间编号
        assignNum();
        //分配房间类型
        assignStyle();
    }

    public Hotel(int x, int y) {
        rooms = new Room[x][y];
        //分配房间编号
        assignNum();
        //分配房间类型
        assignStyle();
    }

    //分配房间编号
    private void assignNum() {
        for (int i=0; i<rooms.length; i++) {
            for (int m=0; m<rooms[i].length; m++) {
                rooms[i][m] = new Room();
                rooms[i][m].setNum((i+1)*100 + (m+1));
            }
        }
    }

    //分配房间类型
    private void assignStyle() {
        for(int i=0; i<rooms.length; i++) {
            if(i < 2) {
                for (int m=0; m<rooms[i].length; m++) {
                    rooms[i][m].setStyle("单人房");
                }
            } else if(i <= 3) {
                for (int m=0; m<rooms[i].length; m++) {
                    rooms[i][m].setStyle("双人房");
                }
            } else {
                for (int m=0; m<rooms[i].length; m++) {
                    rooms[i][m].setStyle("商务房");
                }
            }
        }
    }

    //预定房间
    public void subscribe(int num) {
        //将编号转换为数组下标
        int x = num/100 - 1;
        int y = num%100 - 1;
        if(x<0 || x> rooms.length || y<0 || y>rooms[x].length) {
            System.out.println("请输入正确的房间编号！");
            return;
        }
        //如果该房已被预订，提示客人，否则为该客人预定该房
        if(!rooms[x][y].isNu()) {
            System.out.println("该房间已有客人，请选择其他房间！");
            return;
        } else {
            rooms[x][y].setNu(false);
            System.out.println("预定成功！" + "您预定的是" + rooms[x][y].getStyle());
        }
    }

    //退房
    public void leave(int num) {
        //将编号转换为数组下标
        int x = num/100 - 1;
        int y = num%100 - 1;
        if(x<0 || x> rooms.length || y<0 || y>rooms[x].length) {
            System.out.println("请输入正确的房间编号！");
            return;
        }
        //如果该房未被预订，提示客人，否则为该客人退房
        if(rooms[x][y].isNu()) {
            System.out.println("请选择正确的房间编号！");
            return;
        } else {
            rooms[x][y].setNu(true);
            System.out.println("您的" + rooms[x][y].getStyle() + "退房成功！");
        }
    }

    //列出所有房间的状态
    public void showAllRooms() {
        for (int i=0; i<rooms.length; i++) {
            //输出房间编号
            System.out.print("房间编号：");
            for (int m=0; m<rooms[i].length; m++) {
                System.out.print("   " + rooms[i][m].getNum() + "      ");
            }
            //输出房间类型
            System.out.println();
            System.out.print("房间类型：");
            for (int m=0; m<rooms[i].length; m++) {
                System.out.print("   " + rooms[i][m].getStyle() + "    ");
            }
            //输出房间状态
            System.out.println();
            System.out.print("空闲状态：");
            for (int m=0; m<rooms[i].length; m++) {
                System.out.print("   " + (rooms[i][m].isNu() ? "空闲":"占用") + "      ");
            }
            System.out.println();
            System.out.println("---------------------------------------------------------------------");
        }
    }

    //可以用来取房间状态↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //未改写↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}

class Room {
    private int num;        //房间编号
    private String style;     //房间类型
    private boolean nu = true;     //是否空闲

    public Room() {

    }

    public Room(int num, String style, boolean nu) {
        this.num = num;
        this.style = style;
        this.nu = nu;
    }
    //设置房间编号
    public void setNum(int num) {
        this.num = num;
    }
    //设置房间类型
    public void setStyle(String style) {
        this.style = style;
    }
    //设置房间状态（是否空闲）
    public void setNu(boolean nu) {
        this.nu = nu;
    }
    //取房间编号
    public int getNum() {
        return num;
    }
    //取房间类型
    public String getStyle() {
        return style;
    }
    //取房间状态（是否空闲）
    public boolean isNu() {
        return nu;
    }
}
