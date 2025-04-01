package homework6;

public class DieuHoa extends ThietBiDien {
	// Question 5a:
    private boolean lamLanh;
    private boolean lamNong;

    public DieuHoa(String tenThietBi, int congSuat, boolean lamLanh, boolean lamNong) {
        super(tenThietBi, congSuat);
        this.lamLanh = lamLanh;
        this.lamNong = lamNong;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chức năng: " + (lamLanh ? "Làm lạnh " : "") + (lamNong ? "Làm nóng" : ""));
    }
}