/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Ram;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class RamRepository implements IRAMRepository {

    private Connection conn;

    public RamRepository() {

    }

    @Override
    public List<Ram> getAllRam() {
        List<Ram> list = new ArrayList<>();
        String select = "select * from RAM";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ram ram = new Ram(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                list.add(ram);
            }
            for (Ram ram : list) {
                System.out.println(ram.toString());
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public boolean insert(Ram ram) {
        boolean f = false;
        String sql = "insert into RAM(ma, ten, ngay_tao, ngay_nhap, trang_thai) values (?,?,?,?,?)";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ram.getMa());
            ps.setString(2, ram.getTen());
            ps.setString(3, ram.getNgayTao());
            ps.setString(4, ram.getNgayNhap());
            ps.setInt(5, ram.getTrangThai());
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
    public boolean update(Ram ram) {
        boolean f = false;
        String sql = "update RAM set ten = ?, ngay_nhap = ?, trang_thai = ? where ma = ?";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ram.getTen());
            ps.setString(2, ram.getNgayNhap());
            ps.setInt(3, ram.getTrangThai());
            ps.setString(4, ram.getMa());
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
    public boolean delete(String ma) {
        boolean f = false;
        String sql = "delete from RAM where ma = ?";

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
    public static void main(String[] args) {
        new RamRepository().getAllRam();
        
    }
}
