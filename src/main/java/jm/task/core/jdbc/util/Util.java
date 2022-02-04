package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    // Connect to MySQL
    public static Connection getConnection() throws SQLException {
        String hostName = "mysql-1.ca9yqc3zwt8b.eu-west-1.rds.amazonaws.com";
        String dbName = "kata";
        String userName = "kata";
        String password = "AwRd2LG5oePq";

        return getConnection(hostName, dbName, userName, password);
    }

    public static Connection getConnection(String hostName, String dbName,
                                           String userName, String password) throws SQLException {
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }
}
