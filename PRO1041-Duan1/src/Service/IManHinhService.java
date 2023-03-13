/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.ManHinh;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IManHinhService {
      public List<ManHinh> getListManHinh();
    
    public String insert(ManHinh mH);

    public String update(ManHinh mH);

    public String delete(String ma);
}
