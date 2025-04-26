package homework13;

public class NhanVienThuong extends NhanSu {
    protected TruongPhong truongPhongQuanLy;

    public NhanVienThuong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
    }

    @Override
    public double tinhLuong() {
        return soNgayLamViec * 100;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("→ Chức vụ: Nhân viên | Lương: " + tinhLuong());
        if (truongPhongQuanLy != null) System.out.println("→ Quản lý: " + truongPhongQuanLy.getHoTen());
    }

    public void setTruongPhongQuanLy(TruongPhong tp) {
        this.truongPhongQuanLy = tp;
    }

    public TruongPhong getTruongPhongQuanLy() {
        return this.truongPhongQuanLy;
    }
}
