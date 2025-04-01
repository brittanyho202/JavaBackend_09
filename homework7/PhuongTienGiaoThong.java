package homework7;

import java.util.Scanner;

public class PhuongTienGiaoThong {
	// Bai 4:
    protected String hangSX, tenPT;
    protected int namSX;
    protected double vanTocMax;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãng sản xuất: ");
        hangSX = sc.nextLine();
        System.out.print("Tên phương tiện: ");
        tenPT = sc.nextLine();
        System.out.print("Năm sản xuất: ");
        namSX = sc.nextInt();
        System.out.print("Vận tốc tối đa: ");
        vanTocMax = sc.nextDouble();
    }

    public void xuat() {
        System.out.println(hangSX + " | " + tenPT + " | " + namSX + " | Vận tốc: " + vanTocMax);
    }

    public double getVanTocMax() {
        return vanTocMax;
    }
}
