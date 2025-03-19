package homeworkJava09;

import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
	static Scanner scanner = new Scanner(System.in);
	/**
	 * Question 1:Xây dựng chương trình trò chơi Oẵn Tù Tì (Kéo, Búa, Bao). Người và máy sẽ chơi với nhau. 
	 * Nhấn một số khác 0 để chơi tiếp, nhấn 0 để dừng. Tính xem ai sẽ là người thắng nhiều nhất và tỉ số là bao nhiêu.
	 */
	public static void oanTuTi() {
		System.out.println("*****Question 1*****\nWelcome to the classic Oan Tu Ti Game!\n");
		
		String instruction = "Kéo - Búa - Bao (còn gọi là Oẳn tù tì) là một trò chơi đơn giản dành cho hai người. "
				+ "\nMỗi người chơi chọn một trong ba ký hiệu: Kéo (K), Búa (U), hoặc Bao (A). "
				+ "\nKết quả sẽ dựa trên quy tắc cố định.\nKéo (K️) thắng Bao (A) (Kéo cắt Bao)\n"
				+ "Búa (U) thắng Kéo (K️) (Búa đập Kéo)\n"
				+ "Bao (A) thắng Búa (U) (Bao bọc Búa)\n"
				+ "Nếu cả hai chọn giống nhau → Hòa\n\n"
				+ "Máy tính chọn ngẫu nhiên một trong ba lựa chọn, so sánh kết quả và thông báo ai thắng.";
		System.out.println(instruction);
		Random random = new Random();
		Hashtable<Integer, Character> map = new Hashtable<Integer, Character>();
		map.put(0, 'K');
		map.put(1, 'U');
		map.put(2, 'A');
		int score = 0;
		
		while(true) {
			int computerSelection = random.nextInt(3); // O - K, 1 - U, 2 - A
			char compSelect = map.get(computerSelection);
			
			System.out.println("To play, press to choose an option: 'K' for Kéo, 'U' for Búa, or 'A' for Bao");
			char userSelect = scanner.nextLine().toUpperCase().charAt(0);
			while (userSelect != 'K' && userSelect != 'U' && userSelect != 'A') {
				System.out.println("Invalid Option. Press: 'K' for Kéo, 'U' for Búa, or 'A' for Bao");
				userSelect = scanner.nextLine().toUpperCase().charAt(0);
			}
			if (userSelect == compSelect) {
				System.out.println("Hoà!");
			} else if (userSelect == 'K' && compSelect == 'A') {
				System.out.println("Thắng! Bạn ra kéo, máy ra bao! Chúc mừng bạn! +1 điểm!");
				score++;
			} else if (userSelect == 'U' && compSelect == 'K') {
				System.out.println("Thắng! Bạn ra búa, máy ra kéo! Chúc mừng bạn! +1 điểm!");
				score++;
			} else if (userSelect == 'A' && compSelect == 'U') {
				System.out.println("Thắng! Bạn ra bao, máy ra búa! Chúc mừng bạn! +1 điểm!");
				score++;
			} else {
				String msg = "Bạn thua rồi! ";
				if (compSelect == 'K') {
					msg += "máy tính ra kéo, bạn ra bao!";
				} else if (compSelect == 'U') {
					msg += "máy tính ra búa, bạn ra kéo!";
				} else if (compSelect == 'A') {
					msg += "máy tính ra bao, bạn ra búa!";
				}
				System.out.println(msg + " -1 điểm");
				score -= 1;
			}
			
			System.out.println("Press 0 to exit, or any other key to play again");
//			scanner.nextLine(); // Clear the buffer /n
			String input = scanner.nextLine();
			if (input.equals("0")) {
				System.out.println("Exiting the game...");
				break;
			} else {
				System.out.println("Playing again!");
			}
		}
		System.out.println("Kết quả cuối cùng là: " + score);
	}

	/**
	 * Question 2: Tìm số nguyên dương n nhỏ nhất sao cho : 1 + 2 + ...+ n > 10000
	 */
	public static int findSmallestN1() {
		// Solution 1: While loop
		int n = 0;
		int remaining = 10000;
		while (remaining >= 0) {
			n++;
			remaining -= n;
		}
		System.out.println("\n*****Question 2*****\nMethod 1: n = " + n);
		return n;	
	}
	
	public static int findSmallestN2() {
		// Solution 2: Math
		// We want n(n+1)/2 > 10000 --> n(n+1) > 20000 --> n^2 + n - 20000 > 0
		// a = 1, b = 1, c = -20000 --> positive root --> (-b + sqrt(b^2 - 4ac))/(2a)
		double a = 1;
		double b = 1;
		double c = -20000;
		int root = (int) Math.ceil((-b + Math.sqrt(b*b - 4*a*c))/(2*a));
		System.out.println("\nMethod 1: n = " + root);
		return root;
			
	}
	
	/**
	 * Question 3: Viết chương trình tính tổng các số lẻ nguyên dương nhỏ hơn n được nhập từ người dùng. 
	 * Chỉ cho nhập số > 0, yêu cầu nhập lại nếu không đúng yêu cầu.
	 */
	public static void sumOddNums() {
		System.out.println("\n*****Question 3*****\nThis program returns the sum of positve odd integers less than n."
				+ "\nFirst, please enter positive integer n: ");
		int n;
		while(true) {
			n = scanner.nextInt();
			if (n > 0) {
				break;
			}
			System.out.println("Invalid input! Please enter positive integer n: ");
		}
		System.out.println("Second, please enter a sequence of 10 positive integers (e.g. 1 10 17 19 999 191 9 19 37 42):");
		int[] seq = new int[10];
		for (int i = 0; i < 10; i++) {
			while(true) {
				System.out.println("Nhập số thứ " + (i+1) + ": ");
				if (scanner.hasNextInt()) {
					int num = scanner.nextInt();
					if (num > 0) {
						seq[i] = num;
						break;
					}
					System.out.println("Error: Invalid Input! Enter **positive** number only!");
				} else {
					System.out.println("Error: Invalid Input! Please enter an integer!");
					scanner.next();
				}
			}
		}
		int oddSum = 0;
		System.out.println("Numbers provided are: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(seq[i] + " ");
			if (seq[i] % 2 == 1 && seq[i] < n) {
				oddSum += seq[i];
			}
		}
		System.out.println(String.format("\nThe sum of positve odd integers less than %d is: %d", n, oddSum));
		
	}
	
	/**
	 * Question 4: Viết chương trình nhập n và tính tổng S(n) = x + x^2 + x^3 + ...+ x^n (Sử dụng vòng lặp + hàm)
	 */
	public static void geometricSeries() {
		System.out.println("\n*****Question 3*****");
		int n;
		System.out.println("First, to compute the geometric series (excluding x^0), enter n: ");
		while(true) {
			n = scanner.nextInt();
			if (n >= 0) {
				break;
			}
			System.out.println("Error: Invalid Input. n must be a non-negative integer! Re-enter n: "); 
		}
		System.out.println("Second, enter x : ");
		double x;
		x = scanner.nextDouble();
		double sum = 0;
		double term = x;
		for (int i = 1; i <= n; i++) {
			sum += Math.pow(term, i);;
		}
		System.out.println("S(n) = " + sum);
	}
	
	/**
	 * Question 5: Chương trình tính và in số năm chờ đợi. Anh X có một số tiền nhàn rỗi. 
	 * Anh đem gởi tiết kiệm số tiền này. Anh X hy vọng rằng đến một lúc nào đó trong tương lai 
	 * anh sẽ có đủ tiền để mua một chiếc ô tô. Cho biết số tiền anh X gửi, số tiền anh X muốn có 
	 * trong tương lai và tiền lãi tiết kiệm. Hãy viết chương trình tính số năm ít nhất mà anh X 
	 * phải chờ đợi kể từ năm gởi tiền. Giả sử lãi suất tiết kiệm không đổi, anh X không 
	 * rút bớt tiền và cũng không gởi thêm tiền trong thời gian chờ đợi.
	 */
	public static void compoundInterest() {
		// Get user inputs
        System.out.print("\n*****Question 5*****\nEnter the initial savings amount (P): ");
        double P;
        while (true) {
        	P = scanner.nextDouble();
        	if (P > 0) {
        		break;
        	}
        	System.out.println("Error: Cannot open a savings account with non-positive number! Please enter initial savings amount (P) again: ");
        }

        System.out.print("Enter the target amount (A): ");
        double A;
        while(true) {
        	A = scanner.nextDouble();
        	if (A > P) {
        		break;
        	}
        	System.out.println("Error: Target amount must be greater than initial savings. Please re-enter the target amount: ");
        }

        System.out.print("Enter the annual interest rate (as %): ");
        double r;
        while (true) {
        	r = scanner.nextDouble() / 100; // Convert percentage to decimal
        	if (r > 0) {
        		break;
        	}
        	System.out.println("Error: Interest rate must be greater than 0. Please re-enter valid interest rate: ");
        }

        // Calculate the number of years using logarithm formula
        int years = (int) Math.ceil(Math.log(A / P) / Math.log(1 + r));

        // Display result
        System.out.println(String.format("Anh X needs to wait at least %d years to reach his target amount "
        		+ "of %f from the initial savings amount of %f and interest rate of %.2f%%", years, A, P, r*100));
        
	}


	public static void main(String[] args) {
		// Question 1:
		oanTuTi();
		// Question 2:
		findSmallestN1();
		findSmallestN2();
		// Question 3:
		sumOddNums();
		// Question 4:
		geometricSeries();
		// Question 5:
		compoundInterest();
	}

}
