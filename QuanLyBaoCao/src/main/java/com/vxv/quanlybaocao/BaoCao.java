/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vxv.quanlybaocao;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.vxv.bosung.Config;

/**
 *
 * @author xuanv
 */
public class BaoCao {
    private static int dem;

    private String maBaoCao;
    private String tenBaoCao;
    private String linkBaoCao;
    private LocalDate ngayBaoCao;
    private ArrayList<SinhVien> danhSachSinhVien;
    private String tenGiangVienHuongDan;
    private double diemBaoCao;

    public BaoCao(String maBaoCao, String tenBaoCao, String linkBaoCao, LocalDate ngayBaoCao, List<SinhVien> danhSachSinhVien, String tenGiangVienHuongDan, double diemBaoCao) {
        this.maBaoCao = String.valueOf(++dem);
        this.tenBaoCao = tenBaoCao;
        this.linkBaoCao = linkBaoCao;
        this.ngayBaoCao = ngayBaoCao;
        this.danhSachSinhVien = (ArrayList<SinhVien>) danhSachSinhVien;
        this.tenGiangVienHuongDan = tenGiangVienHuongDan;
        this.diemBaoCao = diemBaoCao;
    }
    public BaoCao(){}


    public void nhapBaoCao() throws ParseException {
        System.out.print("Ten bao cao: ");
        this.tenBaoCao = Config.scanner.nextLine();
        boolean check = false;
        do {
            try {
                check = false;
                System.out.print("Ngay bao cao (dd/mm/yyyy): ");
                this.ngayBaoCao = LocalDate.parse(Config.scanner.nextLine(), Config.formatter);
            } catch (Exception e) {
                check = true;
                System.out.println("Ngay khong hop le!");
            }
        } while (check == true);
        System.out.print("Link bai bao cao: ");
        this.linkBaoCao = Config.scanner.nextLine();
        System.out.print("Ten giang vien huong dan: ");
        this.tenGiangVienHuongDan = Config.scanner.nextLine();
        System.out.print("Diem bao cao: ");
        this.diemBaoCao = Config.scanner.nextDouble();
    }


    //=====Getter Setter=====
    /**
     * @return the maBaoCao
     */
    public String getMaBaoCao() {
        return maBaoCao;
    }

    /**
     * @param maBaoCao the maBaoCao to set
     */
    public void setMaBaoCao(String maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    /**
     * @return the tenBaoCao
     */
    public String getTenBaoCao() {
        return tenBaoCao;
    }

    /**
     * @param tenBaoCao the tenBaoCao to set
     */
    public void setTenBaoCao(String tenBaoCao) {
        this.tenBaoCao = tenBaoCao;
    }

    /**
     * @return the linkBaoCao
     */
    public String getLinkBaoCao() {
        return linkBaoCao;
    }

    /**
     * @param linkBaoCao the linkBaoCao to set
     */
    public void setLinkBaoCao(String linkBaoCao) {
        this.linkBaoCao = linkBaoCao;
    }

    /**
     * @return the ngayBaoCao
     */
    public LocalDate getNgayBaoCao() {
        return ngayBaoCao;
    }

    /**
     * @param ngayBaoCao the ngayBaoCao to set
     */
    public void setNgayBaoCao(LocalDate ngayBaoCao) {
        this.ngayBaoCao = ngayBaoCao;
    }

    /**
     * @return the danhSachSinhVien
     */
    public ArrayList<SinhVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    /**
     * @param danhSachSinhVien the danhSachSinhVien to set
     */
    public void setDanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }

    /**
     * @return the tenGiangVienHuongDan
     */
    public String getTenGiangVienHuongDan() {
        return tenGiangVienHuongDan;
    }

    /**
     * @param tenGiangVienHuongDan the tenGiangVienHuongDan to set
     */
    public void setTenGiangVienHuongDan(String tenGiangVienHuongDan) {
        this.tenGiangVienHuongDan = tenGiangVienHuongDan;
    }

    /**
     * @return the diemBaoCao
     */
    public double getDiemBaoCao() {
        return diemBaoCao;
    }

    /**
     * @param diemBaoCao the diemBaoCao to set
     */
    public void setDiemBaoCao(double diemBaoCao) {
        this.diemBaoCao = diemBaoCao;
    }

    Object getLoaiBaoCao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
