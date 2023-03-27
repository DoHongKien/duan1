/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.ChiTietGioHang;
import ViewModel.ChiTietGioHangModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IChiTietGioHangService {
    
    public List<ChiTietGioHangModel> getAllCTGH();
    
    public List<ChiTietGioHangModel> getCTGHByIdHoaDon(int id);
    
    public boolean insert(ChiTietGioHang ctgh);
    
    public boolean update(ChiTietGioHang ctgh);
    
    public boolean updateSoLuong(ChiTietGioHang ctgh);
    
    public boolean updateTrangThai(int tt, int id);
}
