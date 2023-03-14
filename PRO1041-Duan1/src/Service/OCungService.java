/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.OCung;
import Repository.IOCungRepository;
import Repository.OCungRepository;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class OCungService implements IOCungService {

    OCungRepository oCungRepo = new OCungRepository();

    public OCungService() {
    }

    @Override
    public List<OCung> getAllOCung() {
        return oCungRepo.getAllOCung();
    }

    @Override
    public String insertOC(OCung oc) {
        if (oCungRepo.insert(oc)) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String updateOC(OCung oc) {
        if (oCungRepo.update(oc)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String deleteOC(String ma) {
        if (oCungRepo.delete(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
