package factory;

import java.sql.*;

public class ConnectionDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbcadcliente", "root", "94412210");

            Statement statement = connection.createStatement();

            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
