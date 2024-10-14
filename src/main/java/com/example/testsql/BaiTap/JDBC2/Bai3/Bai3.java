package com.example.testsql.BaiTap.JDBC2.Bai3;

import java.sql.*;

public class Bai3 {
    Connection conn = DatabaseConnection.getConnection();
    Statement stmt = conn.createStatement();

    public Bai3() throws SQLException {
    }
    // Hiển thị danh sách khách hàng
    public void hienThiDanhSachKhachHang(String query) throws SQLException {
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String name = rs.getString("name");
            String email = rs.getString("email");
            String phone = rs.getString("phone");
            System.out.println("Danh sách khách hàng : " + name + ", " + email + ", " + phone);
        }
        rs.close();
    }

//    Thêm khách hàng mới
    public void themKhachHang(String query, String name , String email , String phone) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, email);
        stmt.setString(3, phone);
        stmt.executeUpdate();
        stmt.close();
    }

//    Sưả thông tin khách hàng
    public void suaThongTin(String query, String name, int id, String email) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, email);
        stmt.setInt(3, id);
        stmt.executeUpdate();
        stmt.close();
    }

//    Xóa khách hàng
    public void xoaKhachHang(String query, int id) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
    }

//    Tìm kiếm khách hàng theo tên hoặc email
    public void timKiemKhachHang(String query, String nameSearch) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, "%"+nameSearch+"%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            String email = rs.getString("email");
            String phone = rs.getString("phone");
            System.out.println("Thông tin khách hàng tìm kiếm : " + name + ", " + email + ", " + phone);
        }
    }
}
