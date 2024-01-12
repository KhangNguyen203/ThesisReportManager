/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vxv.quanlybaocao;

/**
 *
 * @author xuanv
 */
public class SinhVien {
    private static int dem;

    private String maSinhVien;
    private String hoTen;
    private String khoaHoc;
    private String gioiTinh;
    private int namSinh;
    private String chuyenNganh;

    public SinhVien(String ht, String kh, String gt, int ns, String cn) {
        this.maSinhVien = String.valueOf(++dem);
        this.hoTen = ht;
        this.khoaHoc = kh;
        this.gioiTinh = gt;
        this.namSinh = ns;
        this.chuyenNganh = cn;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Ma SV: %s\nHo Ten: %s", this.maSinhVien, this.hoTen);
    }


    //=====Getter Setter========
    /**
     * @return the maSinhVien
     */
    public String getMaSinhVien() {
        return maSinhVien;
    }

    /**
     * @param maSinhVien the maSinhVien to set
     */
    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the khoaHoc
     */
    public String getKhoaHoc() {
        return khoaHoc;
    }

    /**
     * @param khoaHoc the khoaHoc to set
     */
    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the namSinh
     */
    public int getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    /**
     * @return the chuyenNganh
     */
    public String getChuyenNganh() {
        return chuyenNganh;
    }

    /**
     * @param chuyenNganh the chuyenNganh to set
     */
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
