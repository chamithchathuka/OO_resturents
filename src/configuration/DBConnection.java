/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Deny Prasetyo
 */
public class DBConnection {

    private static DBConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/restaurant1";
    private String username = "root";
    private String password = "";

    private DBConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DBConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBConnection();
        }

        return instance;
    }
}
