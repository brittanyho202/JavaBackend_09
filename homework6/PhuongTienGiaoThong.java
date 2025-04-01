package homework6;

public class PhuongTienGiaoThong {
	// Question 4:
    protected String hangSanXuat;
    protected String mauSac;
    protected int namSanXuat;

    public PhuongTienGiaoThong(String hangSanXuat, String mauSac, int namSanXuat) {
        this.hangSanXuat = hangSanXuat;
        this.mauSac = mauSac;
        this.namSanXuat = namSanXuat;
    }

    public void hienThiThongTin() {
        System.out.println("Hãng: " + hangSanXuat);
        System.out.println("Màu sắc: " + mauSac);
        System.out.println("Năm sản xuất: " + namSanXuat);
    }
}