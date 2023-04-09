/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NhanVien;
import Repository.NhanVienRepository;
import ViewModel.RoleModel;
import java.util.List;

/**
 *
 * @author quyen
 */
public class NhanVienService implements NhanVienServiceInterface {

    NhanVienRepository nvR = new NhanVienRepository();

    @Override
    public List<NhanVien> getListDb() {
        return nvR.getListDb();
    }

    @Override
    public List<NhanVien> getNhanVienByName(String name) {
        return nvR.getNhanVienByName(name);
    }

    @Override
    public NhanVien getDB(String ma) {
        return nvR.getDB(ma);
    }

    @Override
    public List<RoleModel> roleLogin(String username, String password) {
        return nvR.roleLogin(username, password);
    }

    @Override
    public int getIdNVByMa(String ma) {
        return nvR.getIdNVByMa(ma);
    }

    @Override
    public boolean create(NhanVien nv) {
        return nvR.create(nv);
    }

    @Override
    public boolean update(NhanVien nv) {
        return nvR.update(nv);
    }

    @Override
    public String updateMatKhau(NhanVien nv) {
        if (nvR.updateMatKhau(nv)) {
            return "Đổi mật khẩu thành công";
        } else {
            return "Đổi mật khẩu thất bại";
        }
    }

    @Override
    public boolean delete(NhanVien nv) {
        return nvR.delete(nv);
    }
}
