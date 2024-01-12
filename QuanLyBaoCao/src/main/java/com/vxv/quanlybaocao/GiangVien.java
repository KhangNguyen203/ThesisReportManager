/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vxv.quanlybaocao;

/**
 *
 * @author xuanv
 */
public class GiangVien {
    private static int dem;

    private String maGV;
    private String hoTen;
    private String hocHam;
    private String hocVi;
    private String vaiTro;
    
    public GiangVien(String hoTen, String hocHam, String hocVi, String vaiTro) {
        this.maGV = String.valueOf(++dem);
        this.hoTen = hoTen;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Ma Giang Vien: %s\n Ho Ten: %s", this.maGV, this.hoTen);
    }

    
    //=====Getter Setter========
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
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the vaiTro
     */
    public String getVaiTro() {
        return vaiTro;
    }

    /**
     * @param vaiTro the vaiTro to set
     */
    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }
    
}
