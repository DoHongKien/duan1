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
                KhuyenMai khuyenMai = new KhuyenMai(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                list.add(khuyenMai);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return list;
    }

    @Override
    public int getGiaTriByDieuKien(double dieuKien, String date, int trangThai) {
        int giaTri = 0;
        String sql = "select distinct top 1 gia_tri from KhuyenMai where dieu_kien <= ? and ngay_tao <= ? and "
                + "ngay_het_han >= ? and trang_thai = ? order by gia_tri DESC";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, dieuKien);
            ps.setString(2, date);
            ps.setString(3, date);
            ps.setInt(4, trangThai);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                giaTri = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return giaTri;
    }

    @Override
    public int getIdByGiaTri(int giaTri) {
        String sql = "select id from KhuyenMai where gia_tri = ?";
        int id = 0;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, giaTri);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return id;
    }

    @Override
    public Boolean insert(KhuyenMai km) {
        boolean f = false;
        String sql = "insert into KhuyenMai(ma, gia_tri, ngay_tao, ngay_het_han, trang_thai, dieu_kien) values (?,?,?,?,?,?)";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, km.getMa());
            ps.setInt(2, km.getGiaTri());
            ps.setString(3, km.getNgayTao());
            ps.setString(4, km.getNgayHetHan());
            ps.setInt(5, km.getTrangThai());
            ps.setInt(6, km.getDieuKien());
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
    public Boolean update(KhuyenMai km) {
        boolean f = false;
        String sql = "update KhuyenMai set gia_tri = ?, ngay_tao = ?, ngay_het_han = ?, ngay_nhap = ?, trang_thai = ?, dieu_kien = ? where ma = ?";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, km.getGiaTri());
            ps.setString(2, km.getNgayTao());
            ps.setString(3, km.getNgayHetHan());
            ps.setString(4, km.getNgayNhap());
            ps.setInt(5, km.getTrangThai());
            ps.setInt(6, km.getDieuKien());
            ps.setString(7, km.getMa());
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
    public Boolean delete(String ma) {
        boolean f = false;
        String sql = "delete from KhuyenMai where ma = ?";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);

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
    public List<KhuyenMai> fiterByStartDate(String date) {
        String select = "select * from KhuyenMai where ngay_tao > '" + date + "'";
        List<KhuyenMai> list = new ArrayList<>();
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhuyenMai(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<KhuyenMai> fiterByEndDate(String date) {
        String select = "select * from KhuyenMai where ngay_het_han < '" + date + "'";
        List<KhuyenMai> list = new ArrayList<>();
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhuyenMai(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<KhuyenMai> fiterByBetweenDate(String date) {
        String select = "select * from KhuyenMai where ngay_tao <= '" + date + "' AND ngay_het_han >= '" + date + "'";
        List<KhuyenMai> list = new ArrayList<>();
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhuyenMai(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return list;
    }
}
