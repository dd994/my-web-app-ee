
package app.dao;

import app.config.DBConnnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {
    private static Connection connection ;
    private static PreparedStatement preparedStatement;


    public static void saveUser(String firstname, String secondname, String mail, int age){
        try {
            connection = DBConnnection.createConnection();
            preparedStatement = connection.prepareStatement("insert into INFO  values (?,?,?,?)");
            preparedStatement.setString(1,firstname);
            preparedStatement.setString(2,secondname);
            preparedStatement.setString(3,mail);
            preparedStatement.setInt(4,age);
            preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
