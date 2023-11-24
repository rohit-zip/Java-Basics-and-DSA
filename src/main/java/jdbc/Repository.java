package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - jdbc
 * Created_on - 24 November-2023
 * Created_at - 22 : 21
 */

public class Repository {

    public static int save(Entity entity) {
        try {
            Connection connection = JDBCConnection.initConnection();
            String query = "insert into entity(id, name, email, username) values(?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, entity.getId() + "");
            preparedStatement.setString(2, entity.getName());
            preparedStatement.setString(3, entity.getEmail());
            preparedStatement.setString(4, entity.getUsername());
            int a = preparedStatement.executeUpdate();
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
