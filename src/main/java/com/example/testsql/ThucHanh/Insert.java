package com.example.testsql.ThucHanh;

import java.sql.*;

public class Insert {
    public static void main(String[] args) throws SQLException {
        String query = "insert into KhachHang(HoTen,DiaChi,DienThoai)" + "values (?,?,?)";
        DatabaseConnection db = new DatabaseConnection();
        Connection connection = db.getConnection();
        PreparedStatement pstm = connection.prepareStatement(query);
        try{
            pstm.setString(1,"KhachHangJDBC");
            pstm.setString(2,"DiaChiJDBC");
            pstm.setString(3,"DienThoaiJDBC");

            pstm.executeUpdate();
            if(pstm.getUpdateCount()>0){
                System.out.println("Thêm thành công " + pstm.getUpdateCount());
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
