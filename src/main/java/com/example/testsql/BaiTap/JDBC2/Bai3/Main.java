package com.example.testsql.BaiTap.JDBC2.Bai3;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Bai3 bai3 = new Bai3();

//        String query1 = "Select * from Customer";
//        bai3.hienThiDanhSachKhachHang(query1);
//
//        String query2 = "Insert into Customer(name,email,phone)"+ "values(?,?,?) ";
//        bai3.themKhachHang(query2,"Huy","Huy@gmail.com","0987654321");
//
//        String query3 = "Update Customer set name=?,email=? where id=?";
//        bai3.suaThongTin(query3,"ThomJDBC",2,"Thom@gmail.com");

//        String query4 = "Delete from Customer where id = ?";
//        bai3.xoaKhachHang(query4,4);

        String query5 = "Select * from Customer where email LIKE ?";
        bai3.timKiemKhachHang(query5,"a");

    }
}
