package com.example.testsql.BaiTap.JDBC2.Bai2;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Bai2 bai2 = new Bai2();

//        String query1 = "Select * from Book";
//        bai2.hienThiDanhSachSach(query1);
//
//        String query2 = "Insert into Book(title , author , year_published)" + "values(?,?,?)";
//        bai2.themSachMoi(query2,"TestJDBC","Ngọc Thơm",2024);

//        String query3 = "Update Book set author = ? where id = ? ";
//        bai2.suaThongTinSach(query3,"Ngọc Thơm",5);

//        String query4 = "Delete from Book where id = ?";
//        bai2.xoaSach(query4 , 4);

        String query5 = "Select * from Book WHERE author LIKE ?" ;
        bai2.timKiemSach(query5,"om");

        String query6 = "Select * from Book WHERE title LIKE ?" ;
        bai2.timKiemSach(query6,"JDBC");
    }
}
