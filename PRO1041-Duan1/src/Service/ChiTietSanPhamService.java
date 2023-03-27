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
    public ChiTietSanPham getDonGiaById(int id) {
        return ctspRepo.getDonGiaById(id);
    }

    @Override
    public String insert(ChiTietSanPham sp) {
        if (ctspRepo.insert(sp)) {
            return "Thêm sản phẩm thành công";
        } else {
            return "Thêm sản phẩm thất bại";
        }
    }

    @Override
    public String update(ChiTietSanPham sp) {
        if (ctspRepo.update(sp)) {
            return "Sửa sản phẩm thành công";
        } else {
            return "Sửa sản phẩm thất bại";
        }
    }

    @Override
    public boolean updateTT(ChiTietSanPham sp) {
        return ctspRepo.updateTT(sp);
    }

    @Override
    public boolean updateIdSerial(ChiTietSanPham sp) {
        return ctspRepo.updateIdSerial(sp);
    }

    @Override
    public int getSoLuongByIdCTSP(int idCTSP) {
        return ctspRepo.getSoLuongByIdCTSP(idCTSP);
    }

    @Override
    public boolean updateSoLuongByID(int soluong, int idCTSP) {
        return ctspRepo.updateSoLuongByID(soluong, idCTSP);
    }

}
