package homework7;

import java.util.Scanner;

public abstract class NhanVien {
	// Bai 3:
    protected String hoten;
    protected String ngaysinh;

    public abstract double tinhLuong();

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoten = sc.nextLine();
        System.out.print("Ngày sinh: ");
        ngaysinh = sc.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("Họ tên: " + hoten + ", Ngày sinh: " + ngaysinh + ", Lương: " + tinhLuong());
    }
}
