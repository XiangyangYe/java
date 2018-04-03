package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    Connection con;

    public Connection getConnection() {
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            System.out.println("数据可加载成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try{
            con = DriverManager.getConnection("jdbc:jtds:" + "sqlserver://localhost:1433/db_jdbc", "sa", "");
            System.out.println("数据库连接成功");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args){
        Conn c = new Conn();
        c.getConnection();
    }
}
