package homework13;

public class GiamDoc extends NhanSu {
    private double tiLeCoPhan; // %

	public GiamDoc(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, double tiLeCoPhan) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        if (tiLeCoPhan > 100) tiLeCoPhan = 100;
        this.tiLeCoPhan = tiLeCoPhan;
    }

    @Override
    public double tinhLuong() {
        return soNgayLamViec * 300;
    }

    public double tinhThuNhap(double loiNhuanCongTy) {
        return tinhLuong() + (tiLeCoPhan * loiNhuanCongTy / 100);
    }

    public double getTiLeCoPhan() {
        return tiLeCoPhan;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("→ Chức vụ: Giám đốc | Cổ phần: " + tiLeCoPhan + "% | Lương: " + tinhLuong());
    }
}
