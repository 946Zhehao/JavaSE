package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.Statement;

/*
JDBC编程六步
 */
public class Test01 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            //1.注册驱动
            //com.mysql.jdbc.Driver这个类是mysql-connector-java内的
            //Driver类是java.sql包内的
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            //2.获取连接
            //String url = "jdbc:mysql://localhost:3307/bjpowernode?useSSL=false&serverTimezone=Hongkong&characterEncoding=utf-8&autoReconnect=true";
            String url = "jdbc:mysql://localhost:3307/bjpowernode";
            String user = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, user, password);
            //System.out.println("数据库连接对象 = " + conn);

            //3.获取数据库操作对象(Statement专门执行sql语句的)
            stmt = conn.createStatement();

            //4.执行sql
            String sql = "insert into t_student() values('6','zhaoliu', '100', 'zhaoliu@199.com')";
            //专门执行DML语句的（insert delete update）
            //返回值是：影响数据库中的记录条数
            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1 ? "保存成功" : "保存失败");

            //5.处理查询结果集
            //由于是插入，所以没有查询结果集，此步不用处理

        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            //6.释放资源
            //为了保证资源一定释放，在finally语句块中关闭资源
            //遵循从小到大一次关闭
            //分别对其try...catch

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
