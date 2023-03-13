/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Cpu;
import Model.Hang;
import Utility.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author admin
 */
public class HangRepository implements IHangRepository {
 private Connection conn;
    public HangRepository() {
    }
 
    @Override
    public List<Hang> getListHang() {
        List<Hang> list = new ArrayList<>();
        String select = "select * from Hang";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               Hang hG = new Hang(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
                list.add(hG);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return list;  
    }

    @Override
    public boolean insert(Hang hG) {
         boolean f = false;
        String sql = "insert into Hang(ma, ten, ngay_tao, ngay_nhap, trang_thai) values (?,?,?,?,?)";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hG.getMa());
            ps.setString(2, hG.getTen());
            ps.setString(3, hG.getNgayTao());
            ps.setString(4, hG.getNgayNhap());
            ps.setInt(5, hG.getTrangThai());
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
    public boolean update(Hang hG) {
        boolean f = false;
        String sql = "update Hang set ten = ?, ngay_tao = ?, ngay_nhap = ?, trang_thai = ? where ma = ?";

        try {
            conn = new DBConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hG.getTen());
            ps.setString(2, hG.getNgayTao());
            ps.setString(3, hG.getNgayNhap());
            ps.setInt(4, hG.getTrangThai());
            ps.setString(5, hG.getMa());
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
        String sql = "delete from Hang where ma = ?";
        
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
