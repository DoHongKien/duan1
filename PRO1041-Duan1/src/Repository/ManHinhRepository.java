/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Hang;
import Model.ManHinh;
import Utility.DBConnection;
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
public class ManHinhRepository implements IManHinhRepository{
    private Connection conn;

    public ManHinhRepository() {
    }
 
    @Override
    public List<ManHinh> getListManHinh() {
        List<ManHinh> list = new ArrayList<>();
        String select = "select * from ManHinh";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               ManHinh mH = new ManHinh(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
                list.add(mH);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return list;      }

    @Override
    public boolean insert(ManHinh mH) {
         boolean f = false;
        String sql = "insert into ManHinh(ma, ten, ngay_tao, ngay_nhap, trang_thai) values (?,?,?,?,?)";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mH.getMa());
            ps.setString(2, mH.getTen());
            ps.setString(3, mH.getNgayTao());
            ps.setString(4, mH.getNgayNhap());
            ps.setInt(5, mH.getTrangThai());
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
    public boolean update(ManHinh mH) {
        boolean f = false;
        String sql = "update ManHinh set ten = ?, ngay_tao = ?, ngay_nhap = ?, trang_thai = ? where ma = ?";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mH.getTen());
            ps.setString(2, mH.getNgayTao());
            ps.setString(3, mH.getNgayNhap());
            ps.setInt(4, mH.getTrangThai());
            ps.setString(5, mH.getMa());
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
        String sql = "delete from ManHinh where ma = ?";
        
        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);

            int result = ps.executeUpdate();
            
            if(result == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return f;
    }
    
}
