package com.bjpowernode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/*
PreparedStatement完成增删改查
 */
public class JDBCTest03 {
    public static void main(String[] args) {
        //从配置文件中获取信息
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("driver");
        String url = rb.getString("url");
        String user = rb.getString("user");
        String password = rb.getString("password");
        //System.out.println(url + " " + user + " " + password);

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            //1.注册驱动
            Class.forName(driver);

            //2.获取连接
            conn = DriverManager.getConnection(url, user, password);

            //3.获取预编译的数据库操作对象
            /*
            //插入
            String sql = "insert into t_user(user, password) values(?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "wuhu");
            ps.setString(2, "46513");
            */

            /*
            //更新
            String sql = "update t_user set user = ?, password = ? where user = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "daisam");
            ps.setString(2, "43");
            ps.setString(3, "wuhu");
            */


            //删除
            String sql = "delete from t_user where user = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "daisam");

            //4.执行sql
            int count = ps.executeUpdate();
            System.out.println(count);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //5.释放资源
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(conn != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }
    }
}
