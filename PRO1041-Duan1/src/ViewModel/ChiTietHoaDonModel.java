/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author admin
 */
public class ChiTietHoaDonModel {
    
    private String tenSanPham;
    
    private Double giaBan;
    
    private Integer giaTri;
    
    private Integer soLuong;
    
    private Double donGia;

    public ChiTietHoaDonModel() {
    }

    public ChiTietHoaDonModel(String tenSanPham, Double giaBan, Integer giaTri, Integer soLuong, Double donGia) {
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.giaTri = giaTri;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(Integer giaTri) {
        this.giaTri = giaTri;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
    
}
