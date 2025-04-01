package homework7;

public class VanDongVienMain {
    public static void main(String[] args) {
        VanDongVien vdv1 = new VanDongVien();
        VanDongVien vdv2 = new VanDongVien();

        System.out.println("Nhập thông tin vận động viên thứ nhất:");
        vdv1.nhap();

        System.out.println("\nNhập thông tin vận động viên thứ hai:");
        vdv2.nhap();

        System.out.println("\n--- Thông tin VĐV 1 ---");
        vdv1.xuat();
        System.out.println("--- Thông tin VĐV 2 ---");
        vdv2.xuat();

        System.out.println("\nSo sánh:");
        if (vdv1.lonHon(vdv2)) {
            System.out.println("Vận động viên 1 lớn hơn vận động viên 2.");
        } else if (vdv2.lonHon(vdv1)) {
            System.out.println("Vận động viên 2 lớn hơn vận động viên 1.");
        } else {
            System.out.println("Hai vận động viên có chiều cao và cân nặng bằng nhau.");
        }
    }
}
