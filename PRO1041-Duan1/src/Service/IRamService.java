/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Ram;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IRamService {
    
    public List<Ram> getAllRam();

    public String insertRam(Ram ram);

    public String updateRam(Ram ram);

    public String deleteRam(String ma);
}
