/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Vga;
import Utility.DBConnection;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author quyen
 */
public class VGARepository  implements VGAInterface{
    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection dbCon = new DBConnection();
    ArrayList<Vga> list;
    
    @Override
    public List<Vga> getListDb() {
       String sql = "select * from VGA";
       List<Vga> list = new ArrayList<>();
        try {
            ps= dbCon.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Vga(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(VGARepository.class.getName()).log(Level.SEVERE, null, ex);
            return list;
        }
    }

    @Override
    public Vga getDB(String ma) {
        String sql = "Select * from VGA where ma = ?";
        Vga vga = null;
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                vga = new Vga(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
            }
            ps.close();
            rs.close();
            return vga;
        } catch (SQLException ex) {
             return vga;
        }
       
    }

    @Override
    public boolean create(Vga vga) {
        String sql = "insert into VGA (ma, ten , ngay_tao, ngay_nhap, trang_thai) values (?, ?, ?, ?, ?)";
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, vga.getMa());
            ps.setObject(2, vga.getTen());
            ps.setObject(3, vga.getNgayTao());
            ps.setObject(4, vga.getNgayNhap());
            ps.setObject(5, vga.getTrangThai());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VGARepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean update(Vga vga) {
        String sql = "update VGA set ma = ?,ten = ?, ngay_nhap = ?, trang_thai = ? where id = ?";
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, vga.getMa());
            ps.setObject(2, vga.getTen());
            ps.setObject(3, vga.getNgayNhap());
            ps.setObject(4, vga.getTrangThai());
            ps.setObject(5, vga.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VGARepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(Vga vga) {
        String sql = "delete from VGA where ma = ?";
        try {
            ps = dbCon.getConnection().prepareStatement(sql);
            ps.setObject(1, vga.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VGARepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static void main(String[] args) {
        new VGARepository().getListDb();
    }
    
}
