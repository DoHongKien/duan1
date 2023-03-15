/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Vga;
import Repository.VGARepository;
import java.util.List;

/**
 *
 * @author quyen
 */
public class VGAService implements VGAServiceInterface{
    
    VGARepository vgaR = new VGARepository();
    
    @Override
    public List<Vga> getListDB() {
       return vgaR.getListDb();
    }

    @Override
    public Vga getDB(String ma) {
        return vgaR.getDB(ma);
    }

    @Override
    public boolean create(Vga vga) {
       return vgaR.create(vga);
    }

    @Override
    public boolean update(Vga vga) {
        return vgaR.update(vga);
    }

    @Override
    public boolean delete(Vga vga) {
        return vgaR.delete(vga);
    }
    
}
