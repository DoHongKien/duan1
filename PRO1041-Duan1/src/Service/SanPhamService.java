/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SanPham;
import Repository.SanPhamRepository;
import java.util.List;

/**
 *
 * @author admin
 */
public class SanPhamService implements ISanPhamService{
    SanPhamRepository sanPhamRepo = new SanPhamRepository();

    public SanPhamService() {
    }
    
    @Override
    public List<SanPham> getAllSanPham() {
        return sanPhamRepo.getAllSanPham();
    }

    @Override
    public String insertSP(SanPham sp) {
        if (sanPhamRepo.insert(sp)) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String updateSP(SanPham sp) {
        if (sanPhamRepo.update(sp)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String deleteSP(String ma) {
        if (sanPhamRepo.delete(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
    
}
