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

}
