/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.KhuyenMai;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IKhuyenMaiService {
    
    public List<KhuyenMai> getListKhuyenMai();

//    public List<KhuyenMai> locByTT(int tt);
//    
//    public List<KhuyenMai> fiterByStartDate(String date);
//    
//    public List<KhuyenMai> fiterByEndDate(String date);
//    
//    public List<KhuyenMai> fiterByBetweenDate(String date);

    public String insert(KhuyenMai km);

    public String update(KhuyenMai km);

    public String delete(String ma);
}
