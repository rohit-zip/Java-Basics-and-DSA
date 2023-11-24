package jdbc;

import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - jdbc
 * Created_on - 24 November-2023
 * Created_at - 21 : 35
 */

public class JDBCConnection {

    /**
     *
     * I will create one method which trigger connection with MySql Server
     * It means that it will return the connection
     */

    static Connection connection;

    public static Connection initConnection() {
        try {
            // Loading the Driver for Creating Connection with MySql Server
            Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/tutorial";
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (ClassNotFoundException exception) {
            System.out.print(exception);
        } catch (Exception exception) {
            System.out.println(exception);
        }
        return null;
    }
}
