/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.SanPham;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ISanPhamService {

    public List<SanPham> getAllSanPham();

    public String insertSP(SanPham sp);

    public String updateSP(SanPham sp);

    public String deleteSP(String ma);
}
