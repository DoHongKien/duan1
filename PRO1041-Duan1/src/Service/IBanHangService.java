/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.HoaDon;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IBanHangService {
    
    public List<HoaDon> getAllHoaDon();

    public int getIdByMa(String ma);
    
    public String insert(HoaDon hoaDon);
    
    public String updateHDC(HoaDon hoaDon);
    
    public String update(HoaDon hoaDon);
}
