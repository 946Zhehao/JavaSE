package JDBC;
/*
注册驱动的另一种方式（常用）
 */
public class Test03 {
    public static void main(String[] args) {

        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.获取连接
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
