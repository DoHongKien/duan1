/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author admin
 */
public class ThongKeModel {
    
    private String ten;
    
    private Integer slTon;
    
    private Long giaBan;
    
    private Integer slBan;
    
    private Long doanhThu;

    public ThongKeModel() {
    }

    public ThongKeModel(String ten, Integer slTon, Long giaBan, Integer slBan, Long doanhThu) {
        this.ten = ten;
        this.slTon = slTon;
        this.giaBan = giaBan;
        this.slBan = slBan;
        this.doanhThu = doanhThu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getSlTon() {
        return slTon;
    }

    public void setSlTon(Integer slTon) {
        this.slTon = slTon;
    }

    public Long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Long giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getSlBan() {
        return slBan;
    }

    public void setSlBan(Integer slBan) {
        this.slBan = slBan;
    }

    public Long getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(Long doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    
}
