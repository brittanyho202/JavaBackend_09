package homework7;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien {
    private double luongCanBan;
    private int soSanPham;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Lương căn bản: ");
        luongCanBan = sc.nextDouble();
        System.out.print("Số sản phẩm: ");
        soSanPham = sc.nextInt();
    }

    @Override
    public double tinhLuong() {
        return luongCanBan + soSanPham * 5000;
    }
}
