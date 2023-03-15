/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.NhanVien;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface NhanVienInterface {

    public List<NhanVien> getListDb();

    public NhanVien getDB(String ma);

    public boolean create(NhanVien nv);

    public boolean update(NhanVien nv);

    public boolean delete(NhanVien nv);
}
