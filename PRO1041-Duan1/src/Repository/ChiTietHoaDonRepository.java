/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.ChiTietHoaDon;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class ChiTietHoaDonRepository implements IChiTietHoaDonRepository {

    private Connection conn;

    public ChiTietHoaDonRepository() {
    }

    @Override
    public boolean insertCTHD(ChiTietHoaDon cthd, int giaTri) {
        String sql = "insert into ChiTietHoaDon(id_ctsp, id_hoa_don, id_khuyen_mai, so_luong, don_gia, ngay_tao, "
                + "ngay_nhap, ghi_chu) values (?,?,?,?,?,?,?,?)";
        
        String sqlNo = "insert into ChiTietHoaDon(id_ctsp, id_hoa_don, so_luong, don_gia, ngay_tao, "
                + "ngay_nhap, ghi_chu) values (?,?,?,?,?,?,?)";
        boolean f = false;

        try {
            conn = new DBConnection().getConnection();
            if (giaTri != 0) {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, cthd.getIdCtsp());
                ps.setInt(2, cthd.getIdHoaDon());
                ps.setInt(3, cthd.getIdKhuyenMai());
                ps.setInt(4, cthd.getSoLuong());
                ps.setDouble(5, cthd.getDonGia());
                ps.setString(6, cthd.getNgayTao());
                ps.setString(7, cthd.getNgayNhap());
                ps.setString(8, cthd.getGhiChu());
                int result = ps.executeUpdate();

                if (result == 1) {
                    f = true;
                }
            } else {
                PreparedStatement ps = conn.prepareStatement(sqlNo);
                ps.setInt(1, cthd.getIdCtsp());
                ps.setInt(2, cthd.getIdHoaDon());
                ps.setInt(3, cthd.getSoLuong());
                ps.setDouble(4, cthd.getDonGia());
                ps.setString(5, cthd.getNgayTao());
                ps.setString(6, cthd.getNgayNhap());
                ps.setString(7, cthd.getGhiChu());
                int result = ps.executeUpdate();

                if (result == 1) {
                    f = true;
                }
            }

        } catch (SQLException e) {
            e.getMessage();
        }

        return f;
    }

}
