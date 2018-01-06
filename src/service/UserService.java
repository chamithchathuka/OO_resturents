/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import configuration.DBConnection;
import entity.UsersEntity;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author chamith
 */
public class UserService {

    public static boolean createnewUser(UsersEntity userEntity) throws SQLException {

        boolean createUserSuccess = false;
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();

        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, userEntity.getUsername());
        statement.setString(2, userEntity.getPassword());

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            createUserSuccess = true;
            System.out.println("A new user was inserted successfully!");
        }

        return createUserSuccess;
    }

    public static UsersEntity getUser(UsersEntity userEntity) throws SQLException {

        String sqlSelectQuery = "select * from users where username = ?";

        UsersEntity usersEntity = new UsersEntity();

        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();

        PreparedStatement prepareStatement = connection.prepareStatement(sqlSelectQuery);

        prepareStatement.setString(1, userEntity.getUsername());

        ResultSet resultSet = prepareStatement.executeQuery();

        // processing returned data and printing into console
        while (resultSet.next()) {
            userEntity.setUsername(resultSet.getString(1));
            userEntity.setRole(resultSet.getString(3));
        }

        return userEntity;
    }

    public static boolean checkUser(UsersEntity userEntity) throws SQLException {

        boolean isCredentialsCorrect = false;

        String sqlSelectQuery = "select * from users where username = ?";

        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();

        PreparedStatement prepareStatement = connection.prepareStatement(sqlSelectQuery);

        prepareStatement.setString(1, userEntity.getUsername());

        ResultSet resultSet = prepareStatement.executeQuery();

        // processing returned data and printing into console
        while (resultSet.next()) {

            String username = resultSet.getString(1);
            String password = resultSet.getString(2);
            if (username.equals(userEntity.getUsername())) {
                if (password.equals(userEntity.getPassword())) {
                    isCredentialsCorrect = true;

                }
            }

        }

        return isCredentialsCorrect;
    }

}
