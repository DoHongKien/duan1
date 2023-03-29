/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.ChiTietGioHang;
import Utility.DBConnection;
import ViewModel.ChiTietGioHangModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChiTietGioHangRepository implements IChiTietGioHangRepository {

    private Connection conn;

    public ChiTietGioHangRepository() {
    }

    @Override
    public List<ChiTietGioHangModel> getAllCTGH() {
        List<ChiTietGioHangModel> list = new ArrayList<>();
        String sql = "select ChiTietGioHang.id, ChiTietSanPham.id, ChiTietGioHang.don_gia, ChiTietGioHang.so_luong, ChiTietGioHang.trang_thai, SanPham.ten, CPU.ten, Hang.ten, "
                + "ManHinh.ten, MauSac.ten, OCung.ten, RAM.ten, VGA.ten from ChiTietGioHang join ChiTietSanPham on "
                + "ChiTietGioHang.id_ctsp = ChiTietSanPham.id join SanPham ON ChiTietSanPham.id_san_pham = SanPham.id join CPU ON "
                + "ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id join ManHinh ON "
                + "ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id join OCung ON "
                + "ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id join VGA ON ChiTietSanPham.id_vga = VGA.id";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ChiTietGioHangModel ctghm = new ChiTietGioHangModel(rs.getInt(1), rs.getInt(2),rs.getDouble(3), rs.getInt(4), rs.getInt(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));
                list.add(ctghm);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public List<ChiTietGioHangModel> getCTGHByIdHoaDon(int id) {
        List<ChiTietGioHangModel> list = new ArrayList<>();
        String sql = "select ChiTietGioHang.id, ChiTietSanPham.id, ChiTietGioHang.don_gia, ChiTietGioHang.so_luong, ChiTietGioHang.trang_thai, "
                + "SanPham.ten, CPU.ten, Hang.ten, ManHinh.ten, MauSac.ten, OCung.ten, RAM.ten, VGA.ten from ChiTietGioHang "
                + "join ChiTietSanPham on ChiTietGioHang.id_ctsp = ChiTietSanPham.id join SanPham ON ChiTietSanPham.id_san_pham "
                + "= SanPham.id join CPU ON ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id join ManHinh "
                + "ON ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id join OCung ON "
                + "ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id join VGA ON ChiTietSanPham.id_vga = "
                + "VGA.id join GioHang on ChiTietGioHang.id_gio_hang = GioHang.id join HoaDon on HoaDon.id = GioHang.id_hoa_don where "
                + "HoaDon.id = " + id;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ChiTietGioHangModel ctghm = new ChiTietGioHangModel(rs.getInt(1), rs.getInt(2),rs.getDouble(3), rs.getInt(4), rs.getInt(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));
                list.add(ctghm);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public boolean insert(ChiTietGioHang ctgh) {
        String sql = "insert into ChiTietGioHang(id_ctsp, so_luong, don_gia, ngay_tao, ngay_nhap, trang_thai) values(?,?,?,?,?,?)";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ctgh.getIdCTSP());
            ps.setInt(2, ctgh.getSoLuong());
            ps.setDouble(3, ctgh.getDonGia());
            ps.setString(4, ctgh.getNgayTao());
            ps.setString(5, ctgh.getNgayNhap());
            ps.setInt(6, ctgh.getTrangThai());
            int result = ps.executeUpdate();

            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    // Chức năng update khi ấn vào hóa đơn chờ
    @Override
    public boolean update(ChiTietGioHang ctgh) {
        String sql = "update ChiTietGioHang set id_gio_hang = ?, trang_thai = ? where id = ?";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ctgh.getIdGioHang());
            ps.setInt(2, ctgh.getTrangThai());
            ps.setInt(3, ctgh.getId());

            int result = ps.executeUpdate();

            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    // update số lượng khi ấn thêm vào giỏ hàng form bán hàng
    @Override
    public boolean updateSoLuong(ChiTietGioHang ctgh) {
        String sql = "update ChiTietGioHang set so_luong = ? where id_ctsp = ?";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ctgh.getSoLuong());
            ps.setInt(2, ctgh.getIdCTSP());

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
    public boolean updateTrangThai(int tt, int id) {
        String sql = "update ChiTietGioHang set trang_thai = ? where id = ?";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, tt);
            ps.setInt(2, id);

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
    public boolean delete(int id) {
        String sql = "delete from ChiTietGioHang where id = ?";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

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
