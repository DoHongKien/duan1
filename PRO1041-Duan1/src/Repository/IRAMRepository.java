/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.Ram;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IRAMRepository {

    public List<Ram> getAllRam();

    public boolean insert(Ram ram);

    public boolean update(Ram ram);

    public boolean delete(String ma);
}
