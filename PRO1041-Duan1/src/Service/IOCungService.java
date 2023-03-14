/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.OCung;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IOCungService {
    
    public List<OCung> getAllOCung();

    public String insertOC(OCung oc);

    public String updateOC(OCung oc);

    public String deleteOC(String ma);
}
