/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Cpu;
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
public class CPURepotsitory implements ICPURepotsitory {

    private Connection conn;

    public CPURepotsitory() {
    }

    @Override
    public List<Cpu> getListCPU() {
        List<Cpu> list = new ArrayList<>();
        String select = "select * from CPU";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cpu cpu = new Cpu(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                list.add(cpu);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return list;
    }

    @Override
    public boolean insert(Cpu cp) {
        boolean f = false;
        String sql = "insert into CPU(ma, ten, ngay_tao, ngay_nhap, trang_thai) values (?,?,?,?,?)";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cp.getMa());
            ps.setString(2, cp.getTen());
            ps.setString(3, cp.getNgayTao());
            ps.setString(4, cp.getNgayNhap());
            ps.setInt(5, cp.getTrangThai());
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
    public boolean update(Cpu cp) {
        boolean f = false;
        String sql = "update CPU set ten = ?, ngay_nhap = ?, trang_thai = ? where ma = ?";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cp.getTen());
            ps.setString(2, cp.getNgayNhap());
            ps.setInt(3, cp.getTrangThai());
            ps.setString(4, cp.getMa());
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
        String sql = "delete from CPU where ma = ?";

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

}
