/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.ChiTietSanPham;
import Repository.ChiTietSanPhamRepository;
import ViewModel.ChiTietSanPhamModel;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChiTietSanPhamService implements IChiTietSanPhamService {

    ChiTietSanPhamRepository ctspRepo = new ChiTietSanPhamRepository();

    public ChiTietSanPhamService() {
    }

    @Override
    public List<ChiTietSanPhamModel> getListSanPham() {
        return ctspRepo.getListSanPham();
    }

    @Override
    public List<ChiTietSanPhamModel> timKiem(String ten) {
        return ctspRepo.timKiem(ten);
    }

    @Override
    public String insert(ChiTietSanPham sp) {
        if(ctspRepo.insert(sp)){
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(ChiTietSanPham sp) {
        if(ctspRepo.update(sp)){
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(ChiTietSanPham sp) {
        if(ctspRepo.delete(sp)){
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

}
