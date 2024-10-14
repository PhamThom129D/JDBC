package com.example.testsql.BaiTap.JDBC2.Bai6;

import java.math.BigDecimal;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Bai6 bai6 = new Bai6();

//        String query1 = "Select * from product";
//        String query2 = "Select * from Category";
//        bai6.hienThi(query1,query2);
//
//        String query3 = "INSERT INTO Product (name, price, category_id)"+" VALUES(?,?,?)";
//        bai6.themSanPham(query3,"Thơm", BigDecimal.valueOf(25),2);
//
//        String query4 = "Update Product set name=?,price=?,category_id=? where id=?";
//        bai6.suaSanPham(query4,1,"Minh", BigDecimal.valueOf(25),2);

//        String query5 = "Delete from Product where name = ?";
//        bai6.xoaSanPham(query5,"Smartphone");

        String query6 = "select * from Product where category_id = ?";
        bai6.TimKiemSanPham(query6,"2");

//        String query7 = "select * from Product join Category on Product.category_id= Category.id where nameCategory = ?";
//        bai6.TimKiemSanPham(query7,"Toys");
    }
}
