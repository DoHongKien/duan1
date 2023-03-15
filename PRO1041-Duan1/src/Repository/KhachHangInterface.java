/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.KhachHang;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface KhachHangInterface {

    public List<KhachHang> getListDB();

    public KhachHang getDB(String ma);

    public boolean create(KhachHang kh);

    public boolean update(KhachHang kh);

    public boolean delete(KhachHang kh);

}
