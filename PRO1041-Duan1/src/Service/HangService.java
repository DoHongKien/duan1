/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Hang;
import java.util.List;
import Repository.HangRepository;


/**
 *
 * @author admin
 */
public class HangService implements IHangService{
    HangRepository hangRpo = new HangRepository();

    @Override
    public List<Hang> getListHang() {
        return hangRpo.getListHang();
    }

    @Override
    public String insert(Hang hG) {
            if (hangRpo.insert(hG)) {
            return "Thêm Thành Công";
        }
        return "Thêm Thất Bại";  
    }

    @Override
    public String update(Hang hG) {
       if (hangRpo.update(hG)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại"; 
    }

    @Override
    public String delete(String ma) {
         if (hangRpo.delete(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";  
    }
    
}
