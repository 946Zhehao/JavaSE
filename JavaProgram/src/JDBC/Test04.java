package JDBC;

import java.sql.*;
import java.util.Enumeration;
import java.util.ResourceBundle;

/*
将连接数据库的所有信息配置到配置文件中
实际开发不建议把连接信息写死
 */
public class Test04 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        try {
            //1.注册驱动
            Class.forName(driver);

            //2.获取连接
            conn = DriverManager.getConnection(url, user, password);
            //System.out.println("数据库连接对象 = " + conn);

            //3.获取数据库操作对象(Statement专门执行sql语句的)
            stmt = conn.createStatement();

            //4.执行sql
            String sql = "insert into t_student() values('7','xiaoqi', '18', 'xiaoqi@199.com')";
            //专门执行DML语句的（insert delete update）
            //返回值是：影响数据库中的记录条数
            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1 ? "保存成功" : "保存失败");

            //5.处理查询结果集
            //由于是插入，所以没有查询结果集，此步不用处理

        } catch(SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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
