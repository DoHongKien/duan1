/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Cpu;

import java.util.List;


/**
 *
 * @author admin
 */
public interface ICPUService {
    public List<Cpu> getListCPU();
    
    public String insert(Cpu cp);

    public String update(Cpu cp);

    public String delete(String ma);
    
}
