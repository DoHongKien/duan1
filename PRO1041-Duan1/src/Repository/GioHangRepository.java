/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.GioHang;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author admin
 */
public class GioHangRepository {

    static Connection conn;

    public GioHangRepository() {
    }
    

//    @Override
    public static int insert(GioHang gioHang) {
        String sql = "insert into GioHang(id_hoa_don, ngay_tao, ngay_nhap, trang_thai) values (?,?,?,?)";
        int idGioHang = 0;
        
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps =  conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, gioHang.getIdHoaDon());
            ps.setString(2, gioHang.getNgayTao());
            ps.setString(3, gioHang.getNgayNhap());
            ps.setInt(4, gioHang.getIdHoaDon());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {
                idGioHang = rs.getInt(1);
                System.out.println(idGioHang);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return idGioHang;
    }
    public static void main(String[] args) {
        GioHang gh = new GioHang();
        gh.setIdHoaDon(1);
    }
}
