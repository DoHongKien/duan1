/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.KhuyenMai;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IKhuyenMaiRepository {
    
    public List<KhuyenMai> getListKhuyenMai();
    
    public int getGiaTriByDieuKien(double dieuKien, String date, int trangThai);
    
    public int getIdByGiaTri(int giaTri);

//    public List<KhuyenMai> locByTT(int tt);
//    
    public List<KhuyenMai> fiterByStartDate(String date);
    
    public List<KhuyenMai> fiterByEndDate(String date);
    
    public List<KhuyenMai> fiterByBetweenDate(String date);

    public Boolean insert(KhuyenMai km);

    public Boolean update(KhuyenMai km);

    public Boolean delete(String ma);
}
