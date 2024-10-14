package com.example.testsql.BaiTap.JDBC2.Bai5;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Bai5 bai5 = new Bai5();

//        String query1 = "Select * from Supplier";
//        bai5.hienThiDanhSachNhaCungCap(query1);
//
//        String query2 = "insert into Supplier(name,address,phone)"+"values(?,?,?)";
//        bai5.themNhaCungCap(query2,"Thơm","Nam Định","0123456789");

//        String query3 = "Update Supplier set name=?,address=? where id=?";
//        bai5.capNhatThongTin(query3,"Huy","Hà Nội",4);

//        String query4 = "Delete from Supplier where id = ?";
//        bai5.xoaNhaCungCap(query4,5);

        String query5 = "Select * from Supplier where name Like ?";
        bai5.timKiemNhaCungCap(query5,"i");
    }
}
