/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.ChiTietHoaDon;
import Repository.ChiTietHoaDonRepository;
import ViewModel.ChiTietHoaDonModel;
import ViewModel.HoaDonModel;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChiTietHoaDonService implements IChiTietHoaDonService {

    ChiTietHoaDonRepository cthdRepository = new ChiTietHoaDonRepository();

    public ChiTietHoaDonService() {
    }

    @Override
    public List<HoaDonModel> getListHoaDon() {
        return cthdRepository.getListHoaDon();
    }

    @Override
    public List<ChiTietHoaDonModel> getCTHDByMa(String ma) {
        return cthdRepository.getCTHDByMa(ma);
    }

    @Override
    public List<HoaDonModel> searchHoaDonByNameNV(String name) {
        return cthdRepository.searchHoaDonByNameNV(name);
    }

    @Override
    public List<HoaDonModel> filterHoaDonByNameTT(int trangThai) {
        return cthdRepository.filterHoaDonByNameTT(trangThai);
    }

    @Override
    public boolean insertCTHD(ChiTietHoaDon cthd) {
        return cthdRepository.insertCTHD(cthd);
    }

}
