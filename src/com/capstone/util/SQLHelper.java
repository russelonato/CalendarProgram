package com.capstone.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * A singleton utility class that handles the creation of sql connections.
 * 
 * @author Russel
 */
public class SQLHelper {

    private static Connection connection = null;

    private SQLHelper() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(SQLConstants.URL, SQLConstants.USERNAME, SQLConstants.PASSWORD);            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieve the existing connection
     * 
     * @return Null if the connection is not established, otherwise returns the connection corrected.
     */
    public static Connection getConnection() {
        if (connection == null) {
            new SQLHelper();
        }

        return connection;
    }
}
