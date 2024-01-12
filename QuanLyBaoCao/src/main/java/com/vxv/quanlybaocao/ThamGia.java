/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vxv.quanlybaocao;

import java.util.List;

/**
 *
 * @author xuanv
 */
public class ThamGia {
    private String vaiTro;
    private List<GiangVien> dsGV; 
    private double diem; 
    private String nhanXet; 
    private HoiDongBaoVe hd; 

    public ThamGia(String vt, List<GiangVien> dsGV, double d, String nx, HoiDongBaoVe hd){
        this.vaiTro = vt; 
        this.dsGV = dsGV; 
        this.diem = d; 
        this.nhanXet = nx; 
        this.hd = hd;
    }

     @Override
    public String toString() {
        return String.format("Vai tro: %s, Danh sach giang vien: %s, Diem: %.2f, Nhan xet: %s, Hoi dong bao ve: %s",
                vaiTro, dsGV, diem, nhanXet, hd);
    }
        
    
    //=====Getter Setter========
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

    /**
     * @return the dsGV
     */
    public List<GiangVien> getDsGV() {
        return dsGV;
    }

    /**
     * @param dsGV the dsGV to set
     */
    public void setDsGV(List<GiangVien> dsGV) {
        this.dsGV = dsGV;
    }

    /**
     * @return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }

    /**
     * @return the nhanXet
     */
    public String getNhanXet() {
        return nhanXet;
    }

    /**
     * @param nhanXet the nhanXet to set
     */
    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }

    /**
     * @return the hd
     */
    public HoiDongBaoVe getHd() {
        return hd;
    }

    /**
     * @param hd the hd to set
     */
    public void setHd(HoiDongBaoVe hd) {
        this.hd = hd;
    }
    
}
