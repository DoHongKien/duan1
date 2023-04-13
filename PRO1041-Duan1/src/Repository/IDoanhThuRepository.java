/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import ViewModel.DoanhThuModel;
import ViewModel.ThongKeModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IDoanhThuRepository {

    // Chức năng mục sản phẩm trong phần thống kê
    public List<ThongKeModel> getAllThongKe();

    public List<ThongKeModel> getThongKeByNameSP(String name);

    public List<ThongKeModel> sortThongKeDoanhThuAsc();

    public List<ThongKeModel> sortThongKeDoanhThuDesc();

    public List<ThongKeModel> sortThongKeSanPhamAsc();

    public List<ThongKeModel> sortThongKeSanPhamDesc();

    public int sumThongKeSanPhamDangBan();

    public int sumThongKeSanPhamNgungBan();

    public int sumThongKeSanPhamHetHang();

    // Chức năng mục doanh thu trong phần thống kê
    public List<DoanhThuModel> getAllDoanhThu();
    
    public List<DoanhThuModel> getDoanhThuByDate(String start, String end);

    public Long sumThongKeDoanhThuByYear(int year);

    public Long sumThongKeDoanhThuByMonth(int month);

    public Long sumThongKeDoanhThuByDay();
}
