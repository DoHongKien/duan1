/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.OCung;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IOCungRepository {

    public List<OCung> getAllOCung();

    public boolean insert(OCung oc);

    public boolean update(OCung oc);

    public boolean delete(String ma);
}
