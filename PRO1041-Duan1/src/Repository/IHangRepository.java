/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.Hang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IHangRepository {
    public List<Hang> getListHang();
    
    public boolean insert(Hang hG);

    public boolean update(Hang hG);

    public boolean delete(String ma);
}
