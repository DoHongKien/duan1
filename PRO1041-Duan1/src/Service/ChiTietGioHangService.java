/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.ChiTietGioHang;
import Repository.ChiTietGioHangRepository;
import ViewModel.ChiTietGioHangModel;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChiTietGioHangService implements IChiTietGioHangService {

    ChiTietGioHangRepository ctghRepository = new ChiTietGioHangRepository();

    public ChiTietGioHangService() {
    }

    @Override
    public List<ChiTietGioHangModel> getAllCTGH() {
        return ctghRepository.getAllCTGH();
    }

    @Override
    public List<ChiTietGioHangModel> getCTGHByIdHoaDon(int id) {
        return ctghRepository.getCTGHByIdHoaDon(id);
    }

    @Override
    public int getSoLuongByIdCTSPInGioHang(int id_ctsp) {
        return ctghRepository.getSoLuongByIdCTSPInGioHang(id_ctsp);
    }

    @Override
    public boolean insert(ChiTietGioHang ctgh) {
        return ctghRepository.insert(ctgh);
    }

    @Override
    public boolean update(ChiTietGioHang ctgh) {
        return ctghRepository.update(ctgh);
    }

    @Override
    public boolean updateSoLuong(ChiTietGioHang ctgh) {
        return ctghRepository.updateSoLuong(ctgh);
    }

    @Override
    public boolean updateTrangThai(int tt, int id) {
        return ctghRepository.updateTrangThai(tt, id);
    }

    @Override
    public boolean delete(int id) {
        return ctghRepository.delete(id);
    }
}
