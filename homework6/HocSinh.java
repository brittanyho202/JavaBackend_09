package homework6;

public class HocSinh {
	// Question 1:
    private String ten;
    private int tuoi;
    private double[] diemSo;

    public HocSinh(String ten, int tuoi, double[] diemSo) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemSo = diemSo;
    }

    public double tinhDiemTrungBinh() {
        double tong = 0;
        for (double d : diemSo) {
            tong += d;
        }
        return diemSo.length > 0 ? tong / diemSo.length : 0;
    }

    public void inThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.printf("Điểm trung bình: %.2f\n", tinhDiemTrungBinh());
    }
}
