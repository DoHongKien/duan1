/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.NhanVien;
import ViewModel.RoleModel;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface NhanVienServiceInterface {

    public List<NhanVien> getListDb();

    public NhanVien getDB(String ma);
    
    public int getIdNVByMa(String ma);
    
    public List<RoleModel> roleLogin(String username, String password);

    public boolean create(NhanVien nv);

    public boolean update(NhanVien nv);

    public boolean delete(NhanVien nv);
}
