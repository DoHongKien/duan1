/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.ManHinh;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IManHinhRepository {
      public List<ManHinh> getListManHinh();
    
    public boolean insert(ManHinh mH);

    public boolean update(ManHinh mH);

    public boolean delete(String ma);
    
}
