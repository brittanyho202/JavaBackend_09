package homework13;

import java.util.ArrayList;

public class TruongPhong extends NhanSu {
    protected ArrayList<NhanVienThuong> danhSachNhanVien = new ArrayList<>();

    public TruongPhong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
    }

    @Override
    public double tinhLuong() {
        return soNgayLamViec * 200 + 100 * danhSachNhanVien.size();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("→ Chức vụ: Trưởng phòng | Số NV quản lý: " + danhSachNhanVien.size() + " | Lương: " + tinhLuong());
    }

    public void themNhanVien(NhanVienThuong nv) {
        danhSachNhanVien.add(nv);
    }

    public ArrayList<NhanVienThuong> getNhanVienDuoiQuyen() {
        return danhSachNhanVien;
    }
}
