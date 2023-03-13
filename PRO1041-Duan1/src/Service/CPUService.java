/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Cpu;
import Repository.CPURepotsitory;
import java.util.List;


/**
 *
 * @author admin
 */
public class CPUService implements ICPUService{
    CPURepotsitory CpURepo = new CPURepotsitory();

    @Override
    public List<Cpu> getListCPU() {
        return CpURepo.getListCPU();
     }

    @Override
    public String insert(Cpu cp) {
              if (CpURepo.insert(cp)) {
            return "Thêm Thành Công";
        }
        return "Thêm Thất Bại";  
     }

    @Override
    public String update(Cpu cp) {
       if (CpURepo.update(cp)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";    }

    @Override
    public String delete(String ma) {
          if (CpURepo.delete(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";    }
}
