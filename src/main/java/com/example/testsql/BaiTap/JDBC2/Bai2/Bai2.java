package com.example.testsql.BaiTap.JDBC2.Bai2;

import java.sql.*;

public class Bai2 {
    Connection connection = DatabaseConnection.getConnection();
    Statement statement = connection.createStatement();

    public Bai2() throws SQLException {
    }
// Hiển thị danh sách sách
    public void hienThiDanhSachSach(String query) throws SQLException {
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String title = resultSet.getString("title");
            String author = resultSet.getString("author");
            int year_published = resultSet.getInt("year_published");

            System.out.println("Thông tin sách : " + id + ", " + title + ", " + author + ", " + year_published);
        }
    }

    // Thêm Sách mới
    public void themSachMoi(String query, String title , String author , int year_published) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(query);
        pstm.setString(1, title);
        pstm.setString(2, author);
        pstm.setInt(3, year_published);
        pstm.executeUpdate();
        pstm.close();
    }

    // Sửa thông tin sách
    public void suaThongTinSach(String query , String author, int id ) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(query);
        pstm.setString(1, author);
        pstm.setInt(2, id);
        pstm.executeUpdate();
        pstm.close();
    }
    // Xóa sách
    public void xoaSach(String query, int id) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(query);
        pstm.setInt(1, id);
        pstm.executeUpdate();
        pstm.close();
    }

    //Tìm kiếm sách theo tên hoặc tác giả
    public void timKiemSach(String query , String nameSearch) throws SQLException {
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, "%" + nameSearch + "%");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            String id = rs.getString("id");
            String title = rs.getString("title");
            String author1 = rs.getString("author");
            int year_published = rs.getInt("year_published");
            System.out.println("Thông tin sách tìm kiếm : " + id + ", " + title + ", " + author1 + ", " + year_published);
        }
    }

}
