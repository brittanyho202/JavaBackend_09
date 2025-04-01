package homeworkJava09;

import java.util.Scanner;

public class Homework5_Student {
    private String name;
    private String studentId;
    private double math;
    private double physics;
    private double chemistry;

    public Homework5_Student(String name, String studentId, double math, double physics, double chemistry) {
        this.name = name;
        this.studentId = studentId;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public double calculateAverage() {
        return (math + physics + chemistry) / 3;
    }

    public String classify() {
        double avg = calculateAverage();
        if (avg >= 9) return "Xuất Sắc";
        else if (avg >= 8) return "Giỏi";
        else if (avg >= 7) return "Khá";
        else if (avg >= 6) return "TB Khá";
        else if (avg >= 5) return "Trung Bình";
        else return "Yếu";
    }

    public void displayInfo() {
        System.out.println("=== Thông Tin Sinh Viên ===");
        System.out.println("Họ Tên: " + name);
        System.out.println("Mã SV: " + studentId);
        System.out.printf("Điểm TB: %.2f\n", calculateAverage());
        System.out.println("Xếp loại: " + classify());
    }

    public static double inputScore(Scanner scanner, String subject) {
        double score;
        do {
            System.out.print("Nhập điểm " + subject + " (0-10): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Vui lòng nhập số!");
                scanner.next(); // clear buffer
            }
            score = scanner.nextDouble();
            if (score < 0 || score > 10) {
                System.out.println("Điểm phải từ 0 đến 10.");
            }
        } while (score < 0 || score > 10);
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập mã sinh viên: ");
        String studentId = scanner.nextLine();

        double math = inputScore(scanner, "Toán");
        double physics = inputScore(scanner, "Lý");
        double chemistry = inputScore(scanner, "Hóa");

        Homework5_Student student = new Homework5_Student(name, studentId, math, physics, chemistry);
        student.displayInfo();

        scanner.close();
    }
}
