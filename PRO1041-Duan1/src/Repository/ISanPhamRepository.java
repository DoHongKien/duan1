/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.SanPham;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ISanPhamRepository {

    public List<SanPham> getAllSanPham();

    public boolean insert(SanPham sp);

    public boolean update(SanPham sp);

    public boolean delete(String ma);
}
