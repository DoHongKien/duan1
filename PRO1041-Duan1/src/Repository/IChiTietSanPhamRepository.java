/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.ChiTietSanPham;
import ViewModel.ChiTietSanPhamModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IChiTietSanPhamRepository {
    
    public List<ChiTietSanPhamModel> getListSanPham();

    public List<ChiTietSanPhamModel> timKiem(String ten);
    
    public ChiTietSanPham getDonGiaById(int id);
    
    public int getSoLuongByIdCTSP(int idCTSP);

    public boolean updateSoLuongByID(int soluong, int idCTSP);

//    public List<SanPhamViewMD> getListSPV();

//    public ChiTietSanPham getSP(String ma);

//    public List<SanPhamViewMD> timKiem(String ten);

    public boolean insert(ChiTietSanPham sp);

    public boolean update(ChiTietSanPham sp);
    
    public boolean updateTT(ChiTietSanPham sp);
    
    public boolean updateIdSerial(ChiTietSanPham sp);
}
