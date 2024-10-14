package com.example.testsql.ThucHanh;

import java.sql.*;

public class Select {
    public static void main(String[] args) throws SQLException {
//        Connection conn = DatabaseConnection.getConnection();
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM KhachHang");
        DatabaseConnection connectJDBC = new DatabaseConnection();
        Connection conn = connectJDBC.getConnection();
        String query = "Select * from KhachHang";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            String MaKhachHang = rs.getString("MaKhachHang");
            String TenKhachHang = rs.getString("HoTen");
            String DiaChi = rs.getString("DiaChi");
            String DienThoai = rs.getString("DienThoai");
            System.out.println("MaKhachHang: " + MaKhachHang + " HoTen: " + TenKhachHang
            + " DiaChi: " + DiaChi + " DienThoai: " + DienThoai);
        }
        rs.close();
    }
}
