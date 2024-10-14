package com.example.testsql.BaiTap.JDBC2.Bai6;

import java.math.BigDecimal;
import java.sql.*;

public class Bai6 {
    Connection conn = DatabaseConnection.getConnection();
    Statement stmt = conn.createStatement();
    public Bai6() throws SQLException {
    }
//    Hiển thị danh sách sản phẩm và danh mục sản phẩm
    public void hienThi(String query1, String query2) throws SQLException {
        ResultSet rs1 = stmt.executeQuery(query1);
        while (rs1.next()) {
            String name = rs1.getString("name");
            BigDecimal price = rs1.getBigDecimal("price");
            int category_id = rs1.getInt("category_id");
            System.out.println("Danh sách sản phẩm : " + name + ", " + price + ", " + category_id);
        }
        ResultSet rs2 = stmt.executeQuery(query2);
        while (rs2.next()) {
            String name = rs2.getString("name");
            System.out.println("Danh mục Sản phẩm : " + name);
        }
    }
    // Thêm sản phẩm vào danh mục
    public void themSanPham(String query , String name , BigDecimal price, int category_id) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, name);
        ps.setBigDecimal(2, price);
        ps.setInt(3, category_id);
        ps.executeUpdate();
        ps.close();
    }
    // Sửa thông tin sản phẩm
    public void suaSanPham(String query , int id , String name , BigDecimal price, int category_id) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(4, id);
        ps.setString(1, name);
        ps.setBigDecimal(2, price);
        ps.setInt(3, category_id);
        ps.executeUpdate();
        ps.close();
    }
    // Xóa Sản phẩm
    public void xoaSanPham(String query , String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, name);
        ps.executeUpdate();
        ps.close();
    }
    // Tìm kiếm sản phẩm theo danh mục
    public void TimKiemSanPham(String query , String nameSearch) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, nameSearch);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            BigDecimal price = rs.getBigDecimal("price");
            int category_id = rs.getInt("category_id");
            System.out.println("Danh sách sản phẩm tìm kiếm: " + name + ", " + price + ", " + category_id );
        }
    }
}
