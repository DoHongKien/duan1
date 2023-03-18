/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author admin
 */
public class ChiTietSanPhamModel {
    private int Id;
    private String sanPham;
    private String cpu;
    private String hang;
    private String manHinh;
    private String mauSac;
    private String oCung;
    private String ram;
    private String vga;
    private int slTon;
    private Double GiaNhap;
    private Double GiaBan;
    private String ngayTao;
    private String ngayNhap;
    private int trangThai;

    public ChiTietSanPhamModel() {
    }

    public ChiTietSanPhamModel(int Id, String sanPham, String cpu, String hang, String manHinh, String mauSac, String oCung, String ram, String vga, int slTon, Double GiaNhap, Double GiaBan, String ngayTao, String ngayNhap, int trangThai) {
        this.Id = Id;
        this.sanPham = sanPham;
        this.cpu = cpu;
        this.hang = hang;
        this.manHinh = manHinh;
        this.mauSac = mauSac;
        this.oCung = oCung;
        this.ram = ram;
        this.vga = vga;
        this.slTon = slTon;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.ngayTao = ngayTao;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public int getSlTon() {
        return slTon;
    }

    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }

    public Double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(Double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public Double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Double GiaBan) {
        this.GiaBan = GiaBan;
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

    @Override
    public String toString() {
        return "ChiTietSanPhamModel{" + "Id=" + Id + ", sanPham=" + sanPham + ", cpu=" + cpu + ", hang=" + hang + ", manHinh=" + manHinh + ", mauSac=" + mauSac + ", oCung=" + oCung + ", ram=" + ram + ", vga=" + vga + ", slTon=" + slTon + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", ngayTao=" + ngayTao + ", ngayNhap=" + ngayNhap + ", trangThai=" + trangThai + '}';
    }
}
