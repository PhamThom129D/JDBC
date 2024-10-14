package com.example.testsql.BaiTap.JDBC2.Bai1;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Bai1 bai1 = new Bai1();
//        bai1.hienThiDanhSachSanPham("select * from products");
//        bai1.themSanPham("Insert into products(name,price,detail,manufacturer ,number ,status)"+"value(?,?,?,?,?,?)","Khanh",12.3,"Test","JDBC",12,"Hết Hàng");
//        bai1.suaSanPham("Update products set name = ? where id = ?","Minh",3);
//        bai1.xoaSanPham("Delete From products Where id = ?",1);
        bai1.timKiemSanPhamTheoTen("SELECT * FROM products WHERE name LIKE ?","om");
    }
}
