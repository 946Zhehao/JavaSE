package com.bjpowernode.jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

/*
实现功能：
    1.需求：模拟用户登录功能的实现
    2.业务描述：
        程序运行时，提供一个输入的入口，可以让用户输入用户名和密码
        用户输入用户名和密码之后，提交信息，java程序收集到用户信息
        java程序连接数据库验证用户名和密码是否合法
        合法：显示登陆成功
        不合法：显示登陆失败
    3.数据的准备：
        在实际开发中，表的设计会使用专业的建模工具，我们这里安装一个建模工具，PowerDesigner
        是应用PD工具来进行数据库表的设计

    4.SQL注入的根本原因
        用户输入的信息中含有sql语句的关键字，并且这些关键字参与sql语句的编译过程
        导致sql语句的原意被扭曲，进而达到sql注入
    5.对比Statement和PreparedStatement
        Statement会产生sql注入问题，PreparedStatement不会
        Statement是编译一次执行一次，PreparedStatement是编译一次，可执行n次
        PreparedStatement效率较高一些
        PreparedStatement会在编译阶段做类型的安全检查

        综上所述：PreparedStatement使用较多,极少数情况下需使用Statement
        业务方面要求必须支持sql注入(sql语句拼接)的时候，必须使用Statement
 */
public class JDBCTest01 {
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
        Statement stmt = null;
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

            //3.获取数据库操作对象
            stmt = conn.createStatement();

            //4.执行sql
            String sql = "select * from t_user where user = '" + userLoginInfo.get("loginName") +"' and password = '" + userLoginInfo.get("loginPassword") + "'";
            rs = stmt.executeQuery(sql);

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
