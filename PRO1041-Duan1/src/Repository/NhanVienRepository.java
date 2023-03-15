/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.NhanVien;
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
public class NhanVienRepository implements NhanVienInterface {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection dbCon = new DBConnection();
    List<NhanVien> list = new ArrayList<>();

    @Override
    public List<NhanVien> getListDb() {
        String sql = "select * from NhanVien";
        List<NhanVien> list = new ArrayList<>();
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NhanVien(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getNString(4), rs.getString(5), rs.getNString(6),
                        rs.getString(7), rs.getNString(8), rs.getString(9),
                        rs.getString(10), rs.getString(11), rs.getInt(12)));
            }
            ps.close();
            rs.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
            return list;
        }
    }

    @Override
    public NhanVien getDB(String ma) {
        String sql = "select * from NhanVien where ma = ?";
        NhanVien nv = null;
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                nv = new NhanVien(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getNString(4), rs.getString(5), rs.getNString(6),
                        rs.getString(7), rs.getNString(8), rs.getString(9),
                        rs.getString(10), rs.getString(11), rs.getInt(12));
            }
            ps.close();
            rs.close();
            return nv;
        } catch (SQLException ex) {
            return nv;
        }
    }

    @Override
    public boolean create(NhanVien nv) {
        String sql = "insert into NhanVien(ma, ten, ngay_sinh, gioi_tinh, sdt,\n"
                + "dia_chi, ngay_tao, ngay_nhap, trang_thai)\n"
                + "values(?,?,?,?,?,?,?,?,?)";
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getNgaySinh());
            ps.setObject(4, nv.getGioiTinh());
            ps.setObject(5, nv.getSdt());
            ps.setObject(6, nv.getDiaChi());
            ps.setObject(7, nv.getNgayTao());
            ps.setObject(8, nv.getNgayNhap());
            ps.setObject(9, nv.getTrangThai());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean update(NhanVien nv) {
        String sql = "update NhanVien set  ma = ?, ten = ?, ngay_sinh = ?, gioi_tinh =?, sdt= ?, dia_chi=?, "
                + "ngay_tao = ?, ngay_nhap = ?, trang_thai = ? where id = ?";
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getNgaySinh());
            ps.setObject(4, nv.getGioiTinh());
            ps.setObject(5, nv.getSdt());
            ps.setObject(6, nv.getDiaChi());
            ps.setObject(7, nv.getNgayTao());
            ps.setObject(8, nv.getNgayNhap());
            ps.setObject(9, nv.getTrangThai());
            ps.setObject(10, nv.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(NhanVien nv) {
        String sql = "delete from NhanVien where ma = ?";
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, nv.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static void main(String[] args) {
        new NhanVienRepository().getListDb();

    }
}
