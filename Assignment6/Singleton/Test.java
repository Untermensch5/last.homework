package Assignment6.Singleton;

import java.sql.*;

public class Test{
    private static Connection con = null;
    public static Connection getInstance() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/library_db";
        try {
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "27042003");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

    private Test(){

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println(Test.getInstance().prepareStatement("SELECT * FROM  table_name;").toString());
    }
}
