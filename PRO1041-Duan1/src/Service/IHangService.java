/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Cpu;
import Model.Hang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IHangService {
    public List<Hang> getListHang();
    
    public String insert(Hang hG);

    public String update(Hang hG);

    public String delete(String ma);
}
