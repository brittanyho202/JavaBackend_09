package homework7;


import java.util.Scanner;

public class PhanSo {
	// Bai 1:
    private int tuso, mauso;

    public PhanSo() {
        this.tuso = 0;
        this.mauso = 1; // tránh chia cho 0
    }

    public PhanSo(int tu, int mau) {
        if (mau == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0.");
        }
        this.tuso = tu;
        this.mauso = mau;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        tuso = sc.nextInt();

        do {
            System.out.print("Nhập mẫu số (khác 0): ");
            mauso = sc.nextInt();
        } while (mauso == 0);
    }

    public void xuat() {
        System.out.println(tuso + "/" + mauso);
    }

    public PhanSo cong(PhanSo b) {
        int tu = this.tuso * b.mauso + b.tuso * this.mauso;
        int mau = this.mauso * b.mauso;
        return new PhanSo(tu, mau);
    }

    public PhanSo tru(PhanSo b) {
        int tu = this.tuso * b.mauso - b.tuso * this.mauso;
        int mau = this.mauso * b.mauso;
        return new PhanSo(tu, mau);
    }

    public PhanSo nhan(PhanSo b) {
        return new PhanSo(this.tuso * b.tuso, this.mauso * b.mauso);
    }

    public PhanSo chia(PhanSo b) {
        if (b.tuso == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số = 0");
        }
        return new PhanSo(this.tuso * b.mauso, this.mauso * b.tuso);
    }
}