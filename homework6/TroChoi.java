package homework6;

public class TroChoi {
	// Question 3:
    private String tenTroChoi;
    private int soLuotChoi;

    public TroChoi(String tenTroChoi) {
        this.tenTroChoi = tenTroChoi;
        this.soLuotChoi = 0;
    }

    public void batDau() {
        System.out.println("Bắt đầu trò chơi: " + tenTroChoi);
        soLuotChoi++;
    }

    public void ketThuc() {
        System.out.println("Kết thúc trò chơi: " + tenTroChoi);
    }

    public void hienThiSoLuotChoi() {
        System.out.println("Số lượt chơi: " + soLuotChoi);
    }
}
