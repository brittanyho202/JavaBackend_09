package homework7;

import java.util.Scanner;

public class VanDongVien {
	// Bai 2:
    private String hoten, monthidau;
    private int tuoi;
    private double cannang, chieucao;

    public VanDongVien() {}

    public VanDongVien(String hoten, int tuoi, String monthidau, double cannang, double chieucao) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.monthidau = monthidau;
        this.cannang = cannang;
        this.chieucao = chieucao;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoten = sc.nextLine();
        System.out.print("Tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();  // clear buffer
        System.out.print("Môn thi đấu: ");
        monthidau = sc.nextLine();
        System.out.print("Cân nặng: ");
        cannang = sc.nextDouble();
        System.out.print("Chiều cao: ");
        chieucao = sc.nextDouble();
    }

    public void xuat() {
        System.out.println(hoten + " | Tuổi: " + tuoi + " | Môn: " + monthidau +
                           " | Cân nặng: " + cannang + " | Chiều cao: " + chieucao);
    }

    public boolean lonHon(VanDongVien other) {
        if (this.chieucao > other.chieucao) return true;
        if (this.chieucao == other.chieucao && this.cannang > other.cannang) return true;
        return false;
    }
}
