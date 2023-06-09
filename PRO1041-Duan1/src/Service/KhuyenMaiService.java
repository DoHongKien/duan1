/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.KhuyenMai;
import Repository.KhuyenMaiRepository;
import java.util.List;

/**
 *
 * @author dohongkien
 */
public class KhuyenMaiService implements IKhuyenMaiService {

    KhuyenMaiRepository khuyenMaiRepo = new KhuyenMaiRepository();

    public KhuyenMaiService() {
    }

    @Override
    public List<KhuyenMai> getListKhuyenMai() {
        return khuyenMaiRepo.getListKhuyenMai();
    }

    @Override
    public int getGiaTriByDieuKien(double dieuKien, String date, int trangThai) {
        return khuyenMaiRepo.getGiaTriByDieuKien(dieuKien, date, trangThai);
    }

    @Override
    public int getIdByGiaTri(int giaTri) {
        return khuyenMaiRepo.getIdByGiaTri(giaTri);
    }

    @Override
    public String insert(KhuyenMai km) {
        if (khuyenMaiRepo.insert(km)) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(KhuyenMai km) {
        if (khuyenMaiRepo.update(km)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String ma) {
        if (khuyenMaiRepo.delete(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

    @Override
    public List<KhuyenMai> fiterByStartDate(String date) {
        return khuyenMaiRepo.fiterByStartDate(date);
    }

    @Override
    public List<KhuyenMai> fiterByEndDate(String date) {
        return khuyenMaiRepo.fiterByEndDate(date);
    }

    @Override
    public List<KhuyenMai> fiterByBetweenDate(String date) {
        return khuyenMaiRepo.fiterByBetweenDate(date);
    }

}
