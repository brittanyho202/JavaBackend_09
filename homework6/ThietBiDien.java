package homework6;

public class ThietBiDien {
	// Question 5:
    protected String tenThietBi;
    protected int congSuat;

    public ThietBiDien(String tenThietBi, int congSuat) {
        this.tenThietBi = tenThietBi;
        this.congSuat = congSuat;
    }

    public void hienThiThongTin() {
        System.out.println("Tên thiết bị: " + tenThietBi);
        System.out.println("Công suất: " + congSuat + "W");
    }
}