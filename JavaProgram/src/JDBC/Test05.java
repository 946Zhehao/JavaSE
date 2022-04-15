package JDBC;

import java.sql.*;

/*
处理查询结果集
 */
public class Test05 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.获取连接
            String url = "jdbc:mysql://localhost:3307/bjpowernode";
            String user = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, user, password);

            //3.获取数据库操作对象
            stmt = conn.createStatement();

            //4.执行sql
            rs = stmt.executeQuery("select empno, ename, sal from emp");

            //5.处理查询结果集
            while(rs.next()) {
                //如果光标指向的行有数据
                //取数据
                //getString方法的特点：不管数据库中的数据类型是什么，都以String的形式取出
                //以列的下标获取，JDBC中所有下标从1开始
                String empno = rs.getString(1);     //取员工编号
                String ename = rs.getString(2);     //取员工名字
                String sal = rs.getString(3);       //取员工薪资

                //以列的名字获取
                //列名称不是表中的列名称，而是查询结果集中的列名称
//                String empno = rs.getString("empno");     //取员工编号
//                String ename = rs.getString("ename");     //取员工名字
//                String sal = rs.getString("sal");       //取员工薪资

                //以特定的类型取出,类型与数据库中的存储类型一致
//                int empno = rs.getInt(1);
//                String ename = rs.getString(2);
//                double sal = rs.getDouble(3);

//                int empno = rs.getInt(“empno”);
//                String ename = rs.getString("ename");
//                double sal = rs.getDouble("sal");

                System.out.println(empno + " " + ename + " " + sal);
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
    }
}
