package com.example.testsql.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM monan");

            while (resultSet.next()) {
                System.out.println("Column Value: " + resultSet.getString("MonAnID")+" : "+ resultSet.getString("TenMon"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
