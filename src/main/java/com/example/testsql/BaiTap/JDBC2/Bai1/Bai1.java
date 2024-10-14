package com.example.testsql.BaiTap.JDBC2.Bai1;

import java.sql.*;

public class Bai1 {
    Connection conn = DatabaseConnection.getConnection();
    Statement stmt = conn.createStatement();

    public Bai1() throws SQLException {
    }

    public void hienThiDanhSachSanPham(String query) throws SQLException {
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String name = rs.getString("name");
             Double price = rs.getDouble("price");
            String detail = rs.getString("detail");
            String manufacturer = rs.getString("manufacturer");
            int number = rs.getInt("number");
            String status = rs.getString("status");
            System.out.println( name + " " + price + " " + detail + " " + manufacturer + " " + number + " " + status);
        }
        conn.close();
    }
    public void themSanPham(String query, String name , Double price , String detail , String manufacturer , int number , String status) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, name);
        pstmt.setDouble(2, price);
        pstmt.setString(3, detail);
        pstmt.setString(4, manufacturer);
        pstmt.setInt(5, number);
        pstmt.setString(6, status);
        pstmt.executeUpdate();
        conn.close();
    }
    public void suaSanPham(String query, String name , int id) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, name);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        conn.close();
    }
    public void xoaSanPham(String query,int id) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
        conn.close();
    }
    public void timKiemSanPhamTheoTen(String query, String nameSearch) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, "%" + nameSearch + "%");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            Double price = rs.getDouble("price");
            String detail = rs.getString("detail");
            String manufacturer = rs.getString("manufacturer");
            int number = rs.getInt("number");
            String status = rs.getString("status");
            System.out.println( name + " " + price + " " + detail + " " + manufacturer + " " + number + " " + status);
        }
        conn.close();
    }

}
