/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;
import Model.Cpu;
import java.util.List;
/**
 *
 * @author admin
 */
public interface ICPURepotsitory {
    public List<Cpu> getListCPU();
    
    public boolean insert(Cpu cp);

    public boolean update(Cpu cp);

    public boolean delete(String ma);
}
