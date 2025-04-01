package homework6;

public class XeHoi {
	// Question 2:
    private String hangSanXuat;
    private String mauSac;
    private int namSanXuat;

    public XeHoi(String hangSanXuat, String mauSac, int namSanXuat) {
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
