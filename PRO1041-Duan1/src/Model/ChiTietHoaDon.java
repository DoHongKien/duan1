/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dohongkien
 */
public class ChiTietHoaDon {
    
    private int id;
    
    private int idCtsp;
    
    private int idHoaDon;
    
    private int idKhuyenMai;
    
    private int soLuong;
    
    private Double donGia;
    
    private String ngayTao;
    
    private String ngayNhap;
    
    private int trangThai;
    
    private String ghiChu;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int id, int idCtsp, int idHoaDon, int idKhuyenMai, int soLuong, Double donGia, String ngayTao, String ngayNhap, int trangThai, String ghiChu) {
        this.id = id;
        this.idCtsp = idCtsp;
        this.idHoaDon = idHoaDon;
        this.idKhuyenMai = idKhuyenMai;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngayTao = ngayTao;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCtsp() {
        return idCtsp;
    }

    public void setIdCtsp(int idCtsp) {
        this.idCtsp = idCtsp;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public void setIdKhuyenMai(int idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
