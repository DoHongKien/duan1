/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.SanPham;
import Utility.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class SanPhamRepository implements ISanPhamRepository {

    private Connection conn;

    public SanPhamRepository() {
    }

    @Override
    public List<SanPham> getAllSanPham() {
        List<SanPham> list = new ArrayList<>();
        String select = "select * from SanPham";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SanPham sanPham = new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                list.add(sanPham);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public boolean insert(SanPham sp) {
        boolean f = false;
        String sql = "insert into SanPham(ma, ten, ngay_tao, ngay_nhap, trang_thai) values (?,?,?,?,?)";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getMa());
            ps.setString(2, sp.getTen());
            ps.setString(3, sp.getNgayTao());
            ps.setString(4, sp.getNgayNhap());
            ps.setInt(5, sp.getTrangThai());
            int result = ps.executeUpdate();

            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    @Override
    public boolean update(SanPham sp) {
        boolean f = false;
        String sql = "update SanPham set ten = ?, ngay_tao = ?, ngay_nhap = ?, trang_thai = ? where ma = ?";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getTen());
            ps.setString(2, sp.getNgayTao());
            ps.setString(3, sp.getNgayNhap());
            ps.setInt(4, sp.getTrangThai());
            ps.setString(5, sp.getMa());
            int result = ps.executeUpdate();

            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    @Override
    public boolean delete(String ma) {
        boolean f = false;
        String sql = "delete from SanPham where ma = ?";
        
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
