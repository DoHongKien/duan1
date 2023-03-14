/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.MauSac;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IMauSacRepository {
    
    public List<MauSac> getAllMauSac();
    
    public boolean insert(MauSac ms);

    public boolean update(MauSac ms);

    public boolean delete(String ma);
    
}
