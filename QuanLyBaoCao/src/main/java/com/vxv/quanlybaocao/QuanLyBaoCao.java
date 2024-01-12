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
public class QuanLyBaoCao {
    private ArrayList<BaoCao> danhSachBaoCao;
    private ArrayList<HoiDongBaoVe> danhSachHoiDong;

    public QuanLyBaoCao() {
        danhSachBaoCao = new ArrayList<>();
        danhSachHoiDong = new ArrayList<>();
    }

    // Thêm báo cáo
    public void themBaoCao(BaoCao baoCao) {
        danhSachBaoCao.add(baoCao);
        System.out.println("Them thanh cong!");
    }

    // Xoá báo cáo
    public void xoaBaoCao(String maBaoCao) {
        for (BaoCao baoCao : danhSachBaoCao) {
            if (baoCao.getMaBaoCao().equals(maBaoCao)) {
                danhSachBaoCao.remove(baoCao);
                System.out.println("Xoa thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay bao cao co ma " + maBaoCao);
    }

    // Sửa thông tin báo cáo
    public void suaThongTinBaoCao(String maBaoCao, BaoCao thongTinMoi) {
        for (BaoCao baoCao : danhSachBaoCao) {
            if (baoCao.getMaBaoCao().equals(maBaoCao)) {

                baoCao.setTenBaoCao(thongTinMoi.getTenBaoCao());
                baoCao.setNgayBaoCao(thongTinMoi.getNgayBaoCao());
                baoCao.setTenGiangVienHuongDan(thongTinMoi.getTenGiangVienHuongDan());
                baoCao.setDiemBaoCao(thongTinMoi.getDiemBaoCao());
                baoCao.setLinkBaoCao(thongTinMoi.getLinkBaoCao());

                System.out.println("Sua thanh cong!");
            }
        }
        System.out.println("Khong tim thay bao cao co ma " + maBaoCao);
    }

    // In danh sách báo cáo
    public void inDanhSachBaoCao() {
        System.out.println("=== Danh sach bao cao===");
        for (BaoCao baoCao : danhSachBaoCao) {
            System.out.println("- " + baoCao.toString());
        }
    }
    // public void hienThiDanhSachBaoCao() {
    // if (danhSachBaoCao.isEmpty()) {
    // System.out.println("Danh sách báo cáo trống.");
    // return;
    // }
    // System.out.println("Danh sách báo cáo:");
    // for (BaoCao baoCao : danhSachBaoCao) {
    // System.out.println("- Mã báo cáo: " + baoCao.getMaBaoCao());
    // System.out.println(" Nội dung: " + baoCao.getTenBaoCao());
    // }
    // }

    public void hienThiDanhSachBaoCaoTheoLoai(String loaiBaoCao) {
        boolean danhSachRong = true;
        System.out.println("Danh sách báo cáo theo loại " + loaiBaoCao + ":");
        for (BaoCao baoCao : danhSachBaoCao) {
            if (baoCao.getLoaiBaoCao().equals(loaiBaoCao)) {
                System.out.println("- Mã báo cáo: " + baoCao.getMaBaoCao());
                System.out.println("  Nội dung: " + baoCao.getTenBaoCao());
                danhSachRong = false;
            }
        }
        if (danhSachRong) {
            System.out.println("Không có báo cáo nào thuộc loại " + loaiBaoCao);
        }
    }


    //====Getter Setter=====
    /**
     * @return the danhSachBaoCao
     */
    public ArrayList<BaoCao> getDanhSachBaoCao() {
        return danhSachBaoCao;
    }

    /**
     * @param danhSachBaoCao the danhSachBaoCao to set
     */
    public void setDanhSachBaoCao(ArrayList<BaoCao> danhSachBaoCao) {
        this.danhSachBaoCao = danhSachBaoCao;
    }

    /**
     * @return the danhSachHoiDong
     */
    public ArrayList<HoiDongBaoVe> getDanhSachHoiDong() {
        return danhSachHoiDong;
    }

    /**
     * @param danhSachHoiDong the danhSachHoiDong to set
     */
    public void setDanhSachHoiDong(ArrayList<HoiDongBaoVe> danhSachHoiDong) {
        this.danhSachHoiDong = danhSachHoiDong;
    }

}
