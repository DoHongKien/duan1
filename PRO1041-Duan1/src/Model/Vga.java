package Model;

/**
 *
 * @author dohongkien
 */
public class Vga {

    private int id;

    private String ma;

    private String ten;

    private String ngayTao;

    private String ngayNhap;

    private int trangThai;

    public Vga() {
    }

    public Vga(int id, String ma, String ten, String ngayNhap, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
    }
    

    public Vga(int id, String ma, String ten, String ngayTao, String ngayNhap, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
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
        return ten;
    }

}
