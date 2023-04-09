/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.ChiTietHoaDon;
import ViewModel.ChiTietHoaDonModel;
import ViewModel.HoaDonModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IChiTietHoaDonRepository {
    
    public List<HoaDonModel> getListHoaDon();
    
    public List<ChiTietHoaDonModel> getCTHDByMa(String ma);
    
    public List<HoaDonModel> searchHoaDonByNameNV(String name);
    
    public List<HoaDonModel> filterHoaDonByNameTT(int trangThai);
    
    public List<HoaDonModel> filterHoaDonByDate(String date, String startDate, String endDate);
    
    public boolean insertCTHD(ChiTietHoaDon cthd);
}
