/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.DoanhThuRepository;
import ViewModel.DoanhThuModel;
import ViewModel.ThongKeModel;
import java.util.List;

/**
 *
 * @author admin
 */
public class DoanhThuService implements IDoanhThuService {

    DoanhThuRepository doanhThuRepository = new DoanhThuRepository();

    public DoanhThuService() {
    }

    @Override
    public List<ThongKeModel> getAllThongKe() {
        return doanhThuRepository.getAllThongKe();
    }

    @Override
    public List<ThongKeModel> getThongKeByNameSP(String name) {
        return doanhThuRepository.getThongKeByNameSP(name);
    }

    @Override
    public List<ThongKeModel> sortThongKeDoanhThuAsc() {
        return doanhThuRepository.sortThongKeDoanhThuAsc();
    }

    @Override
    public List<ThongKeModel> sortThongKeDoanhThuDesc() {
        return doanhThuRepository.sortThongKeDoanhThuDesc();
    }

    @Override
    public List<ThongKeModel> sortThongKeSanPhamAsc() {
        return doanhThuRepository.sortThongKeSanPhamAsc();
    }

    @Override
    public List<ThongKeModel> sortThongKeSanPhamDesc() {
        return doanhThuRepository.sortThongKeSanPhamDesc();
    }

    @Override
    public int sumThongKeSanPhamDangBan() {
        return doanhThuRepository.sumThongKeSanPhamDangBan();
    }

    @Override
    public int sumThongKeSanPhamNgungBan() {
        return doanhThuRepository.sumThongKeSanPhamNgungBan();
    }

    @Override
    public int sumThongKeSanPhamHetHang() {
        return doanhThuRepository.sumThongKeSanPhamHetHang();
    }

    @Override
    public List<DoanhThuModel> getAllDoanhThu() {
        return doanhThuRepository.getAllDoanhThu();
    }

    @Override
    public List<DoanhThuModel> getDoanhThuByDate(String start, String end) {
        return doanhThuRepository.getDoanhThuByDate(start, end);
    }

    @Override
    public Long sumThongKeDoanhThuByYear(int year) {
        return doanhThuRepository.sumThongKeDoanhThuByYear(year);
    }

    @Override
    public Long sumThongKeDoanhThuByMonth(int month) {
        return doanhThuRepository.sumThongKeDoanhThuByMonth(month);
    }

    @Override
    public Long sumThongKeDoanhThuByDay() {
        return doanhThuRepository.sumThongKeDoanhThuByDay();
    }

}
