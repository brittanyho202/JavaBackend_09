package homework6;

public class MaySay extends ThietBiDien {
	// Question 5b:
    private String cheDo;

    public MaySay(String tenThietBi, int congSuat, String cheDo) {
        super(tenThietBi, congSuat);
        this.cheDo = cheDo;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chế độ sấy: " + cheDo);
    }
}