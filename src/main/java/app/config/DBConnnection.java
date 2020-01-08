package app.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/users";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "dmytro";
    private static final String DRIVER = "org.postgresql.Driver";
    private static Connection con = null;

    public static Connection createConnection() {
        try {
            try {
                Class.forName(DRIVER); //loading postgres driver
                System.out.println("Connection created");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD); //attempting to connect to Postgres database
            System.out.println("Printing connection object " + con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
