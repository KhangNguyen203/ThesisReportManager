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
public class BaoCaoKhoaLuan extends BaoCao{
    private double tyLeKiemTraDaoVan;
    private String danhGiaGiangVienPhanBien;
    private List<GiangVien> danhSachHoiDongGiangVien;

    public BaoCaoKhoaLuan(String maBaoCao, String tenBaoCao, String linkBaoCao, LocalDate ngayBaoCao,List<SinhVien> danhSachSinhVien, String tenGiangVienHuongDan, double diemBaoCao, double tyLeKiemTraDaoVan, String danhGiaGiangVienPhanBien, List<GiangVien> danhSachHoiDongBaoVe) 
    {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, danhSachSinhVien, tenGiangVienHuongDan, diemBaoCao);
        this.tyLeKiemTraDaoVan = tyLeKiemTraDaoVan;
        this.danhGiaGiangVienPhanBien = danhGiaGiangVienPhanBien;
        this.danhSachHoiDongGiangVien = danhSachHoiDongBaoVe;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s \nTy Le Dao Van: %.1f\nGiang Vien Danh Gia: %s", super.toString(), this.tyLeKiemTraDaoVan, this.danhGiaGiangVienPhanBien);
    }

    
    //=====Getter Setter========
    /**
     * @return the tyLeKiemTraDaoVan
     */
    public double getTyLeKiemTraDaoVan() {
        return tyLeKiemTraDaoVan;
    }

    /**
     * @param tyLeKiemTraDaoVan the tyLeKiemTraDaoVan to set
     */
    public void setTyLeKiemTraDaoVan(double tyLeKiemTraDaoVan) {
        this.tyLeKiemTraDaoVan = tyLeKiemTraDaoVan;
    }

    
}
