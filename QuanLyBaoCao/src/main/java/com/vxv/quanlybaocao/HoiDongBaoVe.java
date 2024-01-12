/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vxv.quanlybaocao;

import java.util.ArrayList;

/**
 *
 * @author xuanv
 */
public class HoiDongBaoVe {
    private static int dem;

    private String maHoiDong; 
    private ArrayList<BaoCaoKhoaLuan> danhSachKhoaLuan;
    private String ngayLamViec;
    private ArrayList<GiangVien> danhSachGiangVien;

    {
        this.maHoiDong = String.valueOf(++dem);
    }


    //=====Getter Setter========
    /**
     * @return the danhSachKhoaLuan
     */
    public ArrayList<BaoCaoKhoaLuan> getDanhSachKhoaLuan() {
        return danhSachKhoaLuan;
    }

    /**
     * @param danhSachKhoaLuan the danhSachKhoaLuan to set
     */
    public void setDanhSachKhoaLuan(ArrayList<BaoCaoKhoaLuan> danhSachKhoaLuan) {
        this.danhSachKhoaLuan = danhSachKhoaLuan;
    }

    /**
     * @return the ngayLamViec
     */
    public String getNgayLamViec() {
        return ngayLamViec;
    }

    /**
     * @param ngayLamViec the ngayLamViec to set
     */
    public void setNgayLamViec(String ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    /**
     * @return the danhSachGiangVien
     */
    public ArrayList<GiangVien> getDanhSachGiangVien() {
        return danhSachGiangVien;
    }

    /**
     * @param danhSachGiangVien the danhSachGiangVien to set
     */
    public void setDanhSachGiangVien(ArrayList<GiangVien> danhSachGiangVien) {
        this.danhSachGiangVien = danhSachGiangVien;
    }
    
}
