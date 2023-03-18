/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dohongkien
 */
public class ChiTietSanPham {
    
    private int id;
    
    private int idSanPham;
    
    private int idCpu;
    
    private int idHang;
    
    private int idManHinh;
    
    private int idMauSac;
    
    private int idOCung;
    
    private int idRam;
    
    private int idVga;
    
    private int idSerial;
    
    private int slTon;
    
    private Double GiaNhap;
    
    private Double GiaBan;
    
    private String ngayTao;
    
    private String ngayNhap;
    
    private int trangThai;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(int id, int idSanPham, int idCpu, int idHang, int idManHinh, int idMauSac, int idOCung, int idRam, int idVga, int idSerial, int slTon, Double GiaNhap, Double GiaBan, String ngayTao, String ngayNhap, int trangThai) {
        this.id = id;
        this.idSanPham = idSanPham;
        this.idCpu = idCpu;
        this.idHang = idHang;
        this.idManHinh = idManHinh;
        this.idMauSac = idMauSac;
        this.idOCung = idOCung;
        this.idRam = idRam;
        this.idVga = idVga;
        this.idSerial = idSerial;
        this.slTon = slTon;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.ngayTao = ngayTao;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getIdCpu() {
        return idCpu;
    }

    public void setIdCpu(int idCpu) {
        this.idCpu = idCpu;
    }

    public int getIdHang() {
        return idHang;
    }

    public void setIdHang(int idHang) {
        this.idHang = idHang;
    }
    

    public int getIdManHinh() {
        return idManHinh;
    }

    public void setIdManHinh(int idManHinh) {
        this.idManHinh = idManHinh;
    }

    public int getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(int idMauSac) {
        this.idMauSac = idMauSac;
    }

    public int getIdOCung() {
        return idOCung;
    }

    public void setIdOCung(int idOCung) {
        this.idOCung = idOCung;
    }

    public int getIdRam() {
        return idRam;
    }

    public void setIdRam(int idRam) {
        this.idRam = idRam;
    }

    public int getIdVga() {
        return idVga;
    }

    public void setIdVga(int idVga) {
        this.idVga = idVga;
    }

    public int getIdSerial() {
        return idSerial;
    }

    public void setIdSerial(int idSerial) {
        this.idSerial = idSerial;
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
        return "ChiTietSanPham{" + "id=" + id + ", idSanPham=" + idSanPham + ", idCpu=" + idCpu + ", idManHinh=" + idManHinh + ", idMauSac=" + idMauSac + ", idOCung=" + idOCung + ", idRam=" + idRam + ", idVga=" + idVga + ", idSerial=" + idSerial + ", slTon=" + slTon + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", ngayTao=" + ngayTao + ", ngayNhap=" + ngayNhap + ", trangThai=" + trangThai + '}';
    }
    
}
