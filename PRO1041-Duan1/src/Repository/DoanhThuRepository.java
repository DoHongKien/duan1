/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utility.DBConnection;
import ViewModel.BieuDoModel;
import ViewModel.DoanhThuModel;
import ViewModel.SanPhamThongKeModel;
import ViewModel.ThongKeModel;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DoanhThuRepository implements IDoanhThuRepository {

    private Connection conn;

    @Override
    public List<ThongKeModel> getAllThongKe() {
        List<ThongKeModel> list = new ArrayList<>();
        String sql = "select SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ "
                + "RAM.ten +' '+ VGA.ten as 'ten san pham', ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban, "
                + "sum(so_luong) as 'so luong ban', sum(don_gia) as 'doanh thu' from ChiTietHoaDon join ChiTietSanPham "
                + "on ChiTietHoaDon.id_ctsp = ChiTietSanPham.id join SanPham ON ChiTietSanPham.id_san_pham = SanPham.id join CPU "
                + "ON ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id join ManHinh "
                + "ON ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id join OCung "
                + "ON ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id join VGA "
                + "ON ChiTietSanPham.id_vga = VGA.id"
                + "  group by SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ RAM.ten +' '+ VGA.ten, "
                + "ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeModel thongKeModel = new ThongKeModel(rs.getString(1), rs.getInt(2), rs.getLong(3), rs.getInt(4), rs.getLong(5));
                list.add(thongKeModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<ThongKeModel> getThongKeByNameSP(String name) {
        List<ThongKeModel> list = new ArrayList<>();
        String sql = "select SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ "
                + "RAM.ten +' '+ VGA.ten as 'ten san pham', ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban, "
                + "sum(so_luong) as 'so luong ban', sum(don_gia) as 'doanh thu' from ChiTietHoaDon join ChiTietSanPham "
                + "on ChiTietHoaDon.id_ctsp = ChiTietSanPham.id join SanPham ON ChiTietSanPham.id_san_pham = SanPham.id join CPU "
                + "ON ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id join ManHinh "
                + "ON ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id join OCung "
                + "ON ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id join VGA "
                + "ON ChiTietSanPham.id_vga = VGA.id where SanPham.ten = '" + name + "'"
                + "  group by SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ RAM.ten +' '+ VGA.ten, "
                + "ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeModel thongKeModel = new ThongKeModel(rs.getString(1), rs.getInt(2), rs.getLong(3), rs.getInt(4), rs.getLong(5));
                list.add(thongKeModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<ThongKeModel> sortThongKeDoanhThuAsc() {
        List<ThongKeModel> list = new ArrayList<>();
        String sql = "select SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ "
                + "RAM.ten +' '+ VGA.ten as 'ten san pham', ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban, "
                + "sum(so_luong) as 'so luong ban', sum(don_gia) as 'doanh thu' from ChiTietHoaDon join ChiTietSanPham "
                + "on ChiTietHoaDon.id_ctsp = ChiTietSanPham.id join SanPham ON ChiTietSanPham.id_san_pham = SanPham.id join CPU "
                + "ON ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id join ManHinh "
                + "ON ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id join OCung "
                + "ON ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id join VGA "
                + "ON ChiTietSanPham.id_vga = VGA.id"
                + "  group by SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ RAM.ten +' '+ VGA.ten, "
                + "ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban order by [doanh thu] asc";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeModel thongKeModel = new ThongKeModel(rs.getString(1), rs.getInt(2), rs.getLong(3), rs.getInt(4), rs.getLong(5));
                list.add(thongKeModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<ThongKeModel> sortThongKeDoanhThuDesc() {
        List<ThongKeModel> list = new ArrayList<>();
        String sql = "select SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ "
                + "RAM.ten +' '+ VGA.ten as 'ten san pham', ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban, "
                + "sum(so_luong) as 'so luong ban', sum(don_gia) as 'doanh thu' from ChiTietHoaDon join ChiTietSanPham "
                + "on ChiTietHoaDon.id_ctsp = ChiTietSanPham.id join SanPham ON ChiTietSanPham.id_san_pham = SanPham.id join CPU "
                + "ON ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id join ManHinh "
                + "ON ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id join OCung "
                + "ON ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id join VGA "
                + "ON ChiTietSanPham.id_vga = VGA.id"
                + "  group by SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ RAM.ten +' '+ VGA.ten, "
                + "ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban order by [doanh thu] desc";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeModel thongKeModel = new ThongKeModel(rs.getString(1), rs.getInt(2), rs.getLong(3), rs.getInt(4), rs.getLong(5));
                list.add(thongKeModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<ThongKeModel> sortThongKeSanPhamAsc() {
        List<ThongKeModel> list = new ArrayList<>();
        String sql = "select SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ "
                + "RAM.ten +' '+ VGA.ten as 'ten san pham', ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban, "
                + "sum(so_luong) as 'so luong ban', sum(don_gia) as 'doanh thu' from ChiTietHoaDon join ChiTietSanPham "
                + "on ChiTietHoaDon.id_ctsp = ChiTietSanPham.id join SanPham ON ChiTietSanPham.id_san_pham = SanPham.id join CPU "
                + "ON ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id join ManHinh "
                + "ON ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id join OCung "
                + "ON ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id join VGA "
                + "ON ChiTietSanPham.id_vga = VGA.id"
                + "  group by SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ RAM.ten +' '+ VGA.ten, "
                + "ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban order by [so luong ban] asc";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeModel thongKeModel = new ThongKeModel(rs.getString(1), rs.getInt(2), rs.getLong(3), rs.getInt(4), rs.getLong(5));
                list.add(thongKeModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<ThongKeModel> sortThongKeSanPhamDesc() {
        List<ThongKeModel> list = new ArrayList<>();
        String sql = "select SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ "
                + "RAM.ten +' '+ VGA.ten as 'ten san pham', ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban, "
                + "sum(so_luong) as 'so luong ban', sum(don_gia) as 'doanh thu' from ChiTietHoaDon join ChiTietSanPham "
                + "on ChiTietHoaDon.id_ctsp = ChiTietSanPham.id join SanPham ON ChiTietSanPham.id_san_pham = SanPham.id join CPU "
                + "ON ChiTietSanPham.id_cpu = CPU.id join Hang ON ChiTietSanPham.id_hang = Hang.id join ManHinh "
                + "ON ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON ChiTietSanPham.id_mau_sac = MauSac.id join OCung "
                + "ON ChiTietSanPham.id_o_cung = OCung.id join RAM ON ChiTietSanPham.id_ram = RAM.id join VGA "
                + "ON ChiTietSanPham.id_vga = VGA.id"
                + "  group by SanPham.ten + ' ' + CPU.ten + ' ' + Hang.ten +' '+ ManHinh.ten +' '+ MauSac.ten +' '+ OCung.ten +' '+ RAM.ten +' '+ VGA.ten, "
                + "ChiTietSanPham.so_luong_ton, ChiTietSanPham.gia_ban order by [so luong ban] desc";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeModel thongKeModel = new ThongKeModel(rs.getString(1), rs.getInt(2), rs.getLong(3), rs.getInt(4), rs.getLong(5));
                list.add(thongKeModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public int sumThongKeSanPhamDangBan() {
        int tong = 0;
        String sql = "select count(*) from ChiTietSanPham where trang_thai = 0";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tong = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return tong;
    }

    @Override
    public int sumThongKeSanPhamNgungBan() {
        int tong = 0;
        String sql = "select count(*) from ChiTietSanPham where trang_thai = 1";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tong = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return tong;
    }

    @Override
    public int sumThongKeSanPhamHetHang() {
        int tong = 0;
        String sql = "select count(*) from ChiTietSanPham where so_luong_ton = 0";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tong = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return tong;
    }

    @Override
    public List<DoanhThuModel> getAllDoanhThu() {
        List<DoanhThuModel> list = new ArrayList<>();
        String sql = "select ngay_tao, sum(don_gia) as 'doanh thu', count(ngay_tao) as 'so hoa don'  from ChiTietHoaDon where ngay_tao IS NOT NULL"
                + "  group by ngay_tao";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DoanhThuModel doanhThuModel = new DoanhThuModel(rs.getString(1), rs.getLong(2), rs.getInt(3));
                list.add(doanhThuModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<DoanhThuModel> getDoanhThuByDate(String start, String end) {
        List<DoanhThuModel> list = new ArrayList<>();
        String sql = "select ngay_tao, sum(don_gia) as 'doanh thu', count(ngay_tao) as 'so hoa don'  from ChiTietHoaDon where ngay_tao IS NOT NULL and ngay_tao between ? and ?"
                + "  group by ngay_tao";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, start);
            ps.setObject(2, end);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DoanhThuModel doanhThuModel = new DoanhThuModel(rs.getString(1), rs.getLong(2), rs.getInt(3));
                list.add(doanhThuModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public Long sumThongKeDoanhThuByYear(int year) {
        long tong = 0;
        String sql = "select sum(don_gia) from ChiTietHoaDon where YEAR(ngay_tao) = " + year + "";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tong = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return tong;
    }

    @Override
    public Long sumThongKeDoanhThuByMonth(int month) {
        long tong = 0;
        String sql = "select sum(don_gia) from ChiTietHoaDon where MONTH(ngay_tao) = " + month + "";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tong = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return tong;
    }

    @Override
    public Long sumThongKeDoanhThuByDay() {
        long tong = 0;
        String sql = "select sum(don_gia) from ChiTietHoaDon where ngay_tao = ?";
        LocalDate now = LocalDate.now();
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(now));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tong = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return tong;
    }

    @Override
    public List<BieuDoModel> getBieuDo() {
        List<BieuDoModel> list = new ArrayList<>();
        String sql = "WITH CTE AS ("
                + "    SELECT"
                + "        YEAR(cthd.ngay_tao) AS Nam, "
                + "        MONTH(cthd.ngay_tao) AS Thang, "
                + "        COUNT(cthd.id_ctsp) AS SoLuongSanPham "
                + "    FROM "
                + "        ChiTietHoaDon cthd "
                + "    WHERE\n"
                + "        cthd.ngay_tao >= DATEADD(month, -11, GETDATE()) "
                + "    GROUP BY "
                + "        YEAR(cthd.ngay_tao), "
                + "        MONTH(cthd.ngay_tao) "
                + ") "
                + "SELECT "
                + "    ThangNam.Nam, "
                + "    ThangNam.Thang, "
                + "    ISNULL(CTE.SoLuongSanPham, 0) AS SoLuongSanPham "
                + "FROM "
                + "    ( "
                + "        SELECT "
                + "            YEAR(GETDATE()) AS Nam, "
                + "            1 AS Thang "
                + "        UNION ALL "
                + "        SELECT "
                + "            YEAR(GETDATE()) AS Nam, "
                + "            2 AS Thang "
                + "        UNION ALL "
                + "        SELECT "
                + "            YEAR(GETDATE()) AS Nam, "
                + "            3 AS Thang "
                + "        UNION ALL "
                + "        SELECT "
                + "            YEAR(GETDATE()) AS Nam, "
                + "            4 AS Thang "
                + "        UNION ALL "
                + "        SELECT "
                + "            YEAR(GETDATE()) AS Nam,\n"
                + "            5 AS Thang\n"
                + "        UNION ALL\n"
                + "        SELECT\n"
                + "            YEAR(GETDATE()) AS Nam,\n"
                + "            6 AS Thang\n"
                + "        UNION ALL\n"
                + "        SELECT\n"
                + "            YEAR(GETDATE()) AS Nam,\n"
                + "            7 AS Thang\n"
                + "        UNION ALL\n"
                + "        SELECT\n"
                + "            YEAR(GETDATE()) AS Nam,\n"
                + "            8 AS Thang\n"
                + "        UNION ALL\n"
                + "        SELECT\n"
                + "            YEAR(GETDATE()) AS Nam,\n"
                + "            9 AS Thang\n"
                + "        UNION ALL\n"
                + "        SELECT\n"
                + "            YEAR(GETDATE()) AS Nam,\n"
                + "            10 AS Thang\n"
                + "        UNION ALL\n"
                + "        SELECT\n"
                + "            YEAR(GETDATE()) AS Nam,\n"
                + "            11 AS Thang\n"
                + "        UNION ALL\n"
                + "        SELECT\n"
                + "            YEAR(GETDATE()) AS Nam,\n"
                + "            12 AS Thang\n"
                + "    ) AS ThangNam\n"
                + "LEFT JOIN\n"
                + "    CTE ON ThangNam.Nam = CTE.Nam AND ThangNam.Thang = CTE.Thang\n"
                + "ORDER BY\n"
                + "    ThangNam.Nam,\n"
                + "    ThangNam.Thang;";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                BieuDoModel bieuDoModel = new BieuDoModel(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                list.add(bieuDoModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<SanPhamThongKeModel> getSanPhamDoanhThu(int nam) {
        List<SanPhamThongKeModel> list = new ArrayList<>();
        String sql = "select SanPham.ten, sum(ChiTietHoaDon.don_gia) from ChiTietHoaDon join ChiTietSanPham on "
                + "ChiTietHoaDon.id_ctsp = ChiTietSanPham.id join SanPham on ChiTietSanPham.id_san_pham = SanPham.id "
                + "where YEAR(ChiTietHoaDon.ngay_tao) = ? "
                + "group by SanPham.ten";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nam);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SanPhamThongKeModel keModel = new SanPhamThongKeModel(rs.getString(1), rs.getLong(2));
                list.add(keModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }
}
