package homework13;

import java.util.Scanner;

public class NhanSuMain {
	static Scanner scanner = new Scanner(System.in);
    static CongTy congTy = new CongTy();

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = getIntInput("Chọn chức năng: ");
            switch (choice) {
                case 1 -> congTy.nhapThongTin();
                case 2 -> congTy.phanBoNhanVien();
                case 3 -> congTy.themHoacXoaNhanSu();
                case 4 -> congTy.xuatToanBoNhanSu();
                case 5 -> congTy.tinhTongLuong();
                case 6 -> congTy.timNhanVienLuongCaoNhat();
                case 7 -> congTy.timTruongPhongNhieuNhanVienNhat();
                case 8 -> congTy.sapXepNhanVienTheoTen();
                case 9 -> congTy.sapXepNhanVienTheoLuongGiamDan();
                case 10 -> congTy.timGiamDocNhieuCoPhanNhat();
                case 11 -> congTy.tinhThuNhapGiamDoc();
                case 0 -> System.out.println("Đã thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.println();
        } while (choice != 0);
    }

    private static void showMenu() {
        System.out.println("========= QUẢN LÝ NHÂN SỰ =========");
        System.out.println("1. Nhập thông tin công ty");
        System.out.println("2. Phân bố Nhân viên vào Trưởng phòng");
        System.out.println("3. Thêm, xóa thông tin một nhân sự");
        System.out.println("4. Xuất ra toàn bộ nhân sự");
        System.out.println("5. Tính và xuất tổng lương công ty");
        System.out.println("6. Tìm Nhân viên có lương cao nhất");
        System.out.println("7. Tìm Trưởng phòng có nhiều nhân viên nhất");
        System.out.println("8. Sắp xếp nhân viên theo tên (A-Z)");
        System.out.println("9. Sắp xếp nhân viên theo lương giảm dần");
        System.out.println("10. Tìm Giám đốc có nhiều cổ phần nhất");
        System.out.println("11. Tính và xuất THU NHẬP của Giám đốc");
        System.out.println("0. Thoát");
        System.out.println("====================================");
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Vui lòng nhập số nguyên: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
