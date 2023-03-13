/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.ManHinh;
import java.util.List;
import Repository.ManHinhRepository;


/**
 *
 * @author admin
 */
public class ManHinhService  implements IManHinhService{
ManHinhRepository manhinh = new ManHinhRepository();
    @Override
    public List<ManHinh> getListManHinh() {
       return manhinh.getListManHinh();
    }

    @Override
    public String insert(ManHinh mH) {
       if (manhinh.insert(mH)) {
            return "Thêm Thành Công";
        }
        return "Thêm Thất Bại";  
    }

    @Override
    public String update(ManHinh mH) {
          if (manhinh.update(mH)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại"; 
    }

    @Override
    public String delete(String ma) {
       if (manhinh.delete(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";  
    }
    
}
