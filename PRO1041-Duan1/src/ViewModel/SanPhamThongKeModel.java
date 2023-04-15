/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author admin
 */
public class SanPhamThongKeModel {
    
    private String ten;
    
    private Long doanhThu;

    public SanPhamThongKeModel() {
    }

    public SanPhamThongKeModel(String ten, Long doanhThu) {
        this.ten = ten;
        this.doanhThu = doanhThu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Long getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(Long doanhThu) {
        this.doanhThu = doanhThu;
    }
    
}
