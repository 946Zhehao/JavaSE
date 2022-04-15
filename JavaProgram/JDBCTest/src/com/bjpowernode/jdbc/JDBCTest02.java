package com.bjpowernode.jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

/*
解决sql注入问题
    只要用户提供的信息不参与sql语句的编译过程，问题就解决了
    即使用户提供的信息中含有sql语句的关键字，但未参与编译，不起作用
    PreparedStatement接口继承了java.sql.Statement
                     是属于预编译的数据库操作对象
                     原理是:预先对sql语句的框架进行编译，然后再给sql语句传”值“
 */

public class JDBCTest02 {
    public static void main(String[] args) {
        //初始化一个界面
        Map<String, String> userLoginInfo = initUI();
        //验证用户名和密码
        boolean loginFlag = login(userLoginInfo);
        //显示登陆结果
        System.out.println(loginFlag ? "登陆成功!" : "登陆失败!");
    }

    /**
     * 用户登录
     * @param userLoginInfo 用户登录信息
     * @return false 表示登陆失败  true 表示登录成功
     */
    public static boolean login(Map<String, String> userLoginInfo) {
        //JDBC代码
        Connection conn = null;
        //Statement stmt = null;
        PreparedStatement ps = null;    //这里使用PreparedStatement预编译的数据库操作对象
        ResultSet rs = null;
        boolean flag = false;       //用于返回
        //从配置文件中取数据
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("driver");
        String url = rb.getString("url");
        String user = rb.getString("user");
        String password = rb.getString("password");

        try {
            //1.注册驱动
            Class.forName(driver);

            //2.获取连接
            conn = DriverManager.getConnection(url, user, password);

            //3.获取预编译的数据库操作对象
            //下列sql语句的”?“就是以后要填的值，一个问好代表一个占位符，不能用单引号括起来
            String sql = "select * from t_user where user = ? and password = ?";
            //执行到此处，会发送sql语句框子给DBMS，然后DBSMS进行sql语句的预先编译
            ps = conn.prepareStatement(sql);
            //给占位符传值。（第一个问号下标是1，第二个问号下标是2.....，JDBC中所有下标从1开始）
            ps.setString(1, userLoginInfo.get("loginName"));
            ps.setString(2, userLoginInfo.get("loginPassword"));

            //4.执行sql
            rs = ps.executeQuery();

            //5.处理查询结果集
            System.out.println("user" + " " + "password");
            if (rs.next()) {
                String usr = rs.getString("user");
                String pwd = rs.getString("password");
                System.out.println(usr + " " + pwd);

                flag = true;
            } else {
                flag = false;
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //6.释放资源
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(ps != null) {
                try {
                    ps.close();
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

        return flag;
    }

    /**
     * 初始化用户界面
     * @return 用户输入的用户名和密码等登录信息
     */
    public static Map<String, String> initUI() {
        //输入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.print("用户名：");
        String loginName = sc.nextLine();
        System.out.print("密码：");
        String loginPassword = sc.nextLine();

        //将用户名和密码存储在Map集合
        Map<String, String> loginInfo = new HashMap<>();
        loginInfo.put("loginName", loginName);
        loginInfo.put("loginPassword", loginPassword);

        return loginInfo;
    }
}
