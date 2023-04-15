/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.KhachHang;
import Repository.KhachHangRepository;
import java.util.List;

/**
 *
 * @author quyen
 */
public class KhachHangService implements KhachHangServiceInterface {

    KhachHangRepository khR = new KhachHangRepository();

    @Override
    public List<KhachHang> getListDB() {
        return khR.getListDB();
    }

    @Override
    public List<KhachHang> getAllKhachHang() {
        return khR.getAllKhachHang();
    }

    @Override
    public List<KhachHang> getListKHByName(String name) {
        return khR.getListKHByName(name);
    }

    @Override
    public KhachHang getDB(String ma) {
        return khR.getDB(ma);
    }

    @Override
    public boolean create(KhachHang kh) {
        return khR.create(kh);
    }

    @Override
    public boolean update(KhachHang kh) {
        return khR.update(kh);
    }

    @Override
    public boolean delete(KhachHang kh) {
        return khR.delete(kh);
    }

}
