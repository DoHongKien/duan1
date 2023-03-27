package Model;

/**
 *
 * @author dohongkien
 */
public class KhuyenMai {
    
    private int id;
    
    private String ma;
    
    private int dieuKien;
    
    private int giaTri;
    
    private String ngayTao;
    
    private String ngayHetHan;
    
    private String ngayNhap;
    
    private int trangThai;

    public KhuyenMai() {
    }

    public KhuyenMai(String ma, int dieuKien, int giaTri, String ngayTao, String ngayHetHan, String ngayNhap, int trangThai) {
        this.ma = ma;
        this.dieuKien = dieuKien;
        this.giaTri = giaTri;
        this.ngayTao = ngayTao;
        this.ngayHetHan = ngayHetHan;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
    }

    public KhuyenMai(int id, String ma, int dieuKien, int giaTri, String ngayTao, String ngayHetHan, String ngayNhap, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.dieuKien = dieuKien;
        this.giaTri = giaTri;
        this.ngayTao = ngayTao;
        this.ngayHetHan = ngayHetHan;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(int dieuKien) {
        this.dieuKien = dieuKien;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
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
