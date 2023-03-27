/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.ChiTietSanPham;
import Utility.DBConnection;
import ViewModel.ChiTietSanPhamModel;
import java.sql.Statement;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ChiTietSanPhamRepository implements IChiTietSanPhamRepository {

    private Connection conn;

    // Hiển thị trên form Sản Phẩm và trên bảng sản phẩm ở form Bán Hàng
    @Override
    public List<ChiTietSanPhamModel> getListSanPham() {
        List<ChiTietSanPhamModel> list = new ArrayList<>();
        String sql = "select ChiTietSanPham.id, SanPham.ten, CPU.ten, Hang.ten, ManHinh.ten, MauSac.ten, OCung.ten, "
                + "RAM.ten, VGA.ten, so_luong_ton, gia_nhap, gia_ban, ChiTietSanPham.ngay_tao, ChiTietSanPham.ngay_nhap, "
                + "ChiTietSanPham.trang_thai from ChiTietSanPham join SanPham ON ChiTietSanPham.id_san_pham = SanPham.id join "
                + "CPU ON ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id join ManHinh ON "
                + "ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id join OCung ON "
                + "ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id join VGA ON ChiTietSanPham.id_vga = VGA.id";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ChiTietSanPhamModel chiTietSanPhamModel = new ChiTietSanPhamModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getDouble(11), rs.getDouble(12), rs.getString(13), rs.getString(14), rs.getInt(15));
                list.add(chiTietSanPhamModel);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    // Chức nằng tìm kiếm sản phẩm ở form Bán Hàng
    @Override
    public List<ChiTietSanPhamModel> timKiem(String ten) {
        List<ChiTietSanPhamModel> list = new ArrayList<>();
        String sql = "select ChiTietSanPham.id, SanPham.ten, CPU.ten, Hang.ten, ManHinh.ten, MauSac.ten, OCung.ten, "
                + "RAM.ten, VGA.ten, so_luong_ton, gia_nhap, gia_ban, ChiTietSanPham.ngay_tao, ChiTietSanPham.ngay_nhap, "
                + "ChiTietSanPham.trang_thai from ChiTietSanPham join SanPham ON ChiTietSanPham.id_san_pham = SanPham.id join "
                + "CPU ON ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id join ManHinh ON "
                + "ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id join OCung ON "
                + "ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id join VGA ON ChiTietSanPham.id_vga = VGA.id where SanPham.ten like '%" + ten + "%'";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ChiTietSanPhamModel chiTietSanPhamModel = new ChiTietSanPhamModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getDouble(11), rs.getDouble(12), rs.getString(13), rs.getString(14), rs.getInt(15));
                list.add(chiTietSanPhamModel);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public ChiTietSanPham getDonGiaById(int id) {
        String sql = "select gia_ban from ChiTietSanPham where id = ?";
        ChiTietSanPham ctsp = null;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSanPham ctsp1 = new ChiTietSanPham();
                ctsp1.setGiaBan(rs.getDouble(1));
                ctsp = ctsp1;
            }
            System.out.println(ctsp.getGiaBan());
        } catch (SQLException e) {
        }
        return ctsp;
    }

    // Chức năng thêm sản phẩm ở form Sản Phẩm
    @Override
    public boolean insert(ChiTietSanPham sp) {
        String sql = "insert into ChiTietSanPham(id_san_pham, id_cpu, id_hang, id_man_hinh, id_mau_sac , id_o_cung, id_ram, id_vga, so_luong_ton, gia_nhap, "
                + "gia_ban, ngay_tao, ngay_nhap, trang_thai) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        boolean f = false;
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, sp.getIdSanPham());
            ps.setObject(2, sp.getIdCpu());
            ps.setObject(3, sp.getIdHang());
            ps.setObject(4, sp.getIdManHinh());
            ps.setObject(5, sp.getIdMauSac());
            ps.setObject(6, sp.getIdOCung());
            ps.setObject(7, sp.getIdRam());
            ps.setObject(8, sp.getIdVga());
            ps.setObject(9, sp.getSlTon());
            ps.setObject(10, sp.getGiaNhap());
            ps.setObject(11, sp.getGiaBan());
            ps.setObject(12, sp.getNgayTao());
            ps.setObject(13, sp.getNgayNhap());
            ps.setObject(14, sp.getTrangThai());
            int result = ps.executeUpdate();

            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    // Chức năng update sản phẩm ở form Sản Phẩm
    @Override
    public boolean update(ChiTietSanPham sp) {
        String sql = "update ChiTietSanPham set id_san_pham = ?, id_cpu = ?, id_hang =?, id_man_hinh = ?, id_mau_sac = ?, id_o_cung = ?, id_ram = ?, "
                + "id_vga = ?, so_luong_ton = ?, gia_nhap = ?, gia_ban = ?, ngay_nhap = ?, trang_thai = ? where id = ?";
        boolean f = false;
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, sp.getIdSanPham());
            ps.setObject(2, sp.getIdCpu());
            ps.setObject(3, sp.getIdHang());
            ps.setObject(4, sp.getIdManHinh());
            ps.setObject(5, sp.getIdMauSac());
            ps.setObject(6, sp.getIdOCung());
            ps.setObject(7, sp.getIdRam());
            ps.setObject(8, sp.getIdVga());
            ps.setObject(9, sp.getSlTon());
            ps.setObject(10, sp.getGiaNhap());
            ps.setObject(11, sp.getGiaBan());
            ps.setObject(12, sp.getNgayNhap());
            ps.setObject(13, sp.getTrangThai());
            ps.setObject(14, sp.getId());
            int result = ps.executeUpdate();

            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    // Chức năng delete ở form Sản Phẩm
    @Override
    public boolean updateTT(ChiTietSanPham sp) {
        String sql = "update ChiTietSanPham set trang_thai = ? where id = ?";
        boolean f = false;
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, sp.getTrangThai());
            ps.setObject(2, sp.getId());
            int result = ps.executeUpdate();

            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    // Chức năng update serial vào ctsp ở form Bán Hàng
    @Override
    public boolean updateIdSerial(ChiTietSanPham sp) {
        String sql = "update ChiTietSanPham set id_serial = ? where id = ?";
        boolean f = false;
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, sp.getIdSerial());
            ps.setObject(2, sp.getId());
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
    public int getSoLuongByIdCTSP(int idCTSP) {
        String sql = "select so_luong_ton from ChiTietSanPham where id = ?";
        int soLuong = 0;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idCTSP);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                soLuong = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return soLuong;
    }

    @Override
    public boolean updateSoLuongByID(int soluong, int idCTSP) {
        String sql = "update ChiTietSanPham set so_luong_ton = ? where id = ?";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, soluong);
            ps.setInt(2, idCTSP);
            int result = ps.executeUpdate();

            if (result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(new ChiTietSanPhamRepository().getSoLuongByIdCTSP(9));
    }
}
