package homework7;

import java.util.Scanner;

public class PhanSoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Nhập phân số thứ nhất:");
        ps1.nhap();

        System.out.println("Nhập phân số thứ hai:");
        ps2.nhap();

        System.out.print("Phân số 1: ");
        ps1.xuat();

        System.out.print("Phân số 2: ");
        ps2.xuat();

        System.out.print("Tổng: ");
        ps1.cong(ps2).xuat();

        System.out.print("Hiệu: ");
        ps1.tru(ps2).xuat();

        System.out.print("Tích: ");
        ps1.nhan(ps2).xuat();

        System.out.print("Thương: ");
        try {
            ps1.chia(ps2).xuat();
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
