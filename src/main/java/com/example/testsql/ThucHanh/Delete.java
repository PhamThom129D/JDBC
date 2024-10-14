package com.example.testsql.ThucHanh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) throws SQLException {
        String query = "Delete From KhachHang Where MaKhachHang = ?";
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, "6");
        ps.executeUpdate();
        ps.close();
    }
}
