package homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CongTy {
	private String tenCongTy;
    private String maSoThue;
    private double doanhThuThang;
    List<NhanSu> danhSachNhanSu = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // 1. Nhập thông tin công ty
    public void nhapThongTin() {
        System.out.print("Nhập tên công ty: ");
        tenCongTy = sc.nextLine();

        System.out.print("Nhập mã số thuế: ");
        maSoThue = sc.nextLine();

        System.out.print("Nhập doanh thu tháng: ");
        doanhThuThang = Double.parseDouble(sc.nextLine());
    }

    // 2. Phân bố nhân viên vào trưởng phòng
    public void phanBoNhanVien() {
        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof NhanVienThuong) {
                NhanVienThuong nv = (NhanVienThuong) ns;
                System.out.println("Nhập mã trưởng phòng cho nhân viên " + nv.getHoTen() + " (bỏ qua nếu không có): ");
                String maTP = sc.nextLine();
                if (!maTP.equals("")) {
                    TruongPhong tp = timTruongPhongTheoMa(maTP);
                    if (tp != null) {
                        nv.truongPhongQuanLy = tp;
                        tp.danhSachNhanVien.add(nv);
                    } else {
                        System.out.println("Không tìm thấy trưởng phòng.");
                    }
                }
            }
        }
    }

    // 3. Thêm hoặc xóa nhân sự
    public void themHoacXoaNhanSu() {
        System.out.println("1. Thêm | 2. Xóa");
        int chon = Integer.parseInt(sc.nextLine());
        if (chon == 1) {
            themNhanSu();
        } else if (chon == 2) {
            System.out.print("Nhập mã nhân sự muốn xóa: ");
            String ma = sc.nextLine();
            xoaNhanSu(ma);
        }
    }

    public void themNhanSu() {
        System.out.println("Chọn loại (1. Nhân viên | 2. Trưởng phòng | 3. Giám đốc): ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập mã số: ");
        String maSo = sc.nextLine();

        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        String sdt = sc.nextLine();

        System.out.print("Nhập số ngày làm việc: ");
        int soNgay = Integer.parseInt(sc.nextLine());

        if (loai == 1) {
            danhSachNhanSu.add(new NhanVienThuong(maSo, hoTen, sdt, soNgay));
        } else if (loai == 2) {
            danhSachNhanSu.add(new TruongPhong(maSo, hoTen, sdt, soNgay));
        } else if (loai == 3) {
            System.out.print("Nhập tỉ lệ cổ phần (%): ");
            double coPhan = Double.parseDouble(sc.nextLine());
            danhSachNhanSu.add(new GiamDoc(maSo, hoTen, sdt, soNgay, coPhan));
        } else {
            System.out.println("Loại không hợp lệ.");
        }
    }

    public void xoaNhanSu(String ma) {
        NhanSu canXoa = null;
        for (NhanSu ns : danhSachNhanSu) {
            if (ns.getMaSo().equals(ma)) {
                canXoa = ns;
                break;
            }
        }

        if (canXoa != null) {
            if (canXoa instanceof TruongPhong) {
                for (NhanSu ns : danhSachNhanSu) {
                    if (ns instanceof NhanVienThuong) {
                        NhanVienThuong nv = (NhanVienThuong) ns;
                        if (nv.truongPhongQuanLy == canXoa) {
                            nv.truongPhongQuanLy = null;
                        }
                    }
                }
            }
            danhSachNhanSu.remove(canXoa);
            System.out.println("Đã xóa nhân sự.");
        } else {
            System.out.println("Không tìm thấy nhân sự.");
        }
    }

    // 4. Xuất toàn bộ nhân sự
    public void xuatToanBoNhanSu() {
        System.out.println("Thông tin công ty:");
        System.out.println("Tên: " + tenCongTy);
        System.out.println("MST: " + maSoThue);
        System.out.println("Doanh thu tháng: " + doanhThuThang);
        System.out.println("Danh sách nhân sự:");
        for (NhanSu ns : danhSachNhanSu) {
            ns.xuatThongTin();
        }
    }

    // 5. Tổng lương
    public void tinhTongLuong() {
        double tong = 0;
        for (NhanSu ns : danhSachNhanSu) {
            tong += ns.tinhLuong();
        }
        System.out.println("Tổng lương phải trả: " + tong);
    }

    // 6. Nhân viên lương cao nhất
    public void timNhanVienLuongCaoNhat() {
        double max = 0;
        NhanVienThuong ketQua = null;
        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof NhanVienThuong) {
                if (ns.tinhLuong() > max) {
                    max = ns.tinhLuong();
                    ketQua = (NhanVienThuong) ns;
                }
            }
        }
        if (ketQua != null) ketQua.xuatThongTin();
    }

    // 7. Trưởng phòng có nhiều nhân viên
    public void timTruongPhongNhieuNhanVienNhat() {
        TruongPhong ketQua = null;
        int max = 0;
        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof TruongPhong) {
                TruongPhong tp = (TruongPhong) ns;
                if (tp.danhSachNhanVien.size() > max) {
                    max = tp.danhSachNhanVien.size();
                    ketQua = tp;
                }
            }
        }
        if (ketQua != null) ketQua.xuatThongTin();
    }

    // 8. Sắp xếp theo tên nhân 
    public void sapXepNhanVienTheoTen() {
        for (int i = 0; i < danhSachNhanSu.size() - 1; i++) {
            for (int j = i + 1; j < danhSachNhanSu.size(); j++) {
                if (danhSachNhanSu.get(i).getHoTen().compareTo(danhSachNhanSu.get(j).getHoTen()) > 0) {
                    NhanSu temp = danhSachNhanSu.get(i);
                    danhSachNhanSu.set(i, danhSachNhanSu.get(j));
                    danhSachNhanSu.set(j, temp);
                }
            }
        }
        xuatToanBoNhanSu();
    }

    // 9. Sắp xếp theo lương giảm dần
    public void sapXepNhanVienTheoLuongGiamDan() {
        for (int i = 0; i < danhSachNhanSu.size() - 1; i++) {
            for (int j = i + 1; j < danhSachNhanSu.size(); j++) {
                if (danhSachNhanSu.get(i).tinhLuong() < danhSachNhanSu.get(j).tinhLuong()) {
                    NhanSu temp = danhSachNhanSu.get(i);
                    danhSachNhanSu.set(i, danhSachNhanSu.get(j));
                    danhSachNhanSu.set(j, temp);
                }
            }
        }
        xuatToanBoNhanSu();
    }

    // 10. Giám đốc có cổ phần nhiều nhất
    public void timGiamDocNhieuCoPhanNhat() {
        double max = 0;
        GiamDoc ketQua = null;
        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof GiamDoc) {
                GiamDoc gd = (GiamDoc) ns;
                if (gd.getTiLeCoPhan() > max) {
                    max = gd.getTiLeCoPhan();
                    ketQua = gd;
                }
            }
        }
        if (ketQua != null) ketQua.xuatThongTin();
    }

    // 11. Tính thu nhập của giám đốc
    public void tinhThuNhapGiamDoc() {
        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof GiamDoc) {
                GiamDoc gd = (GiamDoc) ns;
                double thuNhap = gd.tinhLuong() + (gd.getTiLeCoPhan() * (doanhThuThang - tinhTongLuongThang()) / 100);
                System.out.println("Giám đốc: " + gd.getHoTen() + " | Thu nhập: " + thuNhap);
            }
        }
    }

    private double tinhTongLuongThang() {
        double sum = 0;
        for (NhanSu ns : danhSachNhanSu) {
            sum += ns.tinhLuong();
        }
        return sum;
    }

    private TruongPhong timTruongPhongTheoMa(String ma) {
        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof TruongPhong && ns.getMaSo().equals(ma)) {
                return (TruongPhong) ns;
            }
        }
        return null;
    }
}
