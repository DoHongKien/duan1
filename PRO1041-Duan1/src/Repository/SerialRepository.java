/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Serial;
import Utility.DBConnection;
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
public class SerialRepository implements ISerial {

    private Connection conn;

    public SerialRepository() {
    }

    @Override
    public List<Serial> getAllSerial() {
        List<Serial> list = new ArrayList<>();
        String sql = "select * from Serial";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Serial serial = new Serial(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                list.add(serial);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public List<Serial> getSerialByIdCTSP(int idCTSP) {
        List<Serial> list = new ArrayList<>();
        String sql = "select * from Serial join ChiTietSanPham on Serial.id_ctsp = ChiTietSanPham.id where id_ctsp = ? and Serial.trang_thai = 0";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idCTSP);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Serial serial = new Serial(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                list.add(serial);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }
    
    @Override
    public int getIdByMa(String ma) {
        String sql = "select id from Serial where ma = ?";
        int idSerial = 0;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                idSerial = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return idSerial;
    }

    @Override
    public String getNameByIdCTSPAndMa(int idctsp, String ma) {
        String sql = "select 'Laptop ' + SanPham.ten + ' ' + MauSac.ten + ' ' + VGA.ten + ' ' + CPU.ten + ' ' + RAM.ten + ' ' + "
                + "OCung.ten from Serial join ChiTietSanPham on Serial.id_ctsp = ChiTietSanPham.id join SanPham on "
                + "ChiTietSanPham.id_san_pham = SanPham.id join CPU ON ChiTietSanPham.id_cpu = CPU.id join Hang ON "
                + "ChiTietSanPham.id_hang = Hang.id join ManHinh ON ChiTietSanPham.id_man_hinh = ManHinh.id join MauSac ON "
                + "ChiTietSanPham.id_mau_sac = MauSac.id join OCung ON ChiTietSanPham.id_o_cung = OCung.id join RAM ON "
                + "ChiTietSanPham.id_ram = RAM.id join VGA ON ChiTietSanPham.id_vga = VGA.id "
                + "where ChiTietSanPham.id = ? and Serial.ma = ?";
        String name = "";
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idctsp);
            ps.setString(2, ma);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                name = rs.getString(1);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return name;
    }

    @Override
    public boolean insert(Serial s) {
        String sql = "insert into Serial(id_ctsp, ma, ngay_tao, ngay_nhap, trang_thai) values(?,?,?,?,?)";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getIdCtsp());
            ps.setString(2, s.getMa());
            ps.setString(3, s.getNgayTao());
            ps.setString(4, s.getNgayNhap());
            ps.setInt(5, s.getTrangThai());
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
    public boolean updateTT(Serial s) {
        String sql = "update Serial set trang_thai = ? where id = ?";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getTrangThai());
            ps.setInt(2, s.getId());
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
        System.out.println(new SerialRepository().getNameByIdCTSPAndMa(22, "3467843873"));
    }
}
