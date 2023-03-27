/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.ChiTietSanPham;
import Model.HoaDon;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IBanHangRepository {
    
    public List<HoaDon> getAllHoaDon();
    
    public List<ChiTietSanPham> findProductDetailByName(String name);
    
    public int getIdByMa(String ma);
    
    public boolean insert(HoaDon hoaDon);
    
    public boolean updateHDC(HoaDon hoaDon);
    
    public boolean update(HoaDon hoaDon);
}
