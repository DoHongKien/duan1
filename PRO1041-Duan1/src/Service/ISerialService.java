/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Serial;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ISerialService {

    public List<Serial> getAllSerial();
    
    public List<Serial> getSerialByIdCTSP(int idCTSP);
    
    public String getNameByIdCTSPAndMa(int idctsp, String ma);

    public String insert(Serial s);
    
    public boolean updateTT(Serial s);
    
    public int getIdByMa(String ma);
}
