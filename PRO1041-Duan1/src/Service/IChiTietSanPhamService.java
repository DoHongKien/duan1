/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.ChiTietSanPham;
import ViewModel.ChiTietSanPhamModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IChiTietSanPhamService {

    public List<ChiTietSanPhamModel> getListSanPham();

    public List<ChiTietSanPhamModel> timKiem(String ten);

    public String insert(ChiTietSanPham sp);

    public String update(ChiTietSanPham sp);

    public String delete(ChiTietSanPham sp);
}
