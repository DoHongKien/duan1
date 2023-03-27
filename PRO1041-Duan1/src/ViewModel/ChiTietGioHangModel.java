/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author admin
 */
public class ChiTietGioHangModel {
    
    private int id;
    private int idCTSP;
    private double donGia;
    private int soLuong;
    private int trangThai;
    private String sanPham;
    private String cpu;
    private String hang;
    private String manHinh;
    private String mauSac;
    private String oCung;
    private String ram;
    private String vga;

    public ChiTietGioHangModel() {
    }

    public ChiTietGioHangModel(int id, int idCTSP, double donGia, int soLuong, int trangThai, String sanPham, String cpu, String hang, String manHinh, String mauSac, String oCung, String ram, String vga) {
        this.id = id;
        this.idCTSP = idCTSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
        this.sanPham = sanPham;
        this.cpu = cpu;
        this.hang = hang;
        this.manHinh = manHinh;
        this.mauSac = mauSac;
        this.oCung = oCung;
        this.ram = ram;
        this.vga = vga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCTSP() {
        return idCTSP;
    }

    public void setIdCTSP(int idCTSP) {
        this.idCTSP = idCTSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getoCung() {
        return oCung;
    }

    public void setoCung(String oCung) {
        this.oCung = oCung;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
