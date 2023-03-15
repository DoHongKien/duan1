/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Vga;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface VGAServiceInterface {

    public List<Vga> getListDB();

    public Vga getDB(String ma);

    public boolean create(Vga vga);

    public boolean update(Vga vga);

    public boolean delete(Vga vga);
}
