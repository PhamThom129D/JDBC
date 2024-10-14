package com.example.testsql.ThucHanh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) throws SQLException {
        String query = "Update KhachHang Set HoTen = ? where MaKhachHang = ?";
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, "KhachHangJDBCinsert");
        ps.setInt(2, 2);

        ps.executeUpdate();
        ps.close();

    }
}
