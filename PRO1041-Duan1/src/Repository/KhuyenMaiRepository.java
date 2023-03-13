/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.KhuyenMai;
import Utility.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class KhuyenMaiRepository implements IKhuyenMaiRepository {

    private Connection conn;

    public KhuyenMaiRepository() {
    }

    @Override
    public List<KhuyenMai> getListKhuyenMai() {
        List<KhuyenMai> list = new ArrayList<>();
        String sql = "select * from KhuyenMai";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                KhuyenMai khuyenMai = new KhuyenMai(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                list.add(khuyenMai);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return list;
    }

    @Override
    public Boolean insert(KhuyenMai km) {
        boolean f = false;
        String sql = "insert into KhuyenMai(ma, gia_tri, ngay_tao, ngay_het_han, ngay_nhap, trang_thai) values (?,?,?,?,?,?)";
        
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, km.getMa());
            ps.setInt(2, km.getGiaTri());
            ps.setString(3, km.getNgayTao());
            ps.setString(4, km.getNgayHetHan());
            ps.setString(5, km.getNgayNhap());
            ps.setInt(6, km.getTrangThai());
            int result = ps.executeUpdate();
            
            if(result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    @Override
    public Boolean update(KhuyenMai km) {
        boolean f = false;
        String sql = "update KhuyenMai set gia_tri = ?, ngay_tao = ?, ngay_het_han = ?, ngay_nhap = ?, trang_thai = ? where ma = ?";
        
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, km.getGiaTri());
            ps.setString(2, km.getNgayTao());
            ps.setString(3, km.getNgayHetHan());
            ps.setString(4, km.getNgayNhap());
            ps.setInt(5, km.getTrangThai());
            ps.setString(6, km.getMa());
            int result = ps.executeUpdate();
            
            if(result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    @Override
    public Boolean delete(String ma) {
        boolean f = false;
        String sql = "delete from KhuyenMai where ma = ?";
        
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);

            int result = ps.executeUpdate();
            
            if(result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

}
