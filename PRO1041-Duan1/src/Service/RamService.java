/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Ram;
import Repository.RamRepository;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class RamService implements IRamService {

    RamRepository ramRepository = new RamRepository();

    @Override
    public List<Ram> getAllRam() {
        return ramRepository.getAllRam();
    }

    @Override
    public String insertRam(Ram ram) {
        if (ramRepository.insert(ram)) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String updateRam(Ram ram) {
        if (ramRepository.update(ram)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String deleteRam(String ma) {
        if (ramRepository.delete(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
