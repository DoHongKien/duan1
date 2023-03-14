/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.MauSac;
import Repository.IMauSacRepository;
import Repository.MauSacRepository;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class MauSacService implements IMauSacService {

    MauSacRepository mauSacRepo = new MauSacRepository();

    public MauSacService() {
    }

    @Override
    public List<MauSac> getAllMauSac() {
        return mauSacRepo.getAllMauSac();
    }

    @Override
    public String insertMS(MauSac ms) {
        if (mauSacRepo.insert(ms)) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String updateMS(MauSac ms) {
        if (mauSacRepo.update(ms)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String deleteMS(String ma) {
        if (mauSacRepo.delete(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
