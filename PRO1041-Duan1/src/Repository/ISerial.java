/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.Serial;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ISerial {

    public List<Serial> getAllSerial();
    
    public List<Serial> getSerialByIdCTSP(int idCTSP);
    
    public String getNameByIdCTSPAndMa(int idctsp, String ma);

    public boolean insert(Serial s);

//    public boolean update(Serial s);
//
//    public boolean delete(Serial s);
    
    public int getIdByMa(String ma);
    
    public boolean updateTT(Serial s);
}
