/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vxv.quanlybaocao;

import java.text.ParseException;

import com.vxv.bosung.Config;

/**
 *
 * @author xuanv
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        QuanLyBaoCao dsBC = new QuanLyBaoCao();

        int luaChon;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Quan ly thong tin bao cao");
            System.out.println("2. Quan ly diem thanh vien hoi dong");
            System.out.println("3. Sap xep va loc danh sach bao cao");
            System.out.println("4. Gan giang vien va thanh lap hoi dong");
            System.out.println("5. Tim kiem bao cao va hoi dong");
            System.out.println("Phim bat ky de thoat!");
            System.out.print("\nNhap lua chon cua ban: ");
            luaChon = Config.scanner.nextInt();

            switch (luaChon) {
                case 1: {
                    // 1. Quan ly thong tin bao cao
                    quanLyThongTinBaoCao(dsBC);
                }
                case 2: {
                    // 2. Quan ly diem thanh vien hoi dong
                }
                case 3: {
                    // 3. Sap xep va loc danh sach bao cao
                }
                case 4: {
                    // 4. Gan giang vien va thanh lap hoi dong
                }
                case 5: {
                    // 5. Tim kiem bao cao va hoi dong
                }

                default:
                    System.out.println("Cam on da dung chuong trinh!!");
            }
        } while (luaChon > 0 && luaChon < 6);
    }

    private static void quanLyThongTinBaoCao(QuanLyBaoCao dsBC) throws ParseException {
        int luaChon;
        do {
            System.out.println("----- QUAN LY THONG TIN BAO CAO -----");
            System.out.println("1. Them bao cao");
            System.out.println("2. Xoa bao cao");
            System.out.println("3. Sua thong tin bao cao");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = Config.scanner.nextInt();
            Config.scanner.nextLine(); // Đọc bỏ dòng new line

            switch (luaChon) {
                case 1: {
                    BaoCao bc = new BaoCao();
                    bc.nhapBaoCao();

                    dsBC.themBaoCao(bc);
                    break;
                }
                case 2: {
                    dsBC.inDanhSachBaoCao();

                    System.out.print("\nNhap ma bao cao muon xoa: ");
                    String ma = Config.scanner.nextLine();
                    dsBC.xoaBaoCao(ma);
                    break;
                }
                case 3: {
                    BaoCao bc = new BaoCao();
                    bc.nhapBaoCao();

                    System.out.print("\nNhap ma bao cao muon sua: ");
                    String ma = Config.scanner.nextLine();

                    dsBC.suaThongTinBaoCao(ma, bc);
                    break;
                }
                default: {
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
                    break;
                }
            }
        } while (luaChon > 0 && luaChon < 4);
    }
}
