/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Serial;
import Repository.SerialRepository;
import java.util.List;

/**
 *
 * @author admin
 */
public class SerialService implements ISerialService {

    SerialRepository serialRepository = new SerialRepository();

    public SerialService() {
    }

    @Override
    public List<Serial> getAllSerial() {
        return serialRepository.getAllSerial();
    }

    @Override
    public List<Serial> getSerialByIdCTSP(int idCTSP) {
        return serialRepository.getSerialByIdCTSP(idCTSP);
    }

    @Override
    public String getNameByIdCTSPAndMa(int idctsp, String ma) {
        return serialRepository.getNameByIdCTSPAndMa(idctsp, ma);
    }

    @Override
    public int getIdByMa(String ma) {
        return serialRepository.getIdByMa(ma);
    }
    
    @Override
    public String insert(Serial s) {
        if (serialRepository.insert(s)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public boolean updateTT(Serial s) {
        return serialRepository.updateTT(s);
    }

    public static void main(String[] args) {
        new SerialService().getAllSerial();
    }
}
