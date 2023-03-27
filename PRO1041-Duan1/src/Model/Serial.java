/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dohongkien
 */
public class Serial {

    private int id;

    private int idCtsp;

    private String ma;

    private String ngayTao;

    private String ngayNhap;

    private int trangThai;

    public Serial() {
    }

    public Serial(int idCtsp, String ma, String ngayTao, String ngayNhap, int trangThai) {
        this.idCtsp = idCtsp;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
    }

    public Serial(int id, int idCtsp, String ma, String ngayTao, String ngayNhap, int trangThai) {
        this.id = id;
        this.idCtsp = idCtsp;
        this.ma = ma;
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

    public int getIdCtsp() {
        return idCtsp;
    }

    public void setIdCtsp(int idCtsp) {
        this.idCtsp = idCtsp;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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
        return ma;
    }
}
