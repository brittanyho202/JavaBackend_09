package homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. HocSinh
        double[] diem = {9, 8, 7};
        HocSinh hs = new HocSinh("Suzy", 16, diem);
        hs.inThongTin();

        System.out.println("\n---");

        // 2. Xe Hơi
        XeHoi xeHoi = new XeHoi("Toyota", "Trắng", 2021);
        xeHoi.hienThiThongTin();

        System.out.println("\n---");

        // 3. Trò chơi
        TroChoi game = new TroChoi("Đập Chuột Túi");
        game.batDau();
        game.ketThuc();
        game.hienThiSoLuotChoi();

        System.out.println("\n---");

        // 4. Phương tiện giao thông
        XeHoi2 car = new XeHoi2("Ford", "Cam", 2021);
        XeMay bike = new XeMay("Yamaha", "Đỏ", 2022);
        car.hienThiThongTin();
        System.out.println("---");
        bike.hienThiThongTin();

        System.out.println("\n---");

        // 5. Thiết bị điện
        DieuHoa ac = new DieuHoa("Panasonic Pro AC", 1500, true, true);
        MaySay dryer = new MaySay("LG Dryer", 1200, "Sấy nhanh");
        ac.hienThiThongTin();
        System.out.println("---");
        dryer.hienThiThongTin();
    }
}
