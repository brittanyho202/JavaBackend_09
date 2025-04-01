package homework7;

import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuDongCo;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Số chỗ ngồi: ");
        soChoNgoi = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Kiểu động cơ: ");
        kieuDongCo = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chỗ ngồi: " + soChoNgoi + " | Động cơ: " + kieuDongCo);
    }
}
