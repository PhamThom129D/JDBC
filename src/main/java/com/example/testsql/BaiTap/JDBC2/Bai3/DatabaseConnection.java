package com.example.testsql.BaiTap.JDBC2.Bai3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/quanlykhachhang";
    private static final String USER = "root";
    private static final String PASSWORD = "1209";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
