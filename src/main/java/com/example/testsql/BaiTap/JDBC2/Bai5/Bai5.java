package com.example.testsql.BaiTap.JDBC2.Bai5;

import java.sql.*;

public class Bai5 {
    Connection conn = DatabaseConnection.getConnection();
    Statement stmt = conn.createStatement();

    public Bai5() throws SQLException {
    }

//    Hiển thị danh sách nhà cung cấp
    public void hienThiDanhSachNhaCungCap(String query) throws SQLException {
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String name = rs.getString("name");
            String address = rs.getString("address");
            String phone = rs.getString("phone");
            System.out.println("Thông tin nhà cung cấp : "+name+" , "+address+" , "+phone);
        }
        rs.close();
    }
    //Thêm nhà cung cấp
    public void themNhaCungCap(String query,String name , String address, String phone) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setString(3, phone);
        stmt.executeUpdate();
        stmt.close();
    }
    // Câp nhật thông tin
    public void capNhatThongTin(String query,String name ,String address, int id) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setInt(3, id);
        stmt.executeUpdate();
        stmt.close();
    }
    // Xóa nhà cung cấp
    public void xoaNhaCungCap(String query, int id) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
    }
    // Tìm kiếm nhà cung cấp
    public void timKiemNhaCungCap(String query, String nameSearch) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, "%"+nameSearch+"%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            String address = rs.getString("address");
            String phone = rs.getString("phone");
            System.out.println("Thông tin nhà cung cấp tìm kiếm : "+name+" , "+address+" , "+phone);
        }
        rs.close();
        stmt.close();
    }
}
