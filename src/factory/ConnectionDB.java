package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbcadcliente", "root", "94412210");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from cliente");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "
                +resultSet.getString(3));
            }

            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
