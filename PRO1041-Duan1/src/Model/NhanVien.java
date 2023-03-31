/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dohongkien
 */
public class NhanVien {

    private int id;

    private int idChucVu;

    private String ma;

    private String ten;

    private String ngaySinh;

    private String gioiTinh;

    private String sdt;

    private String diaChi;

    private String matKhau;

    private String ngayTao;

    private String ngayNhap;

    private int trangThai;

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, String ngaySinh, String gioiTinh, String sdt, String diaChi, String matKhau, String ngayNhap, int trangThai, int idChucVu) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
        this.idChucVu = idChucVu;
    }

    public NhanVien(String ma, String ten, String ngaySinh, String gioiTinh, String sdt, String diaChi, String matKhau, String ngayTao, String ngayNhap, int trangThai, int idChucVu) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
        this.ngayTao = ngayTao;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
        this.idChucVu = idChucVu;
    }

    public NhanVien(int id, int idChucVu, String ma, String ten, String ngaySinh, String gioiTinh, String sdt, String diaChi, String matKhau, String ngayTao, String ngayNhap, int trangThai) {
        this.id = id;
        this.idChucVu = idChucVu;
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
        this.ngayTao = ngayTao;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
    }

    public NhanVien(int id, String ma, String ten, String ngaySinh, String gioiTinh, String sdt, String diaChi, String ngayTao, String ngayNhap, int trangThai, String matKhau) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.ngayTao = ngayTao;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
        this.matKhau = matKhau;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdChucVu() {
        return idChucVu;
    }

    public void setIdChucVu(int idChucVu) {
        this.idChucVu = idChucVu;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
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

}
