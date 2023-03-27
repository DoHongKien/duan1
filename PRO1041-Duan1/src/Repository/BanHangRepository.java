/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.ChiTietSanPham;
import Model.HoaDon;
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
public class BanHangRepository implements IBanHangRepository {

    private Connection conn;

    @Override
    public List<HoaDon> getAllHoaDon() {
        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getInt(9)));
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    // Lấy chi tiết hóa đơn qua tên sản phẩm
    @Override
    public List<ChiTietSanPham> findProductDetailByName(String name) {
        List<ChiTietSanPham> list = new ArrayList<>();
        String sql = "select * from ChiTietSanPham where ten = ?";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    // Lấy id qua mã nhân viên trên input để thêm vào hóa đơn
    @Override
    public int getIdByMa(String ma) {
        String sql = "select id from NhanVien where ma = ?";
        int id = 0;
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return id;
    }

    // Tạo hóa đơn
    @Override
    public boolean insert(HoaDon hoaDon) {
        String sql = "insert into HoaDon(id_nhan_vien, id_khach_hang, ngay_tao, trang_thai) values (?,?,?,?)";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, hoaDon.getIdNhanVien());
            ps.setInt(2, hoaDon.getIdKhachHang());
            ps.setString(3, hoaDon.getNgayTao());
            ps.setInt(4, hoaDon.getTrangThai());
            int result = ps.executeUpdate();

            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    // Sửa trạng thái hóa đơn chờ
    @Override
    public boolean updateHDC(HoaDon hoaDon) {
        String sql = "update HoaDon set id_nhan_vien = ?, id_khach_hang = ?, trang_thai = ? Where id = ?";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, hoaDon.getIdNhanVien());
            ps.setInt(2, hoaDon.getIdKhachHang());
            ps.setInt(3, hoaDon.getTrangThai());
            ps.setInt(4, hoaDon.getId());

            int result = ps.executeUpdate();
            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    // update hóa đơn khi ấn thanh toán
    @Override
    public boolean update(HoaDon hoaDon) {
        String sql = "update HoaDon set id_nhan_vien = ?, id_khach_hang = ?, ma = ?, ngay_thanh_toan = ?, tong_tien = ?, trang_thai = ? Where id = ?";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, hoaDon.getIdNhanVien());
            ps.setInt(2, hoaDon.getIdKhachHang());
            ps.setString(3, hoaDon.getMa());
            ps.setString(4, hoaDon.getNgayThanhToan());
            ps.setDouble(5, hoaDon.getTongtien());
            ps.setInt(6, hoaDon.getTrangThai());
            ps.setInt(7, hoaDon.getId());
            int result = ps.executeUpdate();

            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

}
