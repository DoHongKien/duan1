/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.OCung;
import Utility.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class OCungRepository implements IOCungRepository {

    private Connection conn;

    public OCungRepository() {

    }

    @Override
    public List<OCung> getAllOCung() {
        List<OCung> list = new ArrayList<>();
        String select = "select * from OCung";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                OCung oCung = new OCung(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                list.add(oCung);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public boolean insert(OCung oc) {
        boolean f = false;
        String sql = "insert into OCung(ma, ten, ngay_tao, ngay_nhap, trang_thai) values (?,?,?,?,?)";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, oc.getMa());
            ps.setString(2, oc.getTen());
            ps.setString(3, oc.getNgayTao());
            ps.setString(4, oc.getNgayNhap());
            ps.setInt(5, oc.getTrangThai());
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
    public boolean update(OCung oc) {
        boolean f = false;
        String sql = "update OCung set ten = ?, ngay_nhap = ?, trang_thai = ? where ma = ?";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, oc.getTen());
            ps.setString(2, oc.getNgayNhap());
            ps.setInt(3, oc.getTrangThai());
            ps.setString(4, oc.getMa());
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
        String sql = "delete from OCung where ma = ?";

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
        new OCungRepository().getAllOCung();
        
    }
}
