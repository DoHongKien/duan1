/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.NhanVien;
import Utility.DBConnection;
import ViewModel.RoleModel;
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
    public int getIdNVByMa(String ma) {
        String sql = "select id from NhanVien where ma = ?";
        int idNV = 0;
        
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while(rs.next()) {
                idNV = rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return idNV;
    }
    

    @Override
    public List<RoleModel> roleLogin(String username, String password) {
        List<RoleModel> listRM = new ArrayList<>();
        String sql = "select NhanVien.ma, ChucVu.chuc_vu from NhanVien join ChucVu on NhanVien.id_chuc_vu = ChucVu.id where ma = ? AND mat_khau = ?";

        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();

            while (rs.next()) {
                RoleModel roleModel = new RoleModel(rs.getString(1), rs.getString(2));
                listRM.add(roleModel);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return listRM;
    }

    @Override
    public boolean create(NhanVien nv) {
        String sql = "insert into NhanVien(ma, ten, ngay_sinh, gioi_tinh, sdt, dia_chi, ngay_tao, ngay_nhap, "
                + "trang_thai, mat_khau) values(?,?,?,?,?,?,?,?,?,?)";
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
            ps.setObject(10, nv.getMatKhau());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean update(NhanVien nv) {
        String sql = "update NhanVien set ten = ?, ngay_sinh = ?, gioi_tinh =?, sdt= ?, dia_chi=?,"
                + " ngay_nhap = ?, trang_thai = ? where ma = ?";
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, nv.getTen());
            ps.setObject(2, nv.getNgaySinh());
            ps.setObject(3, nv.getGioiTinh());
            ps.setObject(4, nv.getSdt());
            ps.setObject(5, nv.getDiaChi());
            ps.setObject(6, nv.getNgayNhap());
            ps.setObject(7, nv.getTrangThai());
            ps.setObject(8, nv.getMa());
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
        new NhanVienRepository().roleLogin("NV1", "1234");

    }
}
