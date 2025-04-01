package homework7;

import java.util.Scanner;

public class NhanVienMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chọn loại nhân viên:");
        System.out.println("1. Nhân viên sản xuất");
        System.out.println("2. Nhân viên văn phòng");
        System.out.print("Lựa chọn: ");
        int loai = sc.nextInt();
        sc.nextLine(); // clear buffer

        NhanVien nv;

        if (loai == 1) {
            nv = new NhanVienSanXuat();
        } else if (loai == 2) {
            nv = new NhanVienVanPhong();
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
            return;
        }

        System.out.println("\n--- Nhập thông tin nhân viên ---");
        nv.nhapThongTin();

        System.out.println("\n--- Thông tin nhân viên ---");
        nv.xuatThongTin();
    }
}
