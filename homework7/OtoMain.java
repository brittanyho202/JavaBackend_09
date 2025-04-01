package homework7;

import java.util.Scanner;

public class OtoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng ô tô: ");
        int n = sc.nextInt();
        sc.nextLine();

        Oto[] dsOto = new Oto[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập ô tô thứ " + (i + 1) + ":");
            dsOto[i] = new Oto();
            dsOto[i].nhap();
        }

        System.out.println("\n=== Danh sách ô tô ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Ô tô " + (i + 1) + ":");
            dsOto[i].xuat();
        }

        System.out.println("\n=== Các ô tô có cùng vận tốc tối đa ===");
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dsOto[i].getVanTocMax() == dsOto[j].getVanTocMax()) {
                    System.out.println("Ô tô " + (i + 1) + " và Ô tô " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Không có ô tô nào có cùng vận tốc.");
        }
    }
}
