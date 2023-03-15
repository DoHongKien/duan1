/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.KhachHang;
import Utility.DBConnection;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quyen
 */
public class KhachHangRepository implements KhachHangInterface {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection dbCon = new DBConnection();
    @Override
    public List<KhachHang> getListDB() {
        String sql = "select * from KhachHang";
        List<KhachHang> list = new ArrayList<>();
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getNString(3),
                        rs.getString(4), rs.getNString(5),
                        rs.getString(6), rs.getNString(7),
                        rs.getString(8), rs.getString(9), rs.getInt(10)));
            }
            ps.close();
            rs.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return list;
        }
    }

    @Override
    public KhachHang getDB(String ma) {
        String sql = "Select * from KhachHang where ma = ?";
        KhachHang kh = null;
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                kh = new KhachHang(rs.getInt(1), rs.getString(2), rs.getNString(3),
                        rs.getString(4), rs.getNString(5),
                        rs.getString(6), rs.getNString(7),
                        rs.getString(8), rs.getString(9), rs.getInt(10));
            }
            ps.close();
            rs.close();
            return kh;
        } catch (SQLException ex) {
            return kh;
        }
    }

    @Override
    public boolean create(KhachHang kh) {
        String sql = "insert into KhachHang (ma, ten ,ngay_sinh, gioi_tinh, sdt, dia_chi, ngay_tao, ngay_nhap, trang_thai) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getNgaySinh());
            ps.setObject(4, kh.getGioiTinh());
            ps.setObject(5, kh.getSdt());
            ps.setObject(6, kh.getDiaChi());
            ps.setObject(7, kh.getNgayTao());
            ps.setObject(8, kh.getNgayNhap());
            ps.setObject(9, kh.getTrangThai());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean update(KhachHang kh) {
        String sql = "update KhachHang set ma = ?,ten = ?,ngay_sinh = ?, gioi_tinh = ?, sdt = ?,"
                + " dia_chi = ?, ngay_tao = ?, ngay_nhap = ?, trang_thai = ? where id = ?";
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getNgaySinh());
            ps.setObject(4, kh.getGioiTinh());
            ps.setObject(5, kh.getSdt());
            ps.setObject(6, kh.getDiaChi());
            ps.setObject(7, kh.getNgayTao());
            ps.setObject(8, kh.getNgayNhap());
            ps.setObject(9, kh.getTrangThai());
            ps.setObject(10, kh.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(KhachHang kh) {
        String sql = "delete from KhachHang where ma = ?";
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, kh.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
