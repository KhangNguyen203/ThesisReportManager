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
public class BaoCaoDoAn extends BaoCao {
    private double tyLeKiemTraDaoVan;

    public BaoCaoDoAn(String maBaoCao, String tenBaoCao, String linkBaoCao, LocalDate ngayBaoCao, List<SinhVien> danhSachSinhVien, String tenGiangVienHuongDan, double diemBaoCao, double tyLeDV) {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, danhSachSinhVien, tenGiangVienHuongDan, diemBaoCao);
        this.tyLeKiemTraDaoVan = tyLeDV;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s \nTy Le Dao Van: %.1f", super.toString(), this.tyLeKiemTraDaoVan);
    }
    //=====Getter Setter========


}
