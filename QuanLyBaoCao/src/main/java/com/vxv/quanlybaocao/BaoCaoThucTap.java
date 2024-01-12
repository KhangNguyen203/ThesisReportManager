/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vxv.quanlybaocao;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author xuanv
 */
public class BaoCaoThucTap extends BaoCao {
    private String danhGiaDoanhNghiep;

    public BaoCaoThucTap(String maBaoCao, String tenBaoCao, String linkBaoCao, LocalDate ngayBaoCao, List<SinhVien> danhSachSinhVien, String tenGiangVienHuongDan, double diemBaoCao, String danhGiaDN) {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, danhSachSinhVien, tenGiangVienHuongDan, diemBaoCao);
        this.danhGiaDoanhNghiep = danhGiaDN;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s \nTy Le Dao Van: %s", super.toString(), this.danhGiaDoanhNghiep);
    }


    //=====Getter Setter========
    /**
     * @return the danhGiaDoanhNghiep
     */
    public String getDanhGiaDoanhNghiep() {
        return danhGiaDoanhNghiep;
    }

    /**
     * @param danhGiaDoanhNghiep the danhGiaDoanhNghiep to set
     */
    public void setDanhGiaDoanhNghiep(String danhGiaDoanhNghiep) {
        this.danhGiaDoanhNghiep = danhGiaDoanhNghiep;
    }

}
