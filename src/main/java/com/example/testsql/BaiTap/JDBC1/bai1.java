package com.example.testsql.BaiTap.JDBC1;

import java.sql.*;

public class bai1 {
    public static void main(String[] args) throws SQLException {
        String query1 = "Insert into products(name, price, detail, manufacturer, number, status)" + "values (?,?,?,?,?,?)";
        String query2 = "Select * from products";
        String query3 = "Update products set status = ? where name = ?";

        Connection conn = DatabaseConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query2);
        PreparedStatement pss = conn.prepareStatement(query3);
        PreparedStatement ps = conn.prepareStatement(query1);

//
//        ps.setString(1,"Thom");
//        ps.setDouble(2,2.3);
//        ps.setString(3,"Thom_Detail");
//        ps.setString(4,"Thom_Manufacturer");
//        ps.setInt(5,10);
//        ps.setString(6,"Còn Hàng");
//        ps.executeUpdate();

//        pss.setString(1,"Hết Hàng");
//        pss.setString(2,"Thom");
//        pss.executeUpdate();

        while (rs.next()) {
            String name = rs.getString("name");
            int price = rs.getInt("price");
            String detail = rs.getString("detail");
            String manufacturer = rs.getString("manufacturer");
            int number = rs.getInt("number");
            String status = rs.getString("status");
            System.out.println("Name: " + name + " price : " + price + " detail : " + detail + " manufacturer : " + manufacturer + " number : " + number + " status : " + status);

        }

        conn.close();
        }
    }

