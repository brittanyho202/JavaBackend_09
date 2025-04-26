package homework13;

public abstract class NhanSu {
    private String maSo;
    private String hoTen;
    private String soDienThoai;
    protected int soNgayLamViec;

    public NhanSu(String maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNgayLamViec = soNgayLamViec;
    }

    public abstract double tinhLuong();

    public void xuatThongTin() {
        System.out.println("Mã số: " + maSo + " | Họ tên: " + hoTen + " | SĐT: " + soDienThoai + " | Số ngày làm: " + soNgayLamViec);
    }

	public String getMaSo() {
		return maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}
    
}

