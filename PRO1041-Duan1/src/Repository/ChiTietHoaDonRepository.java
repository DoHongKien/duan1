/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.ChiTietHoaDon;
import Utility.DBConnection;
import ViewModel.ChiTietHoaDonModel;
import ViewModel.HoaDonModel;
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
public class ChiTietHoaDonRepository implements IChiTietHoaDonRepository {

    private Connection conn;

    public ChiTietHoaDonRepository() {
    }

    @Override
    public List<HoaDonModel> getListHoaDon() {
        String sql = "Select h.ma, n.ten, k.ten, k.sdt, h.ngay_tao, h.ngay_thanh_toan, h.tong_tien, h.trang_thai From HoaDon "
                + "h join NhanVien n on h.id_nhan_vien = n.Id join KhachHang k on h.id_khach_hang = k.id";
        List<HoaDonModel> list = new ArrayList<>();

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HoaDonModel hoaDonModel = new HoaDonModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
                        rs.getDate(6), rs.getDouble(7), rs.getInt(8));
                list.add(hoaDonModel);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public List<ChiTietHoaDonModel> getCTHDByMa(String ma) {
        String sql = "select SanPham.ten +' '+ CPU.ten +' '+ Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ RAM.ten"
                + " +' '+ VGA.ten, ChiTietSanPham.gia_ban, KhuyenMai.gia_tri,ChiTietHoaDon.so_luong, ChiTietHoaDon.don_gia from ChiTietHoaDon "
                + "join ChiTietSanPham on ChiTietHoaDon.id_ctsp = ChiTietSanPham.id join SanPham ON ChiTietSanPham.id_san_pham = SanPham.id "
                + "join CPU ON ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id "
                + "join ManHinh ON ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id "
                + "join OCung ON ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id "
                + "join VGA ON ChiTietSanPham.id_vga = VGA.id join KhuyenMai on ChiTietHoaDon.id_khuyen_mai = KhuyenMai.id "
                + "join HoaDon on ChiTietHoaDon.id_hoa_don = HoaDon.id where HoaDon.ma = ?";
        List<ChiTietHoaDonModel> list = new ArrayList<>();

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ChiTietHoaDonModel cthdm = new ChiTietHoaDonModel(rs.getString(1), rs.getDouble(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5));
                list.add(cthdm);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public List<HoaDonModel> searchHoaDonByNameNV(String name) {
        String sql = "Select h.ma, n.ten, k.ten, k.sdt, h.ngay_tao, h.ngay_thanh_toan, h.tong_tien, h.trang_thai From HoaDon "
                + "h join NhanVien n on h.id_nhan_vien = n.Id join KhachHang k on h.id_khach_hang = k.id where n.ten LIKE N'%" + name + "%'";
        List<HoaDonModel> list = new ArrayList<>();

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HoaDonModel hoaDonModel = new HoaDonModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
                        rs.getDate(6), rs.getDouble(7), rs.getInt(8));
                list.add(hoaDonModel);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public List<HoaDonModel> filterHoaDonByNameTT(int trangThai) {
        String sql = "Select h.ma, n.ten, k.ten, k.sdt, h.ngay_tao, h.ngay_thanh_toan, h.tong_tien, h.trang_thai From HoaDon "
                + "h join NhanVien n on h.id_nhan_vien = n.Id join KhachHang k on h.id_khach_hang = k.id where h.trang_thai = ?";
        List<HoaDonModel> list = new ArrayList<>();

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, trangThai);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HoaDonModel hoaDonModel = new HoaDonModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
                        rs.getDate(6), rs.getDouble(7), rs.getInt(8));
                list.add(hoaDonModel);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public List<HoaDonModel> filterHoaDonByDate(String date, String startDate, String endDate) {
        String sql = "Select h.ma, n.ten, k.ten, k.sdt, h.ngay_tao, h.ngay_thanh_toan, h.tong_tien, h.trang_thai From HoaDon "
                + "h join NhanVien n on h.id_nhan_vien = n.Id join KhachHang k on h.id_khach_hang = k.id where h." + date + " between '" + startDate + "' and '" + endDate + "'";
        List<HoaDonModel> list = new ArrayList<>();

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HoaDonModel hoaDonModel = new HoaDonModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
                        rs.getDate(6), rs.getDouble(7), rs.getInt(8));
                list.add(hoaDonModel);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public boolean insertCTHD(ChiTietHoaDon cthd) {
        String sql = "insert into ChiTietHoaDon(id_ctsp, id_hoa_don, id_khuyen_mai, so_luong, don_gia, ngay_tao, "
                + "ngay_nhap, ghi_chu) values (?,?,?,?,?,?,?,?)";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cthd.getIdCtsp());
            ps.setInt(2, cthd.getIdHoaDon());
            ps.setInt(3, cthd.getIdKhuyenMai());
            ps.setInt(4, cthd.getSoLuong());
            ps.setDouble(5, cthd.getDonGia());
            ps.setString(6, cthd.getNgayTao());
            ps.setString(7, cthd.getNgayNhap());
            ps.setString(8, cthd.getGhiChu());
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
