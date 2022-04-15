package JDBC;

import java.sql.*;

/*
JDBC执行删除和更新
 */
public class Test02 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            //1.注册驱动
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            //2.获取连接
            String url = "jdbc:mysql://localhost:3307/bjpowernode";
            String user = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, user, password);

            //3.获取数据库操作对象
            stmt = conn.createStatement();

            //4.执行sql语句
            //删除
            String sql = "delete from t_student where name = 'xxx'";
            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1 ? "删除成功" : "删除失败");

            //更新
            sql = "update t_student set name = 'LZH', email = '1477531126@qq.com' where name = 'aaa'";
            count = stmt.executeUpdate(sql);
            System.out.println(count == 1 ? "更新成功" : "更新失败");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //5.释放资源
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
