package Basics;
import java.sql.*;

public class ConnectionSQL {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url  = "jdbc:sqlserver://127.0.0.1:1433;databaseName=trial;encrypt=false;integratedSecurity=true;";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
            System.out.println(connection);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("FAiled");
        }

        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

//        String sql = "INSERT INTO data (id,name,address)" + "VALUES (2,'Hello',85)";
//        try {
//            statement.executeUpdate(sql);
//            System.out.println("Executed Successfully");
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

    }
}
