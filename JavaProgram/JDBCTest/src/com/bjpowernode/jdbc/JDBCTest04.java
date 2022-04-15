package com.bjpowernode.jdbc;

import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/*
jDBC事务机制
    1.JDBC的事务是自动提交的
        只要执行任意一条DML语句，则自动提交一次，这是JDBC默认的事务行为
        但在实际的业务当中，通常都是N条DML语句共同联合才能完成的，必须
        保证他们在同一事务中同时成功或同时失败
    2.重点三行代码
        conn.setAutoCommit(false);
        conn.commit();
        conn.rollback();
 */
public class JDBCTest04 {
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
            //将自动提交机制修改为手动提交
            conn.setAutoCommit(false);  //开启事务

            //3.获取预编译的数据库操作对象
            //更新
            String sql1 = "update t_user set password = ? where user = ?";
            ps = conn.prepareStatement(sql1);
            ps.setString(1, "xxxx");
            ps.setString(2, "wuhu");
            //4.执行sql
            int count = ps.executeUpdate();

            //模拟异常
            String t = null;
            int len = t.length();

            //更新
            String sql2 = "update t_user set user = ? where user = ?";
            ps = conn.prepareStatement(sql2);
            ps.setString(1, "xxxx");
            ps.setString(2, "wuhu");
            //4.执行sql
            count += ps.executeUpdate();
            //提交事务
            conn.commit();
            System.out.println(count);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            //事务运行过程中出现异常则回滚
            if(conn != null) {
                try {
                    conn.rollback();    //事务回滚
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
