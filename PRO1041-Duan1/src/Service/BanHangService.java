/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.HoaDon;
import Repository.BanHangRepository;
import java.util.List;

/**
 *
 * @author admin
 */
public class BanHangService implements IBanHangService {

    BanHangRepository banHangRepository = new BanHangRepository();

    @Override
    public List<HoaDon> getAllHoaDon() {
        return banHangRepository.getAllHoaDon();
    }

    @Override
    public int getIdByMa(String ma) {
        return banHangRepository.getIdByMa(ma);
    }

    @Override
    public String insert(HoaDon hoaDon) {
        if (banHangRepository.insert(hoaDon)) {
            return "Tạo hóa đơn thành công";
        } else {
            return "Tạo hóa đơn thất bại";
        }
    }

    @Override
    public String updateHDC(HoaDon hoaDon) {
        if(banHangRepository.updateHDC(hoaDon)) {
            return "Đã chuyển sang hóa đơn chờ";
        } else {
            return "";
        }
    }
    

    @Override
    public String update(HoaDon hoaDon) {
        if (banHangRepository.update(hoaDon)) {
            return "Thanh toán thành công";
        } else {
            return "Thanh toán thất bại";
        }
    }

}
