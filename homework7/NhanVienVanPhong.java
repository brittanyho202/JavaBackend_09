package homework7;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien {
    private int soNgayLam;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Số ngày làm việc: ");
        soNgayLam = sc.nextInt();
    }

    @Override
    public double tinhLuong() {
        return soNgayLam * 100000;
    }
}
