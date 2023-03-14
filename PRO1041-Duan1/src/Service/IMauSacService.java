/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.MauSac;
import Model.SanPham;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IMauSacService {

    public List<MauSac> getAllMauSac();

    public String insertMS(MauSac ms);

    public String updateMS(MauSac ms);

    public String deleteMS(String ma);
}
