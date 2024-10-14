package com.example.testsql.BaiTap.JDBC2.Bai4;

import java.math.BigDecimal;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Bai4 bai4 = new Bai4();
//
//        String query1 = "Select * from employee";
//        bai4.hienThiDanhSachNhanVien(query1);
//
//        String query2 = "Insert into employee(name,department,salary)"+"values(?,?,?)";
//        bai4.themNhanVien(query2,"Thơm","Quản lý", BigDecimal.valueOf(25));

//        String query3 = "Update employee set name=? where id=?";
//        bai4.capNhatThongTin(query3,1,"Huy");

//        String query4 = "Delete from employee where id=?";
//        bai4.xoaNhanVien(query4,4);

        String query5 = "Select * from employee where name like ?";
        bai4.timKiemNhanVien(query5,"u");
    }

}
