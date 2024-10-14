package com.example.testsql.BaiTap.JDBC2.Bai4;

import java.math.BigDecimal;
import java.sql.*;

public class Bai4 {
    Connection conn = DatabaseConnection.getConnection();
    Statement stmt = conn.createStatement();
    public Bai4() throws SQLException {
    }

    //    Hiển thị danh sách nhân viên
    public void hienThiDanhSachNhanVien(String query) throws SQLException{
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            String name = rs.getString("name");
            String department = rs.getString("department");
            BigDecimal salary = rs.getBigDecimal("salary");
            System.out.println("Thông tin Nhân Viên : " + name + " , " + department + " , " + salary);
        }
        rs.close();
    }
    // Thêm nhân viên mới
    public void themNhanVien(String query, String name , String department , BigDecimal salary) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, department);
        stmt.setBigDecimal(3, salary);
        stmt.executeUpdate();
        stmt.close();
    }
    //Cập nhật thông tin nhân viên
    public void capNhatThongTin(String query , int id , String name ) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(2, id);
        stmt.setString(1, name);
        stmt.executeUpdate();
        stmt.close();
    }
    //Xóa nhân viên
    public void xoaNhanVien(String query , int id) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
    }
    // Tìm kiếm nhân viên theo tên hoặc chức vụ
    public void timKiemNhanVien(String query , String nameSearch) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, "%"+nameSearch+"%");
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            String name = rs.getString("name");
            String department = rs.getString("department");
            BigDecimal salary = rs.getBigDecimal("salary");
            System.out.println("Thông tin Nhân Viên tìm kiếm : " + name + " , " + department + " , " + salary);
        }
        stmt.close();
        rs.close();
    }
}
